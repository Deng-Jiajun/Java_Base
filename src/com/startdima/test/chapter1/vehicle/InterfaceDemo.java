package com.startdima.test.chapter1.vehicle;

public class InterfaceDemo {
	public static void main(String[] args) {
		Bike bike = new Bike();
		Bus bus = new Bus();
		bike.start(2);
		bike.stop(2);
		bus.start(1);
		bus.stop(4);
	}
}
