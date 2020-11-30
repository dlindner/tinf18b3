package de.dhbw.tinf18b3.clean.architecture.inversion.b2;

import de.dhbw.tinf18b3.clean.architecture.inversion.c.Aufmachbar;

public class Korken implements Aufmachbar {

	public Korken() {
		super();
	}
	
	public void öffnen() {
		System.out.println("br�ckel");
	}
}
