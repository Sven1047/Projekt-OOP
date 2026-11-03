public class Game {
    public void startGame(Player player1, Player player2, Board board1, Board board2) {
        while (!board1.isGameOver() && !board2.isGameOver()) {
            player1.takeTurn(board2);
            if (board2.isGameOver()) {
                System.out.println(player1.getName() + " wins!");
                break;
            }

            player2.takeTurn(board1);
            if (board1.isGameOver()) {
                System.out.println(player2.getName() + " wins!");
                break;
            }
        }
    }
}
