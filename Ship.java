import java.util.Scanner;

public class Ship {
    private int Length;
    private int x_coordinate;
    private int y_coordinate;
    private boolean horizontal;
    private String name;  
    private boolean validCoordinates;
 
    public Ship(String name, int length, boolean horizontal) {
        Scanner scanner = new Scanner(System.in);
        this.name = name;
        this.Length = length;
        System.out.println("Enter the starting coordinates for " + name +":");
        this.x_coordinate = scanner.nextInt(10);
        this.y_coordinate = scanner.nextInt(10);
        this.horizontal = horizontal;
    }

    public void setShip(Board board) {
        if (horizontal) {
            for (int i = 0; i < Length; i++) {
                board.setShip(x_coordinate, y_coordinate + i);
            }
        } else {
            for (int i = 0; i < Length; i++) {
                board.setShip(x_coordinate + i, y_coordinate);
            }
        }

    }
    public int getLength() {
        return Length;
    }

    public int getX() {
        return x_coordinate;
    }

    public int getY() {
        return y_coordinate;
    }

    public boolean isHorizontal() {
        return horizontal;
    }
}
 