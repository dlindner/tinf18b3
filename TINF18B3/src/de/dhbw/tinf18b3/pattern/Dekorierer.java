package de.dhbw.tinf18b3.pattern;

public abstract class Dekorierer implements VisuelleKomponente {
	
	private final VisuelleKomponente komponente;
	
	public Dekorierer(VisuelleKomponente komponente) {
		super();
		this.komponente = komponente;
	}

	@Override
	public void zeichne() {
		komponente.zeichne();
	}
}
