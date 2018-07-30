package com.thirtyth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class BatchUpdate {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class Nor Found Error.");
		}

		String jdbcURL = "jdbc:oracle:thin:127.0.0.1:1521:orcl";
		String Username = "scott";
		String password = "tiger";

		Connection con = DriverManager.getConnection(jdbcURL, Username, password);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PreparedStatement pstmt = null;

		String sqlSTMT = "INSERT INTO EMPLOYEE5 values(?,?,?,?,?)";
		pstmt = con.prepareStatement(sqlSTMT);

		try {
			for (int i = 0; i < 2; i++) {

				System.out.println("enter fName, lName, dept, desig, doj(YYYY-MM-DD):");
				String fName = br.readLine();
				String lName = br.readLine();
				String dept = br.readLine();
				String desig = br.readLine();
				String strDate = br.readLine();
				Date doj = Date.valueOf(strDate);

				pstmt.setString(1, fName);
				pstmt.setString(2, lName);
				pstmt.setString(3, dept);
				pstmt.setString(4, desig);
				pstmt.setDate(5, doj);
				pstmt.addBatch();
			}

		} catch (SQLException e) {
			System.out.println("SQL Exception" + e.getMessage());
		} catch (IOException io) {
			System.out.println("IOException" + io.getMessage());
		}
		System.out.println("---END---");
	}

}
