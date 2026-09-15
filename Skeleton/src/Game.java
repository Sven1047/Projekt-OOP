import java.util.ArrayList;

public class Game {
	
	// class variables
	private ArrayList<Player> players;
	
	public Game() {
		System.out.println("Game started... waiting for players...");
		this.players = new ArrayList<Player>();
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
	}
	
	public void runGame() {
		System.out.println("Starting Game");
		for (int i = 0; i < this.players.size(); i++) {
			Player p = this.players.get(i);
			System.out.println("Player " + i + " enter your name:");
			p.askForName();
		}

		Player firstPlayer = this.players.get(0);
		Player secondPlayer = this.players.get(1);
		
		System.out.println("Player 1:" + firstPlayer);
		System.out.println("Player 1:" + secondPlayer);
		
		for(int round=0; round<3; round++) {
			System.out.println("We are playing round: " + round);
			Round rnd = new Round(firstPlayer, secondPlayer);
			rnd.playRound();
		}

		System.out.println("Game is over");
		System.out.println("Final Scores:");
		System.out.println(firstPlayer + ": " + firstPlayer.getScore());
		System.out.println(secondPlayer + ": " + secondPlayer.getScore());
	}
}
