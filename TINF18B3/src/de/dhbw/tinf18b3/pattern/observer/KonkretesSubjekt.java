package de.dhbw.tinf18b3.pattern.observer;

public class KonkretesSubjekt extends Subjekt {
	
	private Object subjektZustand;
	
	public KonkretesSubjekt() {
		super();
		this.subjektZustand = new Object();
	}
	
	public Object gibZustand() {
		return this.subjektZustand;
	}
	
	public void aendere() {
		this.subjektZustand = new Object();
		benachrichtige();
	}
}
