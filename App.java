package warProject;


import java.util.List;


public class App {

	public static void main(String[] args) {
		
		gameplay();

	}
	public static void gameplay() {
		Deck deck = new Deck();
		deck.shuffle();
		
		//create our players
		
		Player player1 = new Player();
		player1.setName("Player 1");
		player1.setScore(0);
		Player player2 = new Player();
		player2.setName("Player 2");
		player2.setScore(0);
	
		//give them hands
		
		for (Integer i = 0; i < 26; i++) {
			player1.hand.add(deck.draw());
			player2.hand.add(deck.draw());
		}
		
		//draw the cards, play the game, compare
		
		List<Card> hand = player1.hand;
		
		//integer s serves as a point pool for ties
		int s = 0;
		
		for (int i = 0; i < hand.size(); i++) {		
			Card flippedCard = (player1.flip());
			System.out.println("Player 1 has drawn:");
			flippedCard.describe();
			Card secondCard = (player2.flip());
			System.out.println("Player 2 has drawn:");
			secondCard.describe();
			
		//cards flipped, compare the values
			
			int x = Integer.compare(flippedCard.getValue(), secondCard.getValue());
			
			if (x == 1) {
				if (s > 0) {
					player1.setScore(player1.getScore() + s);
					s = 0;
				}		
				System.out.println("Player 1 scores!");
				player1.incrementScore();
			} else if (x == -1){
				if (s > 0) {
					player2.setScore(player2.getScore() + s);
					s = 0;
				}
				System.out.println("Player 2 scores!");
				player2.incrementScore();
			} else {
				System.out.println("WAR!");
				s++;
			}
			
		// declares the end of the game and, if final draw was a tie, declares unclaimed points
			
			if (i == (hand.size() - 1)) {
				System.out.println("**********No more cards!**********");
				if (s > 0) {
					System.out.println("Game ended with: " + s + " point(s) left on the field!");
				}
			}
		}
		
		// declares final scores
		
		System.out.println("The final scores are: " + player1.getScore() + " and " + 
								player2.getScore() + "!");
		
		//determines the winner
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("Tie game! Like so many before it, this war produced no winners.");
		}
		
	}

}
