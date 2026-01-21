package model.interfaces;

import model.entities.Vehicle;
import model.exception.VehicleServiceException;

public interface VehicleInterface {

	public void addCar(Vehicle vehicle) throws VehicleServiceException;

	public void removeCar(String vehicle) throws VehicleServiceException;

	public String showInfo() throws VehicleServiceException;

	public Vehicle findVehicle(String vehicle);

}
