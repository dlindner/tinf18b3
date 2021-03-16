package de.dhbw.tinf18b3.pattern;

public class RahmenDekorierer extends Dekorierer {
	
	Object rahmenBreite;
	
	public RahmenDekorierer(VisuelleKomponente nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		System.out.println("** RahmenDekorierer::zeichne beginnt");
		vorheraktion();
		super.zeichne();
		zeichneRahmen();
		System.out.println("** RahmenDekorierer::zeichne endet");
	}
	
	private void vorheraktion() {
		System.out.println("!! Vorheraktion RahmenDekorierer");
	}

	void zeichneRahmen() {
		System.out.println("Ein schöner Rahmen");
	}
}
