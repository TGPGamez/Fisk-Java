
public class Card {
	private int number;
	public int getNumber( ) {
		return number;
	}
	
	private CardTypes type;
	public CardTypes getType() {
		return type;
	}
	
	public Card(int numb, CardTypes cardType) {
		this.number = numb;
		this.type = cardType;
	}
	
}
