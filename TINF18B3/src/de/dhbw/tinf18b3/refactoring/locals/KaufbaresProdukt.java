package de.dhbw.tinf18b3.refactoring.locals;

public class KaufbaresProdukt implements Produkt {
	
	private String bezeichnung;
	private Euro einzelpreis;
	private int anzahl;

	public KaufbaresProdukt(String bezeichnung, Euro einzelpreis, int anzahl) {
		super();
		this.bezeichnung = bezeichnung;
		this.einzelpreis = einzelpreis;
		this.anzahl = anzahl;
	}

	@Override
	public String bezeichnung() {
		return bezeichnung;
	}
	
	@Override
	public Euro einzelpreis() {
		return einzelpreis;
	}
	
	@Override
	public int anzahl() {
		return anzahl;
	}
}
