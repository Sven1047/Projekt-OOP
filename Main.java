public class Main {
    public static void main(String[] args) {
        Board board1 = new Board(5,5);
        Board board2 = new Board(5,5);

        board1.printBoard();

        Player player1 = new Player();
        Player player2 = new Player();

        player1.setupShips(board1);
        player2.setupShips(board2);

        while (!board1.isGameOver() && !board2.isGameOver()) {
            player1.takeTurn(board2);
            if (board1.isGameOver()) {
                System.out.println("Player 1 wins!");
                break;
            }

            player2.takeTurn(board1);
            if (board2.isGameOver()) {
                System.out.println("Player 2 wins!");
                break;
            }
        }
    }
}
