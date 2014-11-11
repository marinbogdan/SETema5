package mta.main;

import mta.myinterface.Car;
import mta.primary.factory.CarFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
 
		Car car = null;
		CarFactory carFactory = null;
		carFactory = CarFactory.getCarFactory("gasoline");
		car = carFactory.getCar("logan");
		System.out.println(car.drive());
		carFactory=CarFactory.getCarFactory("diesel");
		car=carFactory.getCar("aro");
		System.out.println(car.drive());
		

	}

}
