package com.home.football;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SingletonLazy {
	private static SingletonLazy lazy;

	private SingletonLazy() {

	}

	public static synchronized SingletonLazy getSingletonLazy() {
		if (Objects.isNull(lazy)) {
			lazy = new SingletonLazy();
		}
		return lazy;
	}

	public static void main(String[] args) {
		SingletonLazy singletonLazy1 = getSingletonLazy();
		SingletonLazy singletonLazy2 = getSingletonLazy();
		Set<SingletonLazy> set = new HashSet<>();
		set.add(singletonLazy1);
		set.add(singletonLazy2);
		System.out.println(set.size());
	}
}
