package com.method.factory;

public class LionFactory extends AnimalFactory {

	@Override
	public Lion createAnimal() {
		return new Lion();
	}

}
