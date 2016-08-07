package com.jola.cars;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

	/*
	 * - znajdz samoch�d kt�ry mia� najwi�cej napraw - znajdz samoch�d kt�ry
	 * mia� najdro�sz� napraw� - znajd� najdro�sz� napraw� - oblicz kwot� napraw
	 * w danym miesi�cu/roku - metoda double calculateTotalServiceCostFor(int
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
