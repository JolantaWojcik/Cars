package com.jola.cars;

import java.util.ArrayList;

public class Main {

	/*
	 * nastêpnie w mainie stwórz kilka danych testowych: (np.: 3-4 samochody i
	 * niech ka¿dy ma po 0-5 napraw)
	 * 
	 * - znajdz samochód który mia³ najwiêcej napraw - znajdz samochód który
	 * mia³ najdro¿sz¹ naprawê - znajdŸ najdro¿sz¹ naprawê - oblicz kwotê napraw
	 * w danym miesi¹cu/roku - metoda double calculateTotalServiceCostFor(int
	 * month, int year, List<Car> cars)
	 */

	public static void main(String[] args) {
		System.out.println("########### Starting #############");
		Repair rep1 = new Repair(1990, 9, 31, "desc", 567.87, "Kowalski");
		Repair rep2 = new Repair(1990, 8, 31, "desc2", 567.87, "Nowak");
		Repair rep3 = new Repair(1996, 8, 31, "desc3", 679.87, "Nowak");
		Repair rep4 = new Repair(2000, 9, 31, "desc4", 789.87, "Kowalski");
		Repair rep5 = new Repair(2010, 6, 31, "desc5", 567.87, "Kowalski");

		Car car1 = new Car(1988, "Fiat", 134);
		Car car2 = new Car(1998, "Audi", 200);
		Car car3 = new Car(2014, "Voltsvagen", 99);

		car1.addRepair(rep1);
		car2.addRepair(rep2);
		car2.addRepair(rep3);
		car2.addRepair(rep4);
		car3.addRepair(rep5);
		car3.addRepair(rep5);

		ArrayList<Car> loCars = new ArrayList<Car>();

		loCars.add(car1);
		loCars.add(car2);
		loCars.add(car3);

		CarService carService = new CarService();
	    System.out.println("Car With Most Repairs ==>"+carService.getCarWithMostRepairs(loCars).toString());
		

	}

}
