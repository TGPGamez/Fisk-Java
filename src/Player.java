import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	public String getName() {
		return name;
	}
	
	private boolean guessedRight;
	public boolean getGuessedRight() {
		return guessedRight;
	}
	
	public void setGuessedRight(boolean value) {
		guessedRight = value;
	}
	
	public Card getCard(int indexValue) {
		return cards.get(indexValue);
	}
	
	private List<Card> cards;
	public List<Card> getPlayerCards() {
		return cards;
	}
	
	
	public Player(String playerName) {
		this.name = playerName;
		this.cards = new ArrayList<>();
		this.guessedRight = false;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
}
