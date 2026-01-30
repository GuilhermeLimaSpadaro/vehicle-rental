package model.interfaces;

import model.entities.Vehicle;
import model.exception.VehicleException;

public interface VehicleInterface {
	
	public void addVehicle(Vehicle vehicle) throws VehicleException;
	
	public void removeVehicle(String model) throws VehicleException;

	public Vehicle findVehicle(String model) throws VehicleException;
	
	public String listVehicles() throws VehicleException;
}
