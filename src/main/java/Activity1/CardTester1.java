package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card1 carda = new Card1("9", "clubs", 1434);
		Card1 cardb = new Card1("9", "clubs", 1434);
		Card1 cardc = new Card1("9", "clubs", 67);
		Card1 cardd = new Card1("8", "hearts", 67);
		System.out.println(carda.matches(cardb));
		System.out.println(carda.matches(cardc));
		System.out.println(carda.rank());
		System.out.println(cardd.suit());
		System.out.println(cardc.pointValue());
		System.out.println("Should print: true false 9 hearts 67");
	}
}
