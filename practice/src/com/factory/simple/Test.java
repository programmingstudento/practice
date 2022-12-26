package com.factory.simple;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		String names = "Buffalo,Lion,Wolf,Zebra";
		Stream<Animal> animals = Stream.of(names.split(",")).map(AnimalFactory::createAnimal);
		animals.forEach(animal -> animal.eat());
	}
}
