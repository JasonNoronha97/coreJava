package com.twentyseventh;

//code: 21172306 

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemos {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("CLassFound");
		} catch (ClassNotFoundException e1) {
			System.out.println("Unable to locate the driver.");
		}
		String jdbcURL = "jdbc:oracle:thin:127.0.0.1:1521:orcl";
		String Username = "scott";
		String password = "tiger";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(jdbcURL, Username, password);
			System.out.println("Login successful, now your program is connected.");

			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM EMPLOYEE");

			while (rs.next()) {
				String fname = rs.getString(1);
				String salary = rs.getString(2);
				String dept = rs.getString(3);

				System.out.println("Fname: " + fname + " salary: " + salary + "\tdept: " + dept);
			}

		} catch (SQLException e) {
			System.out.println("Could not connect to server.");
			System.out.println(e.getMessage());
		} finally {
			rs.close();
			st.close();
			con.close();
		}
	}

}
