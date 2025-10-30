package Activity1;
/**
 * Card1.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card1 {
	private String suit;
	private String rank;
	private int pointValue;

   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card1(String cardRank, String cardSuit, int cardPointValue) {
		this.suit = cardSuit;
		this.rank = cardRank;
		this.pointValue = cardPointValue;
	}

	/**
	 * Accessors for Card's three instance variables.
	 * @return this <code>Card's</code> instance_var.
	 */
	public String suit() {
		return this.suit;
   }
	public String rank() {
		return this.rank;
	}
	public int pointValue() {
		return this.pointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card1 otherCard) {
		if (otherCard.rank.equals(this.rank) && otherCard.suit.equals(this.suit) && otherCard.pointValue == this.pointValue) {
			return true;
		}
		return false;
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		return this.rank + " of " + this.suit + " (point value = " + this.pointValue + ")";

	}
}
