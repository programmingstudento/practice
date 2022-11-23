package com.homework.java;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;

import static java.lang.System.out;

public class EmployeeBasedOnJob {

	private static final String GET_EMP_BY_JOB = "{CALL GET_EMP_BY_JOB(?,?)}";

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott",
						"tiger");
				CallableStatement callableStatement = connection.prepareCall(GET_EMP_BY_JOB);) {
			out.print("Enter employee job : ");
			String job = scanner.next();
			callableStatement.setString(1, job);
			callableStatement.registerOutParameter(2, OracleTypes.CURSOR);

			callableStatement.execute();
			ResultSet resultSet = (ResultSet) callableStatement.getObject(2);
			while (resultSet.next()) {
				out.printf("Empno %d : Ename %s : Job %s : Salary %d: Hiredate %tY-%tb-%td%n", resultSet.getInt(1),
						resultSet.getString(2), resultSet.getString(3), (int) resultSet.getDouble(6),
						resultSet.getDate(5), resultSet.getDate(5), resultSet.getDate(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
