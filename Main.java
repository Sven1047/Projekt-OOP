import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board1 = new Board(10,10);
        Board board2 = new Board(10,10);

        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner);
        Player player2 = new Player(scanner);

        board1.printBoard();
        player1.setupShips(board1);
        board2.printBoard();
        player2.setupShips(board2);

        while (!board1.isGameOver() && !board2.isGameOver()) {
            player1.takeTurn(board2);
            if (board2.isGameOver()) {
                System.out.println("Player 1 wins!");
                break;
            }

            player2.takeTurn(board1);
            if (board1.isGameOver()) {
                System.out.println("Player 2 wins!");
                break;
            }
        }
    }
}
