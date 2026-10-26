import java.util.Scanner;

public class Player {
    private String name;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
    }

    public void setupShips(Board board) {
        // Logic to set up ships on the board
        System.out.println(name + ", set up your ships.");
        
        Ship Destroyer1 = new Ship(board,"Destroyer1", 2);
        Ship Destroyer2 = new Ship(board,"Destroyer2", 2);
        Ship Destroyer3 = new Ship(board, "Destroyer3", 2);
        Ship Destroyer4 = new Ship(board, "Destroyer4", 2);


        Ship Submarine1 = new Ship(board, "Submarine1", 3);
        Ship Submarine2 = new Ship(board, "Submarine2", 3);
        Ship Submarine3 = new Ship(board,"Submarine3", 3);

        Ship Battle1 = new Ship(board,"Battle1", 4);
        Ship Battle2 = new Ship(board,"Battle2", 4);

        Ship Carrier = new Ship(board,"Carrier", 5);
        
    }

    public void takeTurn(Board board){
        Scanner scanner = new Scanner(System.in);
        boolean hit = true;
        while (hit) {
            board.printShotBoard();
            System.out.println(name + ", where do you want to shoot? Enter row and column.");
            int shot_x = scanner.nextInt();
            int shot_y = scanner.nextInt();
            while (!board.canShootAt(shot_x, shot_y)) {
                System.out.println("Invalid or already-used coordinates. Enter row and column again:");
                shot_x = scanner.nextInt();
                shot_y = scanner.nextInt();
            }

            hit = board.shootAt(shot_x, shot_y);
            if (hit) {
                if (board.isGameOver()) {
                    System.out.println("Hit! All ships have been sunk.");
                    break;
                }
                System.out.println("Hit! You may shoot again.");
            } else {
                System.out.println("No Hit");
            }
        }
    }
}