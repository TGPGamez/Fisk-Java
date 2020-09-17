import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck;
	public List<Card> getDeckCards() {
		return deck;
	}
	
	public Deck() {
		this.deck = makeDeck();
	}
	
	private List<Card> makeDeck() {
		List<Card> returnList = new ArrayList<Card>();
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				returnList.add(new Card((j + 1), CardTypes.values()[i]));
			}
		}
		Collections.shuffle(returnList);
		return returnList;
	}	
}
