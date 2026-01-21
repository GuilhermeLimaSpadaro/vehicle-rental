package model.entities;

import java.util.Objects;

public class Vehicle {

	private int idVehicle;
	private String mark;
	private String model;
	private int year;
	private double value;
	private int doors;
	private int wHP;
	private String engineType;

	public Vehicle(int idVehicle, String mark, String model, int year, double value, int doors, int wHP,
			String engineType) {
		this.idVehicle = idVehicle;
		this.mark = mark;
		this.model = model;
		this.year = year;
		this.value = value;
		this.doors = doors;
		this.wHP = wHP;
		this.engineType = engineType;
	}

	public int getIdVehicle() {
		return idVehicle;
	}

	public String getMark() {
		return mark;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getValue() {
		return value;
	}

	public int getDoors() {
		return doors;
	}

	public int getwHP() {
		return wHP;
	}

	public String getEngineType() {
		return engineType;
	}

	@Override
	public String toString() {
		return "Vehicle ID: " + idVehicle + " Marca: " + mark + " Modelo: " + model + " Ano: " + year + " Valor: "
				+ value + " Portas: " + doors + " wHP: " + wHP + " Motor: " + engineType + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idVehicle, model);
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
		return idVehicle == other.idVehicle && Objects.equals(model, other.model);
	}

}
