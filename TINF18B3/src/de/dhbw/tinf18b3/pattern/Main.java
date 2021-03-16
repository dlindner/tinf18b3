package de.dhbw.tinf18b3.pattern;

public class Main {

	public static void main(String[] args) {
		TextAnzeige text = new TextAnzeige();
		ScrollDekorierer scrolling = new ScrollDekorierer(text);
		RahmenDekorierer umrandung = new RahmenDekorierer(scrolling);
		
		umrandung.zeichne();
		System.out.println("** Ende");
	}
}
