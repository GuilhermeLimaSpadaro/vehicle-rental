package model.entities;

import java.util.Objects;
import model.entities.subentities.Engine;

public class Vehicle {

	private int idVehicle;
	private String mark;
	private String model;
	private int year;
	private double value;
	private int doors;
	private Engine engine;
	private boolean rental;

	public Vehicle() {
	}

	public Vehicle(int idVehicle, String mark, String model, int year, double value, int doors, Engine engine,
			boolean rental) {
		this.idVehicle = idVehicle;
		this.mark = mark;
		this.model = model;
		this.year = year;
		this.value = value;
		this.doors = doors;
		this.engine = engine;
		this.rental = rental;
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

	@Override
	public String toString() {
		return "ID: " + idVehicle + "\nMarca: " + mark + "\nModelo: " + model + "\nAno: " + year + "\nValor: " + value
				+ "\nPortas: " + doors + "\n" + engine;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mark);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(mark, other.mark);
	}

}
