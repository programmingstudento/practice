package com.prototype;

import lombok.Data;
import lombok.NonNull;

@Data
public class Fruit implements Prototype {
	@NonNull
	private String name;
	@NonNull
	private String color;
	@NonNull
	private Double price;

	@Override
	public Fruit getClone() {
		return new Fruit(name, color, price);
	}
}
