public class Board {
    private int rows;
    private int cols;
    private char[][] grid;
    private char[][] shots;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new char[rows][cols];
        this.shots = new char[rows][cols];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = '~';
                shots[i][j] = '~';
            }
        }
    }

    public void printBoard() {
        printGrid(grid);
    }

    public void printShotBoard() {
        printGrid(shots);
    }

    private void printGrid(char[][] boardGrid) {
        System.out.print("    ");
        for (int j = 0; j < cols; j++) {
            System.out.printf("%3d", j);
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.printf("%3d ", i);
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3c", boardGrid[i][j]);
            }
            System.out.printf(" %d%n", i);
        }

        System.out.print("    ");
        for (int j = 0; j < cols; j++) {
            System.out.printf("%3d", j);
        }
        System.out.println();
    }

    public boolean placeShip(int row, int col, int length, boolean horizontal) {
        if (length <= 0 || row < 0 || row >= rows || col < 0 || col >= cols) {
            return false;
        }

        if (horizontal && col + length > cols || !horizontal && row + length > rows) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            int shipRow = horizontal ? row : row + i;
            int shipCol = horizontal ? col + i : col;
            if (isShipAt(shipRow, shipCol)) {
                return false;
            }
        }

        for (int i = 0; i < length; i++) {
            int shipRow = horizontal ? row : row + i;
            int shipCol = horizontal ? col + i : col;
            grid[shipRow][shipCol] = '\u25A0';
        }
        return true;
    }

    public boolean isShipAt(int x, int y){
        if (grid[x][y] == '\u25A0'){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean canShootAt(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols && shots[row][col] == '~';
    }

    public boolean shootAt(int row, int col) {
        if (!canShootAt(row, col)) {
            throw new IllegalArgumentException("Invalid or previously used coordinates.");
        }

        boolean hit = isShipAt(row, col);
        shots[row][col] = hit ? 'X' : 'o';
        return hit;
    }

    public boolean isGameOver() {
        boolean hasShips = false;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (isShipAt(row, col)) {
                    hasShips = true;
                    if (shots[row][col] != 'X') {
                        return false;
                    }
                }
            }
        }
        return hasShips;
    }
}