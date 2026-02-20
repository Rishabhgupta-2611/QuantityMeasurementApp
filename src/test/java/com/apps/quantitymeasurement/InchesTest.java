package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InchesTest {

	@Test
	void sameValue_shouldBeEqual() {
		assertTrue(new Inches(5.0).equals(new Inches(5.0)));
	}

	@Test
	void differentValue_shouldNotBeEqual() {
		assertFalse(new Inches(5.0).equals(new Inches(6.0)));
	}

	@Test
	void nullComparison_shouldReturnFalse() {
		assertFalse(new Inches(5.0).equals(null));
	}

	@Test
	void sameReference_shouldReturnTrue() {
		Inches i = new Inches(5.0);
		assertTrue(i.equals(i));
	}

	@Test
	void invalidValue_shouldThrowException() {
		assertThrows(IllegalArgumentException.class, () -> new Inches(Double.POSITIVE_INFINITY));
	}
}
