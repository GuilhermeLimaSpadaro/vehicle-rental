package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Vehicle;
import model.exception.VehicleServiceException;
import model.interfaces.VehicleInterface;

public class VehicleServices implements VehicleInterface {

	static private List<Vehicle> vehicles = new ArrayList<>();

	public VehicleServices() {
	}

	public static List<Vehicle> getVehicles() {
		return vehicles;
	}

	public static void setVehicles(List<Vehicle> vehicles) {
		VehicleServices.vehicles = vehicles;
	}

	public void addCar(Vehicle car) {
		vehicles.add(car);
	}

	public void removeCar(Vehicle car) {
		vehicles.remove(car);
	}

	public void rentVehicle(Vehicle vehicleRental) throws VehicleServiceException {
		if (vehicles.isEmpty()) {
			throw new VehicleServiceException("Nenhum carro cadastrado!");
		}

		Vehicle found = null;

		for (Vehicle vehicle : vehicles) {
			if (vehicle.equals(vehicleRental)) {
				found = vehicle;
				break;
			}
		}

		if (found == null) {
			throw new VehicleServiceException("Carro não encontrado!");
		}

		if (found.isRent()) {
			throw new VehicleServiceException("Carro já está alugado.");
		}

		found.setRent(true);
	}

	public String showInfo() {
		StringBuilder sb = new StringBuilder();
		for (Vehicle vehicle : vehicles) {
			sb.append("Marca: ").append(vehicle.getMark()).append("\n ").append("Modelo: ").append(vehicle.getModel())
					.append("\n ").append("Ano: ").append(vehicle.getYear()).append("\n ").append("Valor: ")
					.append(vehicle.getValue()).append("\n ").append("Portas: ").append(vehicle.getDoors())
					.append("\n ").append("Motor: ").append(vehicle.getEngine()).append("\n ").append("wHP: ")
					.append(vehicle.getEngine()).append("\n ");
		}
		return sb.toString();
	}

}
