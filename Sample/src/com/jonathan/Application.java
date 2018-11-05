package com.jonathan;

public class Application {

	public static void main(String[] args) {
		
		Car car = new Car();
		Vehicle<Car> vehicle = new Vehicle<Car>(car);
		vehicle.drive();
		
		Jeep jeep = new Jeep();
		Vehicle<Jeep> vehicle2 = new Vehicle<Jeep>(jeep);
		vehicle2.drive();
		
		Integer[] intArray = {1,2,5,4};
		
		String[] strArray = {"A","B"};
		
		Printer printer = new Printer();
		printer.printArray(intArray);
		System.out.println();
		printer.printArray(strArray);

	}

}
