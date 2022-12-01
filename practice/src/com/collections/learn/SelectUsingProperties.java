package com.collections.learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class SelectUsingProperties {
	private static final String QUERY = "SELECT EMPNO,SAL,JOB,HIREDATE FROM EMP WHERE EMPNO = ?";

	public static void main(String[] args) {
		try (InputStream inputStream = new FileInputStream("src/Db.properties")) {
			Properties properties = new Properties();
			properties.load(inputStream);

			try (Scanner scanner = new Scanner(System.in);
					Connection connection = DriverManager.getConnection(properties.getProperty("jdbc-url"),
							properties.getProperty("username"), properties.getProperty("password"));
					PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
				System.out.print("Enter Employee Number : ");
				preparedStatement.setInt(1, scanner.nextInt());
				try (ResultSet resultSet = preparedStatement.executeQuery();) {
					if (resultSet.next()) {
						System.out.printf("Empno : %d Salary : %d Job : %s Hiredate %tY-%tb-%td", resultSet.getInt(1),
								resultSet.getInt(2), resultSet.getString(3), resultSet.getDate(4), resultSet.getDate(4),
								resultSet.getDate(4));

					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
