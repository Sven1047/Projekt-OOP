public class Board {
    private int rows;
    private int cols;
    private char[][] grid;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new char[rows][cols];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = '~';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("+---");
            }
            System.out.println("+");

            for (int j = 0; j < cols; j++) {
                System.out.print("| " + grid[i][j] + " ");
            }
            System.out.println("|");
        }

        for (int j = 0; j < cols; j++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }

    public void setShip(int row, int col) {
        grid[row][col] = '\u25A0';
    }

    public boolean isShipAt(int x, int y){
        if (grid[x][y] == '\u25A0'){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isGameOver() {
        // Logic to determine if the game is over
        return false; // Placeholder
    }
}