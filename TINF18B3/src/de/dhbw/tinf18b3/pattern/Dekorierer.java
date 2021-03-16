package de.dhbw.tinf18b3.pattern;

public abstract class Dekorierer implements VisuelleKomponente {
	
	private final VisuelleKomponente nachfolger;

	public Dekorierer(VisuelleKomponente nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}

	@Override
	public void zeichne() {
		nachfolger.zeichne();
	}
}
