import java.util.Scanner;

public class Player {
    private String name;
    private int score;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
        this.score = 0;
    }

    public Board setupShips(Board board) {
        // Logic to set up ships on the board
        System.out.println(name + ", set up your ships.");

        Board
        
        Ship Destroyer = new Ship("Destroyer", 2, 0, 0, true);
        Ship Submarine = new Ship("Submarine", 3, 0, 0, true);
        
        return board;
    }
}