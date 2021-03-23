package de.dhbw.tinf18b3.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subjekt {

	private final List<Beobachter> angemeldeteBeobachter;
	
	public Subjekt() {
		super();
		this.angemeldeteBeobachter = new ArrayList<>();
	}
	
	public void meldeAn(Beobachter neu) {
		this.angemeldeteBeobachter.add(neu);
	}
	
	public void meldeAb(Beobachter neu) {
		this.angemeldeteBeobachter.remove(neu);
	}
	
	public void benachrichtige() {
		for (Beobachter each : this.angemeldeteBeobachter) {
			each.aktualisiere();
		}
	}
}
