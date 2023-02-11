package warProject;

public class Card {
	private int value;
	private String name;
	private String suit;
	
	//basic card implementation
	public Card (String name, String suit, int value) {
		this.value = value;
		this.name = name;
		this.setSuit(suit);
	}
	//describes the given card, e.g. Two of Clubs = 2
	public void describe(){
		System.out.println(this.name + " of " + this.suit + " = " + this.value);
	}
	
	//getters and setters for value, name, and suit
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
}
