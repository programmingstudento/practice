package com.homework.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

public class BatchProcessing {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott",
						"tiger");
				Statement statement = connection.createStatement();) {

			connection.setAutoCommit(false);
			statement.addBatch(insertQuery(1002, "Javascript", 10_000));
			statement.addBatch(insertQuery(1003, "Python", 8_000));
			// statement.addBatch("INSERT INTO BANKACCOUNT VALUES (%d,%n,%f)");
			statement.addBatch(insertQuery(1004, "Typescript", 9_000));

			int[] updates = statement.executeBatch();
			boolean flag = Arrays.stream(updates).allMatch(num -> num > 0);
			if (flag) {
				connection.commit();
			} else {
				connection.rollback();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static String insertQuery(int accNumber, String acctholderName, double balance) {
		return String.format("INSERT INTO BANKACCOUNT VALUES (%d,%f,'%s')",
				new Object[] { accNumber, balance, acctholderName });
	}
}
