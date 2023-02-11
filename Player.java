package warProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name;
	
	public void describe(List<Card> hand, String name){
		System.out.println("Player " + name + "has these cards: \n");
		System.out.println(hand);
	}
	//removes and returns top card of hand
	public Card flip() {
		Card card = hand.get(0);
		hand.remove(0);
		return card;
	}
	public void incrementScore() {
		this.score = score + 1;
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
