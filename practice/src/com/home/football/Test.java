package com.home.football;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.homework.java.Teacher;

public class Test {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Java", 21, 50_000d, "Java School");
		String filePath = null;
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.print("Enter path : ");
			filePath = scanner.next();

			// converting teacher object to byte stream.
			try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream(new File(filePath)));) {
				objectOutputStream.writeObject(teacher);
				System.out.println("Writing Sucess.");
			}

			// converting byte stream to object of Teacher type.
			try (ObjectInputStream objectInputStream = new ObjectInputStream(
					new FileInputStream(new File(filePath)));) {
				Teacher one = (Teacher) objectInputStream.readObject();
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
