package mta.primary.factory;

import mta.factoryclasses.GasolineCarFactory;
import mta.factoryclasses.DieselCarFactory;
import mta.myinterface.Car;

public abstract class CarFactory {

	public abstract Car getCar(String carType);

	public static CarFactory getCarFactory(String type) {
		CarFactory carFactory = null;
		if ("diesel".equals(type)) {
			carFactory = new DieselCarFactory();
		}
		if ("gasoline".equals(type)) {
			carFactory = new GasolineCarFactory();
		}
		return carFactory;
	}
}
