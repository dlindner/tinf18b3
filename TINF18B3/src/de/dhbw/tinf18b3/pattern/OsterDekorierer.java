package de.dhbw.tinf18b3.pattern;

public class OsterDekorierer extends Dekorierer {
	
	public OsterDekorierer(VisuelleKomponente nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		// vorher
		super.zeichne();
		// nachher
		ersetzeOsDurchEier();
	}
	
	private void ersetzeOsDurchEier() {
		System.out.println("Denkt euch die Eier doch selbst!");
	}
}
