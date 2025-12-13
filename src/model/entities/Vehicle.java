package model.entities;

import model.entities.subentities.Engine;
import model.exception.VehicleServiceException;

public class Vehicle {

	private int id;
	private String mark;
	private String model;
	private int year;
	private double value;
	private int doors;
	Engine engine;
	private boolean rent;

	public Vehicle() {
	}

	public Vehicle(int id, String mark, String model, int year, double value, int doors, Engine engine) {
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.year = year;
		this.value = value;
		this.doors = doors;
		this.engine = engine;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
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
		return rent;
	}

	public void setRent(boolean rent) {
		this.rent = rent;
	}

	public double ipvaSum() {
		return getValue() * 0.00;
	}

	public boolean verifyCar() {
		return rent;
	}

	public String showInfo() throws VehicleServiceException {
		return "";
	}

}
