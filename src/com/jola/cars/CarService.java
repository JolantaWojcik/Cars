package com.jola.cars;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

	/*
	 * - znajdz samochód który mia³ najwiêcej napraw - znajdz samochód który
	 * mia³ najdro¿sz¹ naprawê - znajdŸ najdro¿sz¹ naprawê - oblicz kwotê napraw
	 * w danym miesi¹cu/roku - metoda double calculateTotalServiceCostFor(int
	 * month, int year, List<Car> cars)
	 */

	public Car getCarWithMostRepairs(List<Car> loCars) {	
		return  loCars.stream().collect(Collectors.maxBy(new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				return o1.getRepairs().size()-o2.getRepairs().size();
			}
		})).get();
		
	}

/*	public Car getCarWithHighestRepairCost(Car car, List<Repair> repairs) {
		return car;

	}

	public Car getHighestRepairCost(List<Car> cars) {
		return null;
	}

	public double calculateTotalServiceCostFor(int month, int year,
			List<Car> car) {
		return year;
	}
*/
}
