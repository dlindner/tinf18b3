package de.dhbw.tinf18b3.pattern;

public class RahmenDekorierer extends Dekorierer {
	
	Object rahmenBreite;
	
	public RahmenDekorierer(VisuelleKomponente nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		super.zeichne();
		zeichneRahmen();
	}
	
	void zeichneRahmen() {
		System.out.println("Ein schöner Rahmen");
	}
}
