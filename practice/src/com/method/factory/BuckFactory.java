package com.method.factory;

public class BuckFactory extends AnimalFactory {

	@Override
	public Buck createAnimal() {
		return new Buck();
	}

}
