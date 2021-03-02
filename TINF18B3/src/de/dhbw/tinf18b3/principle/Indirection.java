package de.dhbw.tinf18b3.principle;

public class Indirection {

	public static void main(String[] args) {
		Console console = new Console(true);
		console.print(() -> gibTextFür(1));	
		console.print(() -> gibTextFür(2));
		System.out.println("--- ENDE ---");
	}
	
	private static String gibTextFür(int zahl) {
		sleep(1000L);
		System.out.println("Berechne....");
		sleep(1000L);
		return zahl + ". ding";
	}
	
	private static void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
