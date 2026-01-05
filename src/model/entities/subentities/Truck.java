package model.entities.subentities;

import model.entities.Vehicle;

public class Truck extends Vehicle{

	public Truck(int idVehicle, String mark, String model, int year, double value, int doors, Engine engine) {
		super(idVehicle, mark, model, year, value, doors, engine);
	}
	
	public double sumIpva() {
		return getValue()*0.15;
	}
	
	@Override
	public String toString() {
	    return "ID: " + getIdVehicle() +
	           "\nMarca: " + getMark() +
	           "\nModelo: " + getModel() +
	           "\nAno: " + getYear() +
	           "\nValor: " + getValue() +
	           "\nPortas: " + getDoors() +
	           "\n" + getEngine();
	}
}
