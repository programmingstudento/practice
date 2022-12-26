package com.factory.simple;

public class AnimalFactory {
	private AnimalFactory() {

	}

	public static Animal createAnimal(String animalName) {
		Animal animal = null;
		if ("Lion".equalsIgnoreCase(animalName)) {
			animal = new Lion();
		} else if ("Wolf".equalsIgnoreCase(animalName)) {
			animal = new Wolf();
		} else if ("Zebra".equalsIgnoreCase(animalName)) {
			animal = new Zebra();
		} else if ("Buffalo".equalsIgnoreCase(animalName)) {
			animal = new Buffalo();
		} else {
			throw new IllegalArgumentException("Invalid animal name");
		}
		return animal;
	}
}
