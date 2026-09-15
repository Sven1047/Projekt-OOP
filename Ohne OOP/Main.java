import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("starting up Game Skeleton (2-Player)");
        System.out.println("Game started... waiting for players...");

        Scanner scanner = new Scanner(System.in);

        // Spieler-Namen abfragen
        System.out.println("Player 0 enter your name:");
        String player1 = scanner.nextLine();

        System.out.println("Player 1 enter your name:");
        String player2 = scanner.nextLine();

        int score1 = 0;
        int score2 = 0;

        System.out.println("Starting Game");
        System.out.println("Player 1:" + player1);
        System.out.println("Player 2:" + player2);

        // 3 Runden spielen
        for (int round = 0; round < 3; round++) {
            System.out.println("We are playing round: " + round);
            System.out.println("Starting a new round between " + player1 + " and " + player2);

            String winner = null;
            String bet1 = "";
            String bet2 = "";

            // Schleife läuft, bis es keinen Gleichstand gibt
            while (winner == null) {
                // Zug Spieler 1
                bet1 = "";
                while (!bet1.equals("scissors") && !bet1.equals("rock") && !bet1.equals("paper")) {
                    System.out.println(player1 + ", please enter your bet:");
                    bet1 = scanner.nextLine();
                    if (bet1.equals("scissors")) {
                        System.out.println(player1 + " has chosen scissors.");
                    } else if (bet1.equals("rock")) {
                        System.out.println(player1 + " has chosen rock.");
                    } else if (bet1.equals("paper")) {
                        System.out.println(player1 + " has chosen paper.");
                    } else {
                        System.out.println("Invalid bet. Please enter 'scissors', 'rock', or 'paper'.");
                    }
                }

                // Zug Spieler 2
                bet2 = "";
                while (!bet2.equals("scissors") && !bet2.equals("rock") && !bet2.equals("paper")) {
                    System.out.println(player2 + ", please enter your bet:");
                    bet2 = scanner.nextLine();
                    if (bet2.equals("scissors")) {
                        System.out.println(player2 + " has chosen scissors.");
                    } else if (bet2.equals("rock")) {
                        System.out.println(player2 + " has chosen rock.");
                    } else if (bet2.equals("paper")) {
                        System.out.println(player2 + " has chosen paper.");
                    } else {
                        System.out.println("Invalid bet. Please enter 'scissors', 'rock', or 'paper'.");
                    }
                }

                // Gewinner der Runde ermitteln
                if (bet1.equals(bet2)) {
                    winner = null;
                } else if ((bet1.equals("rock") && bet2.equals("scissors")) ||
                           (bet1.equals("paper") && bet2.equals("rock")) ||
                           (bet1.equals("scissors") && bet2.equals("paper"))) {
                    winner = player1;
                } else {
                    winner = player2;
                }

                // Punktestand aktualisieren und Ausgabe
                if (winner != null && winner.equals(player1)) {
                    score1++;
                    System.out.println(player1 + " wins the round with " + bet1 + " against " + player2 + "'s " + bet2 + " and now has a score of " + score1);
                } else if (winner != null && winner.equals(player2)) {
                    score2++;
                    System.out.println(player2 + " wins the round with " + bet2 + " against " + player1 + "'s " + bet1 + " and now has a score of " + score2);
                } else {
                    System.out.println("It's a tie!");
                }
            }
        }

        System.out.println("Game is over");
        System.out.println("Final Scores:");
        System.out.println(player1 + ": " + score1);
        System.out.println(player2 + ": " + score2);
        System.out.println("Game ended.");

        scanner.close();
    }
}