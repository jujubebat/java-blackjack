package domain.card;

import java.util.Objects;

public class Card implements Comparable<Card> {
	private final Type type;
	private final Symbol symbol;

	public Card(Type type, Symbol symbol) {
		this.type = type;
		this.symbol = symbol;
	}

	public String getTypeName() {
		return symbol.getName();
	}

	public String getType() {
		return type.getName();
	}

	public Symbol getSymbol() {
		return symbol;
	}

	@Override
	public int compareTo(Card other) {
		return Integer.compare(symbol.getScore(), other.symbol.getScore());
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Card that = (Card)object;
		return this.type == that.type &&
			this.symbol == that.symbol;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, symbol);
	}
}
