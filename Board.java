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
                grid[i][j] = '~'; // Water
            }
        }
    }

    private void setShip(int row, int col, char shipSymbol) {
        grid[row][col] = shipSymbol;
    }

    public boolean isGameOver() {
        // Logic to determine if the game is over
        return false; // Placeholder
    }
}