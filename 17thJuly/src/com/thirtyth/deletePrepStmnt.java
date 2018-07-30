package com.thirtyth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class deletePrepStmnt {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Nor Found Error.");
		}

		String jdbcURL = "jdbc:oracle:thin:127.0.0.1:1521:orcl";
		String Username = "scott";
		String password = "tiger";
		
		Connection con = DriverManager.getConnection(jdbcURL, Username, password);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter Name of employee to be deleted: ");
			String fName = br.readLine();

			String sqlSTMT = "DELETE FROM EMPLOYEE5 WHERE fname=?";
			PreparedStatement pstmt = con.prepareStatement(sqlSTMT);

			pstmt.setString(1, fName);

			int x = pstmt.executeUpdate();
			if (x > 0)
				System.out.println("Successfully Deleted ");
			else
				System.out.println("Delete Failed");

		} catch (SQLException e) {
			System.out.println("SQL Exception" + e.getMessage());
		} catch (IOException io) {
			System.out.println("IOException" + io.getMessage());
		}

	}

}
