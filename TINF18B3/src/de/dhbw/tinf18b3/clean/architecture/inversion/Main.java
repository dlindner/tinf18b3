package de.dhbw.tinf18b3.clean.architecture.inversion;

import de.dhbw.tinf18b3.clean.architecture.inversion.a.Flasche;
import de.dhbw.tinf18b3.clean.architecture.inversion.b.Kronkorken;
import de.dhbw.tinf18b3.clean.architecture.inversion.c.Aufmachbar;

public class Main {

	public static void main(String[] args) {
		Aufmachbar cap = new Kronkorken();
		Flasche bier = new Flasche(cap);
		bier.trinke();
	}
}
