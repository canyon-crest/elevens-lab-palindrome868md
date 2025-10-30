package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = new String[52];
		String[] suits = new String[52];
		int[] pointValues = new int[52];
		for (int i = 2; i <= 10; i++) {
			for (int j = 0; j < 4; j++) {
				Integer tempi = i;
				ranks[(i-2)*4 + j] = tempi.toString();
				pointValues[(i-2)*4 + j] = i;
			}
		}
		for (int i = 0; i < 16; i++) {
			if (i < 4) {
				ranks[36+i] = "Jack";
				pointValues[36+i] = 10;
			} else if (i < 8) {
				ranks[36+i] = "Queen";
				pointValues[36+i] = 10;
			} else if (i < 12) {
				ranks[36+i] = "King";
				pointValues[36+i] = 10;
			} else {
				ranks[36+i] = "Ace";
				pointValues[36+i] = 11;
			}
		}
		for (int i = 0; i < 13; i++) {
			suits[4*i+0] = "hearts";
			suits[4*i+1] = "diamonds";
			suits[4*i+2] = "clubs";
			suits[4*i+3] = "spades";
		}
		Deck2 twentyOne = new Deck2(ranks, suits, pointValues);
		System.out.println(twentyOne);
		for (int i = 0; i < 53; i++) {
			System.out.println(twentyOne.deal());
			if (i == 26 || i == 52) {
				System.out.println(twentyOne.size());
			}
		}
		System.out.println("Deck should be printed out first. Numbers should be 25 and 0. Deal should deal out all 52 cards and print out null once.");
	}
}
