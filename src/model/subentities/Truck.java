package model.subentities;

import model.entities.Vehicle;
import model.unums.Categories;

public class Truck extends Vehicle {

	public Truck(Integer id, String model, String mark, Double price, String plate, boolean rented,
			Categories categories) {
		super(id, model, mark, price, plate, rented, categories);
	}

}
