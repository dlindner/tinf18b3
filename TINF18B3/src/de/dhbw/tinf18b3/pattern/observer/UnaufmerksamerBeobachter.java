package de.dhbw.tinf18b3.pattern.observer;

public class UnaufmerksamerBeobachter implements Beobachter {
	
	public UnaufmerksamerBeobachter() {
		super();
	}
	
	@Override
	public void aktualisiere() {
		System.out.println("Hä? Was?");
	}
}
