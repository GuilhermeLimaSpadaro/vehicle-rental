package model.interfaces;

import model.entities.Vehicle;
import model.exception.VehicleServiceException;

public interface VehicleInterface {

	public void addCar(Vehicle car) throws VehicleServiceException;

	public void removeCar(Vehicle car);

	public void rentVehicle(String vehicleRental) throws VehicleServiceException;
	
	public String showInfo() throws VehicleServiceException;

}
