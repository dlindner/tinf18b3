package de.dhbw.tinf18b3.clean.architecture.inversion.b;

import de.dhbw.tinf18b3.clean.architecture.inversion.c.Aufmachbar;

public class Kronkorken implements Aufmachbar {

	public Kronkorken() {
		super();
	}
	
	@Override
	public void öffnen() {
		System.out.println("plopp!");
	}
}
