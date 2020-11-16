package de.dhbw.tinf18b3.refactoring.locals;

import java.util.List;

public class Kassenzettel {

	//------- Überschrift (WAS)
	public void druckeFür(List<Produkt> einkäufe) {
		druckeEinzelpositionen(einkäufe);
		druckeSumme(einkäufe);
		druckeBonuspunkte(einkäufe);
	}

	//------- Zusammenfassung (WIE)
	private void druckeBonuspunkte(List<Produkt> einkäufe) {
		int bonuspunkte = (int) Math.round(Produkt.gesamtpreisDer(einkäufe).inCent() * 0.0005D);
		drucke("Sie erhalten " + bonuspunkte + " Bonuspunkte.");
	}

	private void druckeSumme(List<Produkt> einkäufe) {
		drucke("Summe: " + Produkt.gesamtpreisDer(einkäufe));
	}

	private void druckeEinzelpositionen(List<Produkt> einkäufe) {
		for (Produkt each : einkäufe) {
			drucke(each.anzahl() + "x " + each.bezeichnung() + ": " + each.positionspreis().alsText());
		}
	}
	
	//------- Details (WIE-Bausteine)
	private void drucke(String zeile) {
		System.out.println(zeile);
	}
}
