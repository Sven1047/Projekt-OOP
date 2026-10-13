public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        
        Player player1 = new Player();
        Player player2 = new Player();

        player1.setupShips();
        player2.setupShips();

        while (!board.isGameOver()) {
            player1.takeTurn(board);
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
