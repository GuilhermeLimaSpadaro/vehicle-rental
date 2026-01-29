package model.repository;

import java.util.ArrayList;
import java.util.List;

import model.entities.Vehicle;
import model.exception.VehicleException;
import model.interfaces.VehicleInterface;

public class VehicleRepository implements VehicleInterface {

	private List<Vehicle> vehicleList = new ArrayList<>();
	
	public VehicleRepository() {
	}

	public VehicleRepository(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	@Override
	public void add(Vehicle vehicle) throws VehicleException {
		if (vehicleList.contains(vehicle)) {
			throw new VehicleException("Veiculo ja cadastrado!");
		}
		vehicleList.add(vehicle);
	}
}
