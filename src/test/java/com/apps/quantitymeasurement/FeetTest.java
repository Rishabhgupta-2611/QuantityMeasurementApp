package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FeetTest {

	@Test
	void sameValue_shouldBeEqual() {
		assertTrue(new Feet(1.0).equals(new Feet(1.0)));
	}

	@Test
	void differentValue_shouldNotBeEqual() {
		assertFalse(new Feet(1.0).equals(new Feet(2.0)));
	}

	@Test
	void nullComparison_shouldReturnFalse() {
		assertFalse(new Feet(1.0).equals(null));
	}

	@Test
	void sameReference_shouldReturnTrue() {
		Feet f = new Feet(1.0);
		assertTrue(f.equals(f));
	}

	@Test
	void invalidValue_shouldThrowException() {
		assertThrows(IllegalArgumentException.class, () -> new Feet(Double.NaN));
	}
}
