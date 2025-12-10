package model.entities.subentities;

import model.entities.Vehicle;
import model.exception.VehicleServiceException;
import model.interfaces.VehicleInterface;

public class Car extends Vehicle implements VehicleInterface {

	public Car(String mark, String model, int year, double value, int doors, Engine engineType) {
		super(mark, model, year, value, doors, engineType);
	}

	@Override
	public void setRent(boolean rent) {
		super.setRent(rent);
	}

	@Override
	public double ipvaSum() {
		return super.getValue() * 0.04;
	}

	@Override
	public boolean verifyCar() {
		return super.verifyCar();
	}

	@Override
	public String showInfo() {
		return super.showInfo();
	}

	@Override
	public void rentVehicle(Vehicle vehicleRental) throws VehicleServiceException {
	}

	@Override
	public void addCar(Vehicle car) {
	}

	@Override
	public void removeCar(Vehicle car) {
	}

}
