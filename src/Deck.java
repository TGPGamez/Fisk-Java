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
				returnList.add(new Card(j + 1));
			}
		}
		Collections.shuffle(returnList);
		return returnList;
	}
	
	public String CheckCardDesc(int value) {
		String returnInt = "";
		switch(value) {
			case 1:
				returnInt = "Ace";
				break;
			case 2:
				returnInt = "2";
				break;
			case 3:
				returnInt = "3";
				break;
			case 4:
				returnInt = "4";
				break;
			case 5:
				returnInt = "5";
				break;
			case 6:
				returnInt = "6";
				break;
			case 7:
				returnInt = "7";
				break;
			case 8:
				returnInt = "8";
				break;
			case 9:
				returnInt = "9";
				break;
			case 10:
				returnInt = "10";
				break;
			case 11:
				returnInt = "Jack";
				break;
			case 12:
				returnInt = "Queen";
				break;
			case 13:
				returnInt = "King";
				break;
		}
		return returnInt;
	}
	
	public String CheckCardDesc(Card card) {
		String returnInt = "";
		switch(card.getNumber()) {
			case 1:
				returnInt = "Ace";
				break;
			case 2:
				returnInt = "2";
				break;
			case 3:
				returnInt = "3";
				break;
			case 4:
				returnInt = "4";
				break;
			case 5:
				returnInt = "5";
				break;
			case 6:
				returnInt = "6";
				break;
			case 7:
				returnInt = "7";
				break;
			case 8:
				returnInt = "8";
				break;
			case 9:
				returnInt = "9";
				break;
			case 10:
				returnInt = "10";
				break;
			case 11:
				returnInt = "Jack";
				break;
			case 12:
				returnInt = "Queen";
				break;
			case 13:
				returnInt = "King";
				break;
		}
		return returnInt;
	}
	
}
