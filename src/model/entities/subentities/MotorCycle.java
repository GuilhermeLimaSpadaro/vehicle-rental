package model.entities.subentities;

import model.entities.Vehicle;

public class MotorCycle extends Vehicle{

	public MotorCycle(int idVehicle, String mark, String model, int year, double value, int doors, Engine engine) {
		super(idVehicle, mark, model, year, value, doors, engine);
	}

	public double sumIpva() {
		return getValue()*0.04;
	}
	
	@Override
	public String toString() {
	    return "ID: " + getIdVehicle() +
	           "\nMarca: " + getMark() +
	           "\nModelo: " + getModel() +
	           "\nAno: " + getYear() +
	           "\nValor: " + getValue() +
	           "\n" + getEngine();
	}
}
