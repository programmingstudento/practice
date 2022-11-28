package com.collections.learn;

import java.util.List;
import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>(List.of("Scala", "Ruby", "SQL", "Haskell"));
		Vector<String> names = new Vector<>();
		System.out.println(names.add("Java"));
		names.addElement("SQL");
		System.out.println(names);

		names.add(1, "Typescript");
		names.insertElementAt("Javascript", 2);
		System.out.println(names);

		names.addAll(List.of("Scala", "C#", "Javascript", "Python", "PHP"));
		System.out.println(names);
		System.out.println(names.capacity() + " " + names.size());

		System.out.println(names.remove("Javascript"));
		System.out.println(names);
		System.out.println(names.capacity() + " " + names.size());

		System.out.println(names.removeAll(List.of("PHP", "C#")));
		System.out.println(names);
		System.out.println(names.capacity() + " " + names.size());

		names.removeAll(vector);
		System.out.println(names);
		System.out.println(names.capacity() + " " + names.size());

		vector.retainAll(names);
		System.out.println(vector);
		System.out.println(vector.capacity() + " " + vector.size());

		names.setElementAt("Kotlin", 3);
		System.out.println(names);
		System.out.println(names.capacity() + " " + names.size());
	}
}
