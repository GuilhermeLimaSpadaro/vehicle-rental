package model.entities.subentities;

import model.entities.Vehicle;

public class Car extends Vehicle {

	public Car(int idVehicle, String mark, String model, int year, double value, int doors, int wHP,
			String engineType) {
		super(idVehicle, mark, model, year, value, doors, wHP, engineType);
	}

}
