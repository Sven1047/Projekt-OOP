public class Main {
    public static void main(String[] args) {
        System.out.println("starting up Game Skeleton (2-Player)");
        Game game = new Game();
        Player firstPlayer = new Player();
        Player secondPlayer = new Player();
        game.addPlayer(firstPlayer);
        game.addPlayer(secondPlayer);
        game.runGame();
        System.out.println("Game ended.");
    }
}