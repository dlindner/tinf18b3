package de.dhbw.tinf18b3.refactoring.locals;

public class Euro {

	public static final Euro Null = new Euro(0);
	
	private static final String währung = "€";
	private final int inCent;

	public Euro(int inCent) {
		super();
		this.inCent = inCent;
	}
	
	public int inCent() {
		return inCent;
	}
	
	public Euro plus(Euro andererBetrag) {
		return new Euro(this.inCent + andererBetrag.inCent);
	}
	
	public Euro mal(int anzahl) {
		return new Euro(this.inCent * anzahl);
	}
	
	public String alsText() {
		return this.inCent / 100.0 + " " + währung;
	}
	
	@Override
	public String toString() {
		return alsText();
	}

}
