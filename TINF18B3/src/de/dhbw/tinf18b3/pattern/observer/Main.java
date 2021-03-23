package de.dhbw.tinf18b3.pattern.observer;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		KonkretesSubjekt subjekt0 = new KonkretesSubjekt();
		KonkretesSubjekt subjekt1 = new KonkretesSubjekt();
		KonkreterBeobachter beobachter0 = new KonkreterBeobachter();
		subjekt0.meldeAn(beobachter0);
		subjekt1.meldeAn(beobachter0);
		for (int i = 0; i < 5; i++) {
			Beobachter beobachter1 = new UnaufmerksamerBeobachter();
			subjekt0.meldeAn(beobachter1);
		}
		System.out.println("---");
		subjekt0.aendere();
		
		System.out.println("+++");
		subjekt1.aendere();
		
		subjekt0.meldeAb(beobachter0);
		
		System.out.println("***");
		subjekt0.aendere();
	}
}
