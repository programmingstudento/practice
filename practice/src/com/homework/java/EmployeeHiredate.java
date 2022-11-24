package com.homework.java;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;
import static java.lang.System.out;

public class EmployeeHiredate {
	private static final String CALL_FUNCTION = "{?=call FIND_HIREDATE(?)}";

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott",
						"tiger");
				CallableStatement callableStatement = connection.prepareCall(CALL_FUNCTION);) {
			out.print("Enter emp no");
			int empno = scanner.nextInt();
			callableStatement.registerOutParameter(1, Types.DATE);
			callableStatement.setInt(2, empno);
			callableStatement.execute();

			out.format("Hiredate : %tY-%tb-%td", callableStatement.getDate(1), callableStatement.getDate(1),
					callableStatement.getDate(1));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
