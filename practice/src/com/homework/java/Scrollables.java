package com.homework.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.lang.System.out;

public class Scrollables {
	private final static String QUERY = "SELECT EMPNO,ENAME,JOB,HIREDATE FROM EMP";

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott",
				"tiger");
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
				ResultSet resultSet = statement.executeQuery(QUERY);) {
			// top to bottom
			while (resultSet.next()) {
				out.format("Row Number: %d Empno : %d Ename : %s Job %s Hiredate %tY-%tb-%td%n", resultSet.getRow(),
						resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDate(4),
						resultSet.getDate(4), resultSet.getDate(4));
			}

			out.println("******************************************************************************");
			// bottom to top
			while (resultSet.previous()) {
				out.format("Row Number: %d Empno : %d Ename : %s Job %s Hiredate %tY-%tb-%td%n", resultSet.getRow(),
						resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDate(4),
						resultSet.getDate(4), resultSet.getDate(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
