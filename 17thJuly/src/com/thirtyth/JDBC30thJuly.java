package com.thirtyth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class JDBC30thJuly {

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

		/*
		 * tHIS IS STATIC SQL
		 * 
		 * Statement st = con.createStatement();
		 * 
		 * String firstName="Donaldino"; String lastName="Trumpetino"; String
		 * department="IT"; String designation="Analyst"; String stringDOJ="2018-07-31";
		 * 
		 * Date DoJ = Date.valueOf(stringDOJ);
		 * 
		 * String SQLQuery =
		 * "INSERT INTO EMPLOYEES5 VALUES('"+firstName+"','"+lastName+"','"+department+
		 * "','"+designation+"','"+DoJ+"'"; // END OF STATIC SQL^
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("enter fName, lName, dept, desig, doj(YYYY-MM-DD):");
			String fName = br.readLine();
			String lName = br.readLine();
			String dept = br.readLine();
			String desig = br.readLine();
			String strDate = br.readLine();
			Date doj = Date.valueOf(strDate);

			String sqlSTMT = "INSERT INTO EMPLOYEE5 values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sqlSTMT);

			pstmt.setString(1, fName);
			pstmt.setString(2, lName);
			pstmt.setString(3, dept);
			pstmt.setString(4, desig);
			pstmt.setDate(5, doj);

			int x = pstmt.executeUpdate();
			if (x > 0)
				System.out.println("Successfully Inserted ");
			else
				System.out.println("Insert Failed");

		} catch (SQLException e) {
			System.out.println("SQL Exception" + e.getMessage());
		} catch (IOException io) {
			System.out.println("IOException" + io.getMessage());
		}
	}

}
