package com.homework.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeDeserialize {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Java", "Sql", 25);
		String filePath = null;
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.print("Enter path : ");
			filePath = scanner.next();

			// converting employee object to byte stream.
			try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream(new File(filePath)));) {
				objectOutputStream.writeObject(employee);
				System.out.println("Writing Sucess.");
			}

			// converting byte stream to object of Employee type.
			try (ObjectInputStream objectInputStream = new ObjectInputStream(
					new FileInputStream(new File(filePath)));) {
				Employee one = (Employee) objectInputStream.readObject();
				System.out.println("Reading Success.");
				System.out.println(one);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
