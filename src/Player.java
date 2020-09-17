import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	public String getName() {
		return name;
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
	}
	
	public void addCard(Card card) {
		this.cards.add(card);
	}
}
