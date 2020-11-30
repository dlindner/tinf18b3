package de.dhbw.tinf18b3.clean.architecture.inversion.a;

import de.dhbw.tinf18b3.clean.architecture.inversion.c.Aufmachbar;

public class Flasche {

	private Aufmachbar verschluss;

	public Flasche(Aufmachbar verschluss) {
		super();
		this.verschluss = verschluss;
	}
	
	public void trinke() {
		this.verschluss.öffnen();
		System.out.println("lecker!");
	}
}
