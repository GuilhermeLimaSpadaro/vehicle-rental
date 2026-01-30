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

	/**   **/
	
	@Override
	public void addVehicle(Vehicle vehicle) throws VehicleException {
		if (vehicleList.contains(vehicle)) {
			throw new VehicleException("Veiculo ja cadastrado!");
		}
		vehicleList.add(vehicle);
	}

	@Override
	public void removeVehicle(String model) throws VehicleException {
		Vehicle vehicle = findVehicle(model);
		vehicleList.remove(vehicle);
	}

	@Override
	public Vehicle findVehicle(String model) throws VehicleException {
		if (vehicleList.isEmpty()) {
			throw new VehicleException("Lista nao pode ser vazia!");
		}
		Vehicle find = null;
		for (Vehicle vehicleObj : vehicleList) {
			if (vehicleObj.getModel().equals(model)) {
				find = vehicleObj;
			}
		}
		if (find == null) {
			throw new VehicleException("Veiculo nao encontrado! ID: " + model);
		}
		return find;
	}
	
	@Override
	public String listVehicles() throws VehicleException {
		if (listVehicles().isEmpty()) {
			throw new VehicleException("Lista nao pode estar vazia!");
		}
		StringBuilder sb = new StringBuilder();
		for (Vehicle vehicle : vehicleList) {
			sb.append(vehicle.toString()).append("\n");
		}
		return sb.toString();
	}
}
