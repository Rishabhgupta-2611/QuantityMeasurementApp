package com.apps.quantitymeasurement;

public class Feet {

	private final double value;

	public Feet(double value) {
		if (Double.isNaN(value) || Double.isInfinite(value)) {
			throw new IllegalArgumentException("Invalid measurement value");
		}
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		Feet other = (Feet) obj;

		return Double.compare(this.value, other.value) == 0;
	}
}
