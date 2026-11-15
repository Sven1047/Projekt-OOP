import java.util.InputMismatchException;
import java.util.Scanner;

public class Ship {
    private int Length;
    private int x_coordinate;
    private int y_coordinate;
    private boolean horizontal;
    private String name;  
    private boolean validCoordinates;
 
    public Ship(Board board, String name, int length) {
        Scanner scanner = new Scanner(System.in);
        this.name = name;
        this.Length = length;
        System.out.println("Enter the starting coordinates and orientation (horizontal: true/false) for " + name +":");
        while (true) {
            try {
                this.x_coordinate = scanner.nextInt();
                this.y_coordinate = scanner.nextInt();
                this.horizontal = scanner.nextBoolean();
                if (setShip(board)) {
                    break;
                }
                board.printBoard();
                System.out.println("Invalid or occupied coordinates. Enter new coordinates and orientation for " + name + ":");
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid input. Enter the coordinates and orientation again:");
            }
        }
        board.printBoard();
    }

    public boolean setShip(Board board) {
        return board.placeShip(x_coordinate, y_coordinate, Length, horizontal, name);
    }

}
 