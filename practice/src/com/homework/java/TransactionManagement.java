package com.homework.java;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class TransactionManagement {
	private static final String SELECT1 = "SELECT BALANCE,ACCHOLDERNAME FROM BANKACCOUNT WHERE ACCNO = ?";
	private static final String SELECT2 = "SELECT BALANCE,ACCHOLDERNAME FROM BANKACCOUNT WHERE ACCNO = ?";
	private static final String UPDATE1 = "UPDATE BANKACCOUNT SET BALANCE = BALANCE - ? WHERE ACCNO = ?";
	private static final String UPDATE2 = "UPDATE BANKACCOUNT SET BALANCE = BALANCE + ? WHERE ACCNO = ?";

	public static void main(String[] args) {
		Connection connection = null;
		Scanner scanner = null;
		PreparedStatement preparedStatement1 = null;
		PreparedStatement preparedStatement2 = null;
		PreparedStatement preparedStatement3 = null;
		PreparedStatement preparedStatement4 = null;
		ResultSet resultSet1 = null;
		ResultSet resultSet2 = null;
		try {
			int count = -1;
			scanner = new Scanner(System.in);
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			preparedStatement1 = connection.prepareStatement(SELECT1);
			preparedStatement2 = connection.prepareStatement(SELECT2);
			preparedStatement3 = connection.prepareStatement(UPDATE1);
			preparedStatement4 = connection.prepareStatement(UPDATE2);

			connection.setAutoCommit(false);

			out.print("Enter account number for money to withdraw : ");
			int accnoSource = scanner.nextInt();
			out.print("Enter amount money to withdraw : ");
			double withdrawAmount = scanner.nextDouble();

			preparedStatement3.setDouble(1, withdrawAmount);
			preparedStatement3.setInt(2, accnoSource);
			count = preparedStatement3.executeUpdate();

			out.print("Enter account number for money to deposit : ");
			int accnoDestination = scanner.nextInt();
			out.print("Enter amount money to deposit : ");
			double depositAmount = scanner.nextDouble();

			preparedStatement4.setDouble(1, depositAmount);
			preparedStatement4.setInt(2, accnoDestination);
			count = preparedStatement4.executeUpdate();

			if (count > 0) {
				connection.commit();

				preparedStatement1.setInt(1, accnoSource);
				preparedStatement2.setInt(1, accnoDestination);
				resultSet1 = preparedStatement1.executeQuery();
				resultSet2 = preparedStatement2.executeQuery();
				if (resultSet1.next()) {
					System.out.printf("Name : %s Balance : %f%n", resultSet1.getString(2), resultSet1.getDouble(1));
				}
				if (resultSet2.next()) {
					System.out.printf("Name : %s Balance : %f%n", resultSet2.getString(2), resultSet2.getDouble(1));
				}
			} else {
				connection.rollback();
			}
		} catch (SQLException e) {
			if (Objects.nonNull(connection)) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (resultSet1 != null) {
				try {
					resultSet1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (resultSet2 != null) {
				try {
					resultSet2.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (preparedStatement1 != null) {
				try {
					preparedStatement1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (preparedStatement2 != null) {
				try {
					preparedStatement2.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (preparedStatement3 != null) {
				try {
					preparedStatement3.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (preparedStatement4 != null) {
				try {
					preparedStatement4.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (scanner != null) {
				try {
					scanner.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
