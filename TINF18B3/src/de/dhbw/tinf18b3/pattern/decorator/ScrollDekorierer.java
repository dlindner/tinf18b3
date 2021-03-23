package de.dhbw.tinf18b3.pattern.decorator;

public class ScrollDekorierer extends Dekorierer {
	
	Object scrollPosition;
	
	public ScrollDekorierer(VisuelleKomponente nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		System.out.println("** ScrollDekorierer::zeichne beginnt");
		scrolleBis();
		super.zeichne();
		nachheraktion();
		System.out.println("** ScrollDekorierer::zeichne endet");
	}
	
	private void nachheraktion() {
		System.out.println("!! Nachheraktion ScrollDekorierer");
	}

	void scrolleBis() {
		System.out.println("Füge Scrollbalken hinzu");		
	}
}
