import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private int turn;
	public int getTurn() {
		return turn;
	}
	public void setTurn(int value) {
		turn = value;
	}
	
	private List<Player> players;
	public List<Player> getPlayers() {
		return players;
	}
	
	private Deck gameDeck;
	public Deck getDeck() {
		return gameDeck;
	}
	
	public Game(String[] playerArray) {
		
		gameDeck = new Deck();
		this.players = makePlayers(playerArray);
		this.turn = 0;
		
		int amount = 7;
		if(playerArray.length > 3)
			amount = 5;
		givecardsToPlayers(amount);
		for(int p = 0; p < players.size(); p++) {
			checkPlugs(players.get(p));
		}
	}
	
	private List<Player> makePlayers(String[] players) {
		List<Player> toReturn = new ArrayList<Player>();
		for(int i = 0; i < players.length; i++) {
			toReturn.add(new Player(players[i]));
		}
		return toReturn;
	}
	
	private void givecardsToPlayers(int cardAmount) {
		for(int i = 0; i < cardAmount; i++) {
			for(int j = 0; j < players.size(); j++) {
				players.get(j).addCard(gameDeck.getDeckCards().get(0));
				gameDeck.getDeckCards().remove(0);
			}
		}
	}
	
	public void checkPlugs(Player player) {
		for(int i = 0; i < player.getPlayerCards().size(); i++) {
			int check = 0;
			for(int j = 0; j < player.getPlayerCards().size(); j++) {
				if(player.getPlayerCards().get(i).getNumber() == player.getPlayerCards().get(j).getNumber()) {
					check++;
				}
				else {
				}
			}
			if(check == 4) {
				System.out.println(player.getName() + " had a pair with " + player.getPlayerCards().get(i).getNumber());
				removePlug(player, player.getPlayerCards().get(i).getNumber());
				check = 0;
			}
		}
	}
	
	private void removePlug(Player player, int value) {
		for(int i = player.getPlayerCards().size() - 1; i >= 0; i--) {
			if(player.getPlayerCards().get(i).getNumber() == value) {
				player.getPlayerCards().remove(i);
			}
		}
	}
	
	
}
