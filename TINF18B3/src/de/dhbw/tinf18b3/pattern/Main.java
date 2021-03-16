package de.dhbw.tinf18b3.pattern;

public class Main {

	public static void main(String[] args) {
		TextAnzeige text = new TextAnzeige();
		ScrollDekorierer scrolling = new ScrollDekorierer(text);
		RahmenDekorierer umrandung = new RahmenDekorierer(scrolling);
		OsterDekorierer ostern = new OsterDekorierer(umrandung);
		OsterDekorierer ostern2 = new OsterDekorierer(ostern);
		OsterDekorierer ostern3 = new OsterDekorierer(ostern2);
		
		ostern3.zeichne();
		System.out.println("** Ende");
	}
}
