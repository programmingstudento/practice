package com.method.factory;

public class ZebraFactory extends AnimalFactory {

	@Override
	public Zebra createAnimal() {
		return new Zebra();
	}

}
