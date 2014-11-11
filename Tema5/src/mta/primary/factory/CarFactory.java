package mta.primary.factory;

import mta.exceptions.Exceptions;
import mta.factoryclasses.GasolineCarFactory;
import mta.factoryclasses.DieselCarFactory;
import mta.myinterface.Car;

public abstract class CarFactory {

	public abstract Car getCar(String carType) throws Exceptions; // functie
																	// abstracta
																	// ..se
																	// implementeaza
																	// in
																	// clasele
																	// derivate

	public static CarFactory getCarFactory(String type) throws Exceptions {// functie
																			// care
																			// returneaza
		CarFactory carFactory = null; // obiect de tip diesel sau gasoline
		if ("diesel".equals(type)) {
			carFactory = new DieselCarFactory(); // la randul lor obiecte de tip
													// gasoline
		} // pot contine logan,mercedes sau audi
		if ("gasoline".equals(type)) {
			carFactory = new GasolineCarFactory(); // //la randul lor obiecte de
													// tip diesel
		} // pot contine aro sau jeep
		if (carFactory == null)
			throw new Exceptions("It must be diesel or gasoline");
		return carFactory; // pe caz null se arunca o exceptie
	}
}
