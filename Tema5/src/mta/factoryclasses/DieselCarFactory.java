package mta.factoryclasses;

import mta.classes.Aro;
import mta.classes.Jeep;
import mta.classes.Audi;
import mta.myinterface.Car;
import mta.primary.factory.CarFactory;

public class DieselCarFactory extends CarFactory {

	public Car getCar(String carType) {
		Car car = null;
		if ("aro".equals(carType)) {
			car = new Aro();
		}
		if ("jeep".equals(carType)) {
			car = new Jeep();
		}
		return car;
	}
}
