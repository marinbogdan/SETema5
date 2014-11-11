package mta.factoryclasses;

import mta.classes.Audi;
import mta.classes.Logan;
import mta.classes.MercedesBenz;
import mta.classes.Aro;
import mta.myinterface.Car;
import mta.primary.factory.CarFactory;

public class GasolineCarFactory extends CarFactory {

	public Car getCar(String carType) {
		Car car = null;
		if ("mercedes".equals(carType)) {
			car = new MercedesBenz();
		}
		if ("logan".equals(carType)) {
			car = new Logan();
		}
		if ("audi".equals(carType)) {
			car = new Audi();
		}
		return car;
	}

}