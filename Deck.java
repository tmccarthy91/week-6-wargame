package warProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//instantiates list for Cards
	List<Card> cards = new ArrayList<Card>();
	
	//creates array deck of cards, gives names and suits
	Deck(){
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven",
				"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
	//builds the deck, assigning names and suits as well as values based on integer	
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Card card = new Card(number, suit, count);
				this.cards.add(card);
				count++;
			}
		}
		}
	
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	//randomizes cards in the deck
	public void shuffle(){
		Collections.shuffle(this.cards);
	}
	//draws card from array, removing it from the deck
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
}

