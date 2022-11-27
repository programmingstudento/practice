package com.collections.learn;

import static java.lang.System.out;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Check {

	public static void main(String[] args) {
		int number = 0;
		LocalTime localTime1 = LocalTime.now();
		for (int index = 0, num = Integer.MAX_VALUE; index < num; index++) {
			number = number * 1;
		}
		LocalTime localTime2 = LocalTime.now();
		long micros = ChronoUnit.MICROS.between(localTime1, localTime2);
		out.println(micros);

		localTime1 = LocalTime.now();
		for (int index = Integer.MAX_VALUE - 1; index >= 0; index--) {
			number = number * 1;
		}
		localTime2 = LocalTime.now();
		micros = ChronoUnit.MICROS.between(localTime1, localTime2);
		out.println(micros);
	}
}
