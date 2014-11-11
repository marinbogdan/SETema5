package mta.factoryclasses;

import mta.classes.Aro;
import mta.classes.Jeep;
import mta.exceptions.Exceptions;
import mta.myinterface.Car;
import mta.primary.factory.CarFactory;

public class DieselCarFactory extends CarFactory {

	public Car getCar(String carType) throws Exceptions { // functie pentru
															// returnarea
															// tipului de
		Car car = null; // masina din dieselFactory
		if ("aro".equals(carType)) {
			car = new Aro(); // in functie de stringul primit ca parametru
		} // se returneaza obiectul dorit
		if ("jeep".equals(carType)) {
			car = new Jeep();
		}
		if (car == null) // in caz contrar, se arunca o exceptie
			throw new Exceptions("It must be aro or jeep");
		return car; // se returneaza obiectul dorit
	}
}
