package mta.factoryclasses;

import mta.classes.Audi;
import mta.classes.Logan;
import mta.classes.MercedesBenz;
import mta.classes.Aro;
import mta.exceptions.Exceptions;
import mta.myinterface.Car;
import mta.primary.factory.CarFactory;

public class GasolineCarFactory extends CarFactory {

	public Car getCar(String carType) throws Exceptions { // functie pentru
															// returnarea
															// tipului de
		Car car = null; // masina din GasolineFactory
		if ("mercedes".equals(carType)) {
			car = new MercedesBenz(); // in functie de stringul primit ca
										// parametru
		} // se returneaza obiectul dorit
		if ("logan".equals(carType)) {
			car = new Logan();
		}
		if ("audi".equals(carType)) {
			car = new Audi();
		}
		if (car == null) // in caz contrar, se arunca o exceptie
			throw new Exceptions("It must be mercedes,logan or audi");
		return car; // se returneaza obiectul dorit
	}

}