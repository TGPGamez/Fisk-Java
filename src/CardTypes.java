public enum CardTypes {
	Spades("Spades"),
	Hearts("Hearts"),
	Diamonds("Diamonds"),
	Clubs("Clubs");
	
	private String typeDesc;
	
	private CardTypes(String value) {
		this.typeDesc = value;
	}
	
	public String getDesc() {
		return typeDesc;
	}
	
	@Override
	public String toString() {
		return this.getDesc();
	}
}
