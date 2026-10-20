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
    public boolean isAlreadyShipHere(Board board, int x, int y) {
        return board.isShipAt(x, y);
    }
    public Board setupShips(Board board) {
        // Logic to set up ships on the board
        System.out.println(name + ", set up your ships.");
        
        Ship Destroyer1 = new Ship("Destroyer1", 2, true);
        Ship Destroyer2 = new Ship("Destroyer2", 2, true);
        Ship Destroyer3 = new Ship("Destroyer3", 2, true);
        Ship Destroyer4 = new Ship("Destroyer4", 2, true);


        Ship Submarine1 = new Ship("Submarine1", 3, true);
        Ship Submarine2 = new Ship("Submarine2", 3, true);
        Ship Submarine3 = new Ship("Submarine3", 3, true);

        Ship Battle1 = new Ship("Battle1", 4, true);
        Ship Battle2 = new Ship("Battle2", 4, true);

        Ship Carrier = new Ship("Carrier", 5, true);
        
        return board;
    }

    public void takeTurn(Board board){
        
    }
}