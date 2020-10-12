package de.dhbw.tinf18b3.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class IstNegativeTest {

	@Test
	void positiveZahlen() {
		assertFalse(IstNegative.zahl(1));
		assertFalse(IstNegative.zahl(10));
		assertFalse(IstNegative.zahl(100));
		assertFalse(IstNegative.zahl(Integer.MAX_VALUE));
	}
	
	@Test
	void negativeZahlen() {
		assertTrue(IstNegative.zahl(-1));
		assertTrue(IstNegative.zahl(-10));
		assertTrue(IstNegative.zahl(-100));
		assertTrue(IstNegative.zahl(Integer.MIN_VALUE));
	}
	
	@Test
	void nullZahl() {
		assertFalse(IstNegative.zahl(0));
	}
}
