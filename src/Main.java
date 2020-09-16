import java.util.Scanner;

public class Main {

	private static Game game;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startGame();	
	}
	
	
	
	private static void startGame() {
		game = new Game(playerToStringArray());
		drawPlayerTurn(game.getPlayers().get(game.getTurn()));
	}
	
	
	private static void drawPlayerTurn(Player player) {
		System.out.println("It is " + player.getName() + "'s turn\n");
		
		System.out.print("Choose your choise: ");
	}
	
	
	
	
	
	
	
	
	
	private static int playerAmount() {
		int amount = 0;
		do {
			Scanner in = new Scanner(System.in);
			System.out.print("How many players will be playing (2-6): ");
			try {
				int checkNumb = in.nextInt();
				if(checkNumb >= 2) {
					amount = checkNumb;
				}
				else {
					System.out.println("\nYou need to write a number between 2 and 6");
				}
			} catch (Exception ex) {
				System.out.println("\nYou can't write a letter here");
			}
		} while(amount < 2);
		return amount;
	}
	
	private static String[] playerToStringArray() {
		String[] players = new String[playerAmount()];
		for(int i = 0; i < players.length; i++) {
			System.out.print("Write player " + (i + 1) + " name: ");
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
			players[i] = name;
		}
		return players;
	}

}
