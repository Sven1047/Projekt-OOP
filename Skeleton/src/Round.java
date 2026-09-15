public class Round {
    private Player player1;
    private Player player2;
    private Player winner;

    private Symbol bet1;
    private Symbol bet2;

    // This generates the round with the two players 
    public Round(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        System.out.println("Starting a new round between " + player1 + " and " + player2);
    }

    // This method will ask both players for their bets and store them in bet1 and bet2 and store the winner in variable winner. 
    public void playRound() {
        while(winner == null) {
            this.bet1 = player1.askForBet();
            this.bet2 = player2.askForBet();
            determineWinner();
            if(this.winner == player1) {
                int newscore = player1.getScore() + 1;
                player1.setScore(newscore);
                System.out.println(player1 + " wins the round with " + bet1 + " against " + player2 + "'s " + bet2 +  " and now has a score of " + newscore);
            } else if(this.winner == player2) {
                int newscore = player2.getScore() + 1;
                player2.setScore(newscore);
                System.out.println(player2 + " wins the round with " + bet2 + " against " + player1 + "'s " + bet1 + " and now has a score of " + newscore);
            }
            else {
                System.out.println("It's a tie!");
                this.winner = null;
            }
        }
    }

    public Player getWinner() {
        return this.winner;
    }

    // This method will determine the winner of the round based on the bets and return the winning player
    public void determineWinner() {
        if (bet1.getClass() == bet2.getClass() ) {
            this.winner=null;
        } 
        else if ((bet1 instanceof Rock && bet2 instanceof Scissors) ||
                   (bet1 instanceof Paper && bet2 instanceof Rock) ||
                   (bet1 instanceof Scissors && bet2 instanceof Paper)) {
            this.winner=player1; 
        } else {
            this.winner=player2; // Player 2 wins
        }
    }
}
