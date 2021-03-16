package de.dhbw.tinf18b3.pattern;

public class TextAnzeige implements VisuelleKomponente {
	
	public TextAnzeige() {
		super();
	}
	
	@Override
	public void zeichne() {
		System.out.println("Ein wichtiger Text wird angezeigt");
	}
}
