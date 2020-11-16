package de.dhbw.tinf18b3.refactoring.locals;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Kassenzettel kassenzettel = new Kassenzettel();
		kassenzettel.druckeFür(
				Arrays.asList(
						new KaufbaresProdukt("XBox Series X", new Euro(600_00), 3),
						new KaufbaresProdukt("Playstation 5", new Euro(500_00), 5),
						new KaufbaresProdukt("Klopapier", new Euro(2_50), 25),
						new KaufbaresProdukt("RTX 3080", new Euro(700_00), 500)));
				
	}
}
