package de.dhbw.tinf18b3.pattern.observer;

public class KonkreterBeobachter implements Beobachter {
	
	private KonkretesSubjekt subjekt;

	public KonkreterBeobachter(KonkretesSubjekt subjekt) {
		super();
		this.subjekt = subjekt;
	}
	
	@Override
	public void aktualisiere() {
		Object neuerZustand = this.subjekt.gibZustand();
		System.out.println("Neuer Zustand: " + neuerZustand);
	}
}
