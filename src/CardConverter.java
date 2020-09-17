
public class CardConverter {
	
	
	public String checkCardDesc(int value) {
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
	
	public String checkCardDesc(Card card) {
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
