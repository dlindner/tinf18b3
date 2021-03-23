package de.dhbw.tinf18b3.pattern.observer;

public class KonkreterBeobachter implements Beobachter {
	
	public KonkreterBeobachter() {
		super();
	}
	
	@Override
	public void aktualisiere(Object neuerZustand) {
		System.out.println("Neuer Zustand: " + neuerZustand);
	}
}
