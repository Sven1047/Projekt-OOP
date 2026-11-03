import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Board board1 = new Board(10,10);
        Board board2 = new Board(10,10);

        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner);
        Player player2 = new Player(scanner);

        board1.printBoard();
        player1.setupShips(board1);
        board2.printBoard();
        player2.setupShips(board2);

        game.startGame(player1, player2, board1, board2);
    }
}
