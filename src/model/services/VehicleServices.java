package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Vehicle;
import model.exception.VehicleServiceException;
import model.interfaces.VehicleInterface;

public class VehicleServices implements VehicleInterface {

	private List<Vehicle> vehicles = new ArrayList<>();

	public VehicleServices() {
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public void addCar(Vehicle vehicle) throws VehicleServiceException {
		if (vehicles.contains(vehicle)) {
			throw new VehicleServiceException("Veiculo ja cadastrado.");
		}
		vehicles.add(vehicle);
	}

	@Override
	public void removeCar(String model) throws VehicleServiceException {

		Vehicle found = null;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getModel().toUpperCase().trim().equals(model.toUpperCase().trim())) {
				found = vehicle;
			}
		}
		if (found == null) {
			throw new VehicleServiceException("Veiculo ja removido.");
		}
		vehicles.remove(found);
	}

	@Override
	public Vehicle findVehicle(String vehicleFound) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getModel().equalsIgnoreCase(vehicleFound)) {
				return vehicle;
			}
		}
		return null;
	}

	@Override
	public String showInfo() throws VehicleServiceException {
		if (vehicles.isEmpty()) {
			throw new VehicleServiceException("Veiculo nao cadastrado!");
		}

		StringBuilder sb = new StringBuilder();
		for (Vehicle vehicle : vehicles) {
			sb.append(vehicle.toString()).append("\n");
		}
		return sb.toString();
	}
}
