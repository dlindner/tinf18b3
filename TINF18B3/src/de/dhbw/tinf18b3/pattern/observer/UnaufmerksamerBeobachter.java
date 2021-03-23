package de.dhbw.tinf18b3.pattern.observer;

public class UnaufmerksamerBeobachter implements Beobachter {
	
	public UnaufmerksamerBeobachter() {
		super();
	}
	
	@Override
	public void aktualisiere(Object neuerZustand) {
		System.out.println("Hä? Was?");
	}
}
