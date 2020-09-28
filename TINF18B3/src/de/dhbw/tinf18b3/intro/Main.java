package de.dhbw.tinf18b3.intro;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		final Flugameise schwarz = new LasiusNiger();
		final Flugameise groß = new Rossameise();
		final List<Flugameise> alleAmeisen = Arrays.asList(
				schwarz,
				groß);
		
		schwarz.fliege();
		groß.fliege();
//		for (Flugameise each : alleAmeisen) {
//			each.fliege();
//		}
//		alleAmeisen.forEach(ameise -> ameise.fliege());
		alleAmeisen.forEach(Flugameise::fliege);
		
		final Wiese unserGarten = new Wiese();
		unserGarten.gründeKolonie(schwarz);
		unserGarten.gründeKolonie(groß);
//		for (Flugameise each : alleAmeisen) {
//			unserGarten.gründeKolonie(each);
//		}
		alleAmeisen.forEach(unserGarten::gründeKolonie);
	}
}
