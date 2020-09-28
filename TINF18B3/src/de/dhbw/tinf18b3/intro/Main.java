package de.dhbw.tinf18b3.intro;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		final Flugameise schwarz = new LasiusNiger();
		final Flugameise gro� = new Rossameise();
		final List<Flugameise> alleAmeisen = Arrays.asList(
				schwarz,
				gro�);
		
		schwarz.fliege();
		gro�.fliege();
//		for (Flugameise each : alleAmeisen) {
//			each.fliege();
//		}
//		alleAmeisen.forEach(ameise -> ameise.fliege());
		alleAmeisen.forEach(Flugameise::fliege);
		
		final Wiese unserGarten = new Wiese();
		unserGarten.gr�ndeKolonie(schwarz);
		unserGarten.gr�ndeKolonie(gro�);
//		for (Flugameise each : alleAmeisen) {
//			unserGarten.gr�ndeKolonie(each);
//		}
		alleAmeisen.forEach(unserGarten::gr�ndeKolonie);
	}
}
