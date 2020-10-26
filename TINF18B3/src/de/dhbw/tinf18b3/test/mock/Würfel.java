package de.dhbw.tinf18b3.test.mock;

public class Würfel {

	private int seitenzahl;
	private Zufallsgenerator zufall;

	public Würfel(
			int seitenzahl,
			Zufallsgenerator zufall) {
		super();
		this.seitenzahl = seitenzahl;
		this.zufall = zufall;
	}
	
	public int wurf() {
		int augen = this.zufall.zufallszahl();
		int ergebnis = augen % this.seitenzahl;
		if (ergebnis == 0) {
			return wurf();
		}
		return ergebnis;
	}
}
