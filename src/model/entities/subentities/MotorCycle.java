package model.entities.subentities;

import model.entities.Vehicle;
import model.exception.VehicleServiceException;
import model.interfaces.VehicleInterface;

public class MotorCycle extends Vehicle implements VehicleInterface {

	public MotorCycle(String mark, String model, int year, double value, int doors, Engine engine) {
		super(mark, model, year, value, doors, engine);
	}

	public void setRent(boolean rent) {
		super.setRent(rent);
	}

	public double ipvaSum() {
		return super.getValue() * 0.02;
	}

	public boolean verifyCar() {
		return super.verifyCar();
	}

	public boolean isRent(Vehicle motorClycle) {
		return super.isRent();
	}
	
	public void rentVehicle(Vehicle vehicleRental) throws VehicleServiceException{
	}
	
	@Override
	public void addCar(Vehicle car) {
	}
	
	@Override
	public void removeCar(Vehicle car) {
	}

}
