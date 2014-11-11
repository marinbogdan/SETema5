package mta.main;

import mta.exceptions.Exceptions;
import mta.myinterface.Car;
import mta.primary.factory.CarFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Car car = null; // instantiam un obiect de tip interfata cu null
		CarFactory carFactory = null; // instantiam un obiect din clasa
										// abstracta CarFactory cu null
		try {
			carFactory = CarFactory.getCarFactory("gasoline"); // deoarece
																// functia
																// getCarFactory
																// este de tip
			car = carFactory.getCar("logan"); // static, se poate apela fara
												// instantierea
			System.out.println(car.drive()); // unui
												// obiect(CarFactory.getCarFactory),functie
												// care
			carFactory = CarFactory.getCarFactory("diesel"); // returneaza un
																// obiect de tip
																// gasoline
			car = carFactory.getCar("aro"); // sau diesel.Acesta permite,la
											// randul sau,
			System.out.println(car.drive()); // prin fc getCar returnarea unui
												// tip de masini(spre ex
			carFactory = CarFactory.getCarFactory("diesel"); // daca carFactory
																// este de tip
																// diesel se pot
																// pot creea
			car = carFactory.getCar("logan"); // obiecte de tip aro sau jeeep
			System.out.println(car.drive());
			carFactory = CarFactory.getCarFactory("gasoline");
			carFactory.getCar("audi");
			System.out.println(car.drive());
		} catch (Exceptions ex) { // Exemplu: in caz in care se doreste
									// construirea unui obiect de
			System.out.println("\nObject error:" + ex.getMessage());
			// tip aro in gasoline se arunca exceptii
		}
		try {
			carFactory = CarFactory.getCarFactory("difsdfsd");
		} catch (Exceptions ex) {
			System.out.println("\nFactory Object error:" + ex.getMessage());
		}

	}

}
