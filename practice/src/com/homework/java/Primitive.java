package com.homework.java;

public class Primitive {

	public String determineType(String number) {
		String type = null;
		try {
			if (Long.valueOf(number) > Integer.MAX_VALUE || Long.valueOf(number) < Integer.MIN_VALUE) {
				type = "long";
			} else if (Integer.valueOf(number) > Short.MAX_VALUE || Integer.valueOf(number) < Short.MIN_VALUE) {
				type = "int";
			} else if (Short.valueOf(number) > Byte.MAX_VALUE || Short.valueOf(number) < Byte.MIN_VALUE) {
				type = "short";
			} else
				type = "long";
		} catch (NumberFormatException e) {
			type = "none";
		}
		return type;
	}

	public static void main(String[] args) {
		System.out.println(new Primitive().determineType("-803847"));
		System.out.println(new Primitive().determineType("-47"));
		System.out.println(new Primitive().determineType("-32768"));
		System.out.println(new Primitive().determineType("12311111111111111111111111111112333333333"));
	}
}