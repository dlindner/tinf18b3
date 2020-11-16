package de.dhbw.tinf18b3.refactoring.errorcode;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Winkelsensor sensor = new Winkelsensor() {
			@Override
			public boolean isWorking() {
				return true;
			}
			@Override
			public int angle() {
				return 2;
				//return Integer.MIN_VALUE;
			}
		};
		Winkelgeber geber = new Winkelgeber(sensor);
		// 1. Variante
		int angle = geber.getAngle();
		Optional<Integer> maybeAngle = (angle == -1) ? Optional.empty() : Optional.of(angle);
		if (-1 == angle) {
			System.err.println("Alles scheiße!");
		} else {
			System.out.println(angle + 40);
		}
		
		// 2. Variante
		Integer angle2 = geber.getAngleOrNull();
		Optional<Integer> maybeAngle2 = Optional.ofNullable(angle2);
		if (null == angle2) {
			System.err.println("Alles scheiße!");
		} else {
			System.out.println(angle2 + 40);
		}
		
		// 3. Variante
		Optional<Integer> maybeAngle3 = geber.getAngleOrEmpty();
		Optional<Integer> mapped1 = maybeAngle3.map(a -> a + 40);
		Optional<String> mapped2 = mapped1.map(a -> String.valueOf(a));
		String wert = mapped2.orElse("Ersatz");
		// Railway-oriented programming
		System.out.println(maybeAngle3.map(a -> a + 40)
									 .map(Math::round)
									 .map(String::valueOf)
									 .orElse("Alles scheiße!"));
		
		// 4. Variante
		try {
			int angle4 = geber.getAngleOrException();
			System.out.println(angle4 + 40);
		} catch (SensorException e) {
			System.err.println("Alles scheiße!");
		}
	}
}
