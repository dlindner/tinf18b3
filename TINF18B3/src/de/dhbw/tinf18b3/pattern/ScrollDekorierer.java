package de.dhbw.tinf18b3.pattern;

public class ScrollDekorierer extends Dekorierer {
	
	Object scrollPosition;
	
	public ScrollDekorierer(VisuelleKomponente nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		scrolleBis();
		super.zeichne();
	}
	
	void scrolleBis() {
		System.out.println("Füge Scrollbalken hinzu");		
	}
}
