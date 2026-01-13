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
	public void removeCar(Vehicle vehicle) throws VehicleServiceException {
		if (!vehicles.contains(vehicle)) {
			throw new VehicleServiceException("Veiculo ja removido!");
		}

		Vehicle v = vehicles.get(vehicles.indexOf(vehicle));

		if (v.isRent()) {
			throw new VehicleServiceException("Veiculo esta alugado!");
		}

		vehicles.remove(vehicle);
	}

	@Override
	public void rentVehicle(Vehicle vehicleRental) throws VehicleServiceException {
		if (!vehicles.contains(vehicleRental)) {
			throw new VehicleServiceException("Carro nao encontrado!");
		}

		Vehicle v = vehicles.get(vehicles.indexOf(vehicleRental));

		if (v.isRent()) {
			throw new VehicleServiceException("Carro ja esta alugado!");
		}

		v.setRent(true);
	}
	
	@Override
	public Vehicle findVehicle(String vehicle) {
		for(Vehicle v : vehicles) {
			if (v.getModel().equalsIgnoreCase(vehicle)) {
				 return v;
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
