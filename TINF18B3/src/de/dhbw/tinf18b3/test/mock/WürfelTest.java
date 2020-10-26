package de.dhbw.tinf18b3.test.mock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mockito.Mockito;

public class WürfelTest {

	@Test
	public void einserwurf() {
		Zufallsgenerator zufall = Mockito.mock(Zufallsgenerator.class);
		Mockito.when(zufall.zufallszahl()).thenReturn(1);
		//Mockito.replay(zufall);
		Würfel target = new Würfel(6, zufall);
		
		int actual = target.wurf();
		
		assertThat(actual).isEqualTo(1);
	}
	
	@Test
	public void begrenzungAufSeitenzahl() {
		Zufallsgenerator zufall = Mockito.mock(Zufallsgenerator.class);
		Mockito.when(zufall.zufallszahl()).thenReturn(7);
		Würfel target = new Würfel(6, zufall);
		
		int actual = target.wurf();
		
		assertThat(actual).isEqualTo(1);
	}
	
	@Test
	public void beiNullErneutWürfeln() {
		Zufallsgenerator zufall = Mockito.mock(Zufallsgenerator.class);
		Mockito.when(zufall.zufallszahl()).thenReturn(0, 4);
		Würfel target = new Würfel(6, zufall);
		
		int actual = target.wurf();
		
		assertThat(actual).isEqualTo(4);
	}
}
