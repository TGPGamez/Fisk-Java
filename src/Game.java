import java.util.ArrayList;
import java.util.List;

public class Game extends CardConverter {
	
	private int turn;
	public int getTurn() {
		return turn;
	}
	public void setTurn(int value) {
		if (turn < players.size() - 1) {
			turn = value;
		}
		else {			
			turn = 0;
		}
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
		giveCardsToPlayers(amount);
		for(int p = 0; p < players.size(); p++) {
			removePlayerSet(players.get(p));
		}
	}
	
	private List<Player> makePlayers(String[] players) {
		List<Player> toReturn = new ArrayList<Player>();
		for(int i = 0; i < players.length; i++) {
			toReturn.add(new Player(players[i]));
		}
		return toReturn;
	}
	
	private void giveCardsToPlayers(int cardAmount) {
		for(int i = 0; i < players.size(); i++) {
			for(int j = 0; j < cardAmount; j++) {
				players.get(i).addCard(gameDeck.getDeckCards().get(0));
				gameDeck.getDeckCards().remove(0);
			}
		}
	}

	
	public String removePlayerSet(Player player) {
		for(int i = 0; i < player.getPlayerCards().size(); i++) {
			if(checkForSet(player, i)) {
				removeSet(player, i);
				return player.getName() + "had a set with " + checkCardDesc(player.getCard(i).getNumber());
			}
		}
		return player.getName() + " had no set";
	}
	
	public boolean checkForSet(Player player, int value) {
		int isSet = 0;
		for(int i = 0; i < player.getPlayerCards().size(); i++) {
			if(player.getPlayerCards().get(value).getNumber() == player.getPlayerCards().get(i).getNumber()) {
				isSet++;
			}
		}
		if(isSet == 4)
			return true;
		else
			return false;
	}
	
	private void removeSet(Player player, int value) {
		for(int i = player.getPlayerCards().size() - 1; i >= 0; i--) {
			if(player.getCard(i).getNumber() == value) {
				player.getPlayerCards().remove(i);
			}
		}
	}
	
	

	public String checkPlayerForCard(Player checkPlayer, int value) {
		int hasCard = checkForCard(checkPlayer, value);
		if(hasCard > 0) {
			playerHadCard(checkPlayer, players.get(turn), value);
			return checkPlayer.getName() + " had " + hasCard + " of " + checkCardDesc(value);
		}
		else 
		{
			return checkPlayer.getName() + " didn't have the card " + checkCardDesc(value) 
			+ "\nYou got the card " + playerNoCard(); 
		}
	}
	
	private int checkForCard(Player checkPlayer, int value) {
		int amount = 0;
		for(int i = checkPlayer.getPlayerCards().size() - 1; i >= 0; i--) {
			if(checkPlayer.getCard(i).getNumber() == value) {
				amount++;
			}
		}
		return amount;
	}
	
	private void playerHadCard(Player fromPlayer, Player toPlayer, int value) {
		players.get(turn).setGuessedRight(true);
		for(int i = fromPlayer.getPlayerCards().size() - 1; i >= 0 ; i--) {
			if(fromPlayer.getCard(i).getNumber() == value) {
				toPlayer.addCard(fromPlayer.getCard(i));
				fromPlayer.getPlayerCards().remove(i);
			}
		}
	}
	
	private String playerNoCard() {
		players.get(turn).setGuessedRight(false);
		if (gameDeck.getDeckCards().size() > 0) {
			players.get(turn).addCard(gameDeck.getDeckCards().get(0));
			gameDeck.getDeckCards().remove(0);
			return "You drew the card " + players.get(turn).getCard(players.get(turn).getPlayerCards().size() - 1).getType().getDesc() + "-" + checkCardDesc(players.get(turn).getCard(players.get(turn).getPlayerCards().size() - 1));
		}
		else {
			return "There isn't any more cards on the table";
		}
	}
	
	
	public String drawPlayerCards(Player player) {
		String tempString = "";
		for(int i = 0; i < player.getPlayerCards().size(); i++) {
			tempString = tempString + player.getCard(i).getType().getDesc() + "-" + player.getCard(i).getNumber() + " : ";
		}
		return tempString;
	}
	
}
