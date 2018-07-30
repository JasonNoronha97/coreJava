package com.thirtyth;

import java.sql.*;

public class CallableClass {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		
		String sql="{?=call bigger(?,?)}";
		CallableStatement csmt = con.prepareCall(sql);
		
		try {
			csmt.registerOutParameter(1, Types.INTEGER);

			csmt.setInt(2, 32);
			csmt.setInt(3, -82);

			boolean rs = csmt.execute();
			
				System.out.println("SQL statement is executed successfully.");
				System.out.println("Greater number is " + csmt.getInt(1));
			
				//System.out.println("Not successful");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exc");
			e.printStackTrace();
		}

		csmt.close();
		con.close();
	}
}
