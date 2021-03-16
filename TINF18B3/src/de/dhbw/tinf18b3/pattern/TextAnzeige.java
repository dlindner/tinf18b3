package de.dhbw.tinf18b3.pattern;

public class TextAnzeige implements VisuelleKomponente {
	
	public TextAnzeige() {
		super();
	}
	
	@Override
	public void zeichne() {
		System.out.println("** TextAnzeige::zeichne beginnt");
		System.out.println("Ein wichtiger Text wird angezeigt");
		System.out.println("** TextAnzeige::zeichne endet");
	}
}
