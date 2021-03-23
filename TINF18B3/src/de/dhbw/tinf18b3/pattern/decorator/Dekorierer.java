package de.dhbw.tinf18b3.pattern.decorator;

public abstract class Dekorierer implements VisuelleKomponente {
	
	private final VisuelleKomponente nachfolger;

	public Dekorierer(VisuelleKomponente nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}

	@Override
	public void zeichne() {
		System.out.println("** Dekorierer::zeichne beginnt im Kontext " + getClass().getSimpleName());
		nachfolger.zeichne();
		System.out.println("** Dekorierer::zeichne endet im Kontext " + getClass().getSimpleName());
	}
}
