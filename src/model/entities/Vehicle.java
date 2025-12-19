package model.entities;

import model.entities.subentities.Engine;

public class Vehicle {

	private int idVehicle;
	private String mark;
	private String model;
	private int year;
	private double value;
	private int doors;
	Engine engine;
	private boolean rental;

	public Vehicle() {
	}

	public Vehicle(int idVehicle, String mark, String model, int year, double value, int doors, Engine engine) {
		this.idVehicle = idVehicle;
		this.mark = mark;
		this.model = model;
		this.year = year;
		this.value = value;
		this.doors = doors;
		this.engine = engine;
	}
	
	public Vehicle(int idVehicle, String mark, String model, int year, double value, int doors, Engine engine, boolean rental) {
		this.idVehicle = idVehicle;
		this.mark = mark;
		this.model = model;
		this.year = year;
		this.value = value;
		this.doors = doors;
		this.engine = engine;
		this.rental = rental;
	}
	
	public Vehicle(boolean rental) {
		this.rental = rental;
	}

	public Vehicle(String model) {
		this.model = model;
	}

	public int getIdVehicle() {
		return idVehicle;
	}

	public void setIdVehicle(int idVehicle) {
		this.idVehicle = idVehicle;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public boolean isRent() {
		return rental;
	}

	public void setRent(boolean rent) {
		this.rental = rent;
	}

	public double ipvaSum() {
		return getValue() * 0.00;
	}

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
