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

	public void addCar(Vehicle vehicle) throws VehicleServiceException {
		for (Vehicle addVehicle : vehicles) {
			if (addVehicle.getModel().equals(addVehicle.getModel())) {
				throw new VehicleServiceException("Veiculo ja cadastrado.");
			}
		}
		vehicles.add(vehicle);
	}

	public void removeCar(Vehicle vehicle)throws VehicleServiceException {
	
		for (Vehicle remoVehicle : vehicles) {
			if(remoVehicle.getModel().equals((remoVehicle.getModel()))){
				throw new VehicleServiceException("Veiculo ja cadastrado!");
			}
		}
		
		removeCar(vehicle);
	
	}

	public void rentVehicle(Vehicle vehicleRental) throws VehicleServiceException {
		if (vehicles.isEmpty()) {
			throw new VehicleServiceException("Nenhum carro cadastrado!");
		}

		Vehicle found = null;

		for (Vehicle  vehicle : vehicles) {
			if (vehicle.getModel().equals(vehicleRental.getModel())) {
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

	public String showInfo() throws VehicleServiceException {
		if (vehicles.isEmpty()) {
			throw new VehicleServiceException("Veiculo nao cadastrado!");
		}
		StringBuilder sb = new StringBuilder();
		for (Vehicle vehicle : vehicles) {
			sb.append(vehicle.toString());
		}
		return sb.toString();
	}

	public double sumIPVA(double value) {
		return value * 0.00;
	}

}
