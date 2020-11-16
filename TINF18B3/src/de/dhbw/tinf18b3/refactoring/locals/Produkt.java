package de.dhbw.tinf18b3.refactoring.locals;

import java.util.List;

public interface Produkt {

	int anzahl();
	
	String bezeichnung();
	
	Euro einzelpreis();
	
	default Euro positionspreis() {
		return einzelpreis().mal(anzahl());
	}
	
	static Euro gesamtpreisDer(List<Produkt> einkäufe) {
		Euro gesamtpreis = Euro.Null;
		for (Produkt each : einkäufe) {
			gesamtpreis = gesamtpreis.plus(each.positionspreis());
		}
		return gesamtpreis;
	}
}
