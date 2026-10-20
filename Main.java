public class Main {
    public static void main(String[] args) {
        Board board1 = new Board(5,5);
        Board board2 = new Board(5,5);

        Player player1 = new Player();
        Player player2 = new Player();

        player1.setupShips(board1);
        player2.setupShips(board1);

        while (!board.isGameOver()) {
            player1.takeTurn(board2);
            if (board.isGameOver()) {
                System.out.println("Player 1 wins!");
                break;
            }

            player2.takeTurn(board);
            if (board.isGameOver()) {
                System.out.println("Player 2 wins!");
                break;
            }
        }
    }
}
