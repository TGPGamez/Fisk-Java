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
		
		System.out.println("1. Take a card from table");
		System.out.println("2. Take a card from a player");
		System.out.print("Make your choice: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch(choice) {
			case 1:
				takeCardFromTable(player);
				break;
			case 2:
				takeCardFromPlayer();
				break;
		}
	}
	
	private static void takeCardFromTable(Player player) {
		player.addCard(game.getDeck().getDeckCards().get(0));
		System.out.println("Du fik kortet " + game.getDeck().CheckCardDesc(game.getDeck().getDeckCards().get(0)));
		game.checkPlugs(player);
		game.getDeck().getDeckCards().remove(0);
		game.setTurn(game.getTurn() + 1);
	}
	
	private static void takeCardFromPlayer() {
		System.out.println("\nChoose player to pick from: ");
		for(int i = 0; i < game.getPlayers().size(); i++) {
			if(game.getPlayers().get(game.getTurn()) != game.getPlayers().get(i)) {				
				System.out.println(i + ". " + game.getPlayers().get(i).getName());
			}
		}
		System.out.print("Make your choice: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
	}
	
	
	
	
	
	
	
	
	
	private static int playerAmount() {
		int amount = 0;
		do {
			@SuppressWarnings("resource")
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
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
			players[i] = name;
		}
		return players;
	}

}
