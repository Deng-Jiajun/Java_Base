package com.startdima.test.chapter1.vehicle;

public class Bike implements Vehicle {

	@Override
	public void start(int arg) {
		System.out.println("Bike start by foot in " + arg + " second");
	}

	@Override
	public void stop(int arg) {
		System.out.println("Bike stop by hand brake in " + arg + " second");
	}

}
