import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	public String getName() {
		return name;
	}
	
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	public Card getCard(int indexValue) {
		return cards.get(indexValue);
	}
	
	private List<Card> cards;
	public List<Card> getPlayerCards() {
		return cards;
	}
	
	public void setCards(int value1, int value2, int value3, int value4, int value5, int value6, int value7) {
		cards.clear();
		cards.add(new Card(value1));
		cards.add(new Card(value2));
		cards.add(new Card(value3));
		cards.add(new Card(value4));
		cards.add(new Card(value5));
		cards.add(new Card(value6));
		cards.add(new Card(value7));
		
	}
	
	
	public Player(String playerName) {
		this.name = playerName;
		this.cards = new ArrayList<>();
	}
}
