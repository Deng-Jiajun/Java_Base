package com.startdima.test.chapter1.vehicle;

public class Bus implements Vehicle {
	@Override
	public void start(int arg) {
		System.out.println("Bus start by engine in " + arg + " second");
	}

	@Override
	public void stop(int arg) {
		System.out.println("Bus stop by brake in " + arg + " second");
	}
}
