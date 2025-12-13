package model.entities.subentities;

import model.entities.Vehicle;
import model.exception.VehicleServiceException;
import model.interfaces.VehicleInterface;

public class Car extends Vehicle implements VehicleInterface {

	public Car(int id, String mark, String model, int year, double value, int doors, Engine engine) {
		super(id, mark, model, year, value, doors, engine);
	}

	@Override
	public void addCar(Vehicle car) throws VehicleServiceException {
	}

	@Override
	public void removeCar(Vehicle car) {
	}

	@Override
	public void rentVehicle(String vehicleRental) throws VehicleServiceException {
	}
	
	@Override
	public String showInfo() throws VehicleServiceException {	
		return "";
	}

}
