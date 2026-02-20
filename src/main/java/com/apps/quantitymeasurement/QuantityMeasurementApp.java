package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

	public static boolean compareFeet(double a, double b) {
		Feet f1 = new Feet(a);
		Feet f2 = new Feet(b);
		return f1.equals(f2);
	}

	public static boolean compareInches(double a, double b) {
		return new Inches(a).equals(new Inches(b));
	}

	public static void main(String[] args) {
		System.out.println("Feet equal: " + compareFeet(1.0, 1.0));

		System.out.println("Inches equal: " + compareInches(12.0, 12.0));
	}
}
