
public class Card {
	private int number;
	public int getNumber( ) {
		return number;
	}
	
	public Card(int numb) {
		this.number = numb;
	}
	
	public String CheckDesc(Card card) {
		String returnInt;
		switch(card.number) {
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
		}
	}
	
	
}
