package model.interfaces;

import model.entities.Vehicle;
import model.exception.VehicleException;

public interface VehicleInterface {
	public void add(Vehicle vehicle) throws VehicleException;
}
