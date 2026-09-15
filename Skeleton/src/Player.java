import java.util.Scanner;

public class Player {
	private String name;
	private Scanner scanner;
	private int score;

	public Player() {
		this.scanner = new Scanner(System.in);
		this.score = 0;
	}
	
	public void askForName() {
		this.name = this.scanner.nextLine();
	}
	
	public Symbol askForBet() {
		String bet = "";
		while(!bet.equals("scissors") && !bet.equals("rock") && !bet.equals("paper")) {
			System.out.println(this.name + ", please enter your bet:");
			bet = this.scanner.nextLine();
			if (bet.equals("scissors")) {
				System.out.println(this.name + " has chosen scissors.");
				Scissors scissors = new Scissors();
				return scissors;
			} else if (bet.equals("rock")) {
				System.out.println(this.name + " has chosen rock.");
				Rock rock = new Rock();
				return rock;
			} else if (bet.equals("paper")) {
				System.out.println(this.name + " has chosen paper.");
				Paper paper = new Paper();
				return paper;
			} else {
				System.out.println("Invalid bet. Please enter 'scissors', 'rock', or 'paper'.");
			}
		}
		return null; // This line will never be reached
	}

	public String toString() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
