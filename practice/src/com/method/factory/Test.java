package com.method.factory;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Animal[] animals = { new LionFactory().createAnimal(), new ZebraFactory().createAnimal(),
				new BuckFactory().createAnimal() };
		Stream.of(animals).forEach((final Animal animal) -> animal.eat());
	}

}
