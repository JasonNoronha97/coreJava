package com.thirtyth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommitStuff {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			con.setAutoCommit(false);

			String sqlQuery = "INSERT INTO DAILYSTEPS VALUES(?,?,?)";

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			pstmt = con.prepareStatement(sqlQuery);

			System.out.println("Input name, Date and Number of Steps: ");

			String name = br.readLine();
			Date date1 = Date.valueOf(br.readLine());
			int steps = Integer.parseInt(br.readLine());

			pstmt.setString(1, name);
			pstmt.setDate(2, date1);
			pstmt.setInt(3, steps);

			int x = pstmt.executeUpdate();

			if (x > 0) {
				System.out.println("Success - rec inserted to DAILYSTEPS.");
				String sqlQuery1 = "UPDATE TOTALSTEPS set steps=steps+? WHERE name='" + name + "'";

				pstmt1 = con.prepareStatement(sqlQuery1);
				pstmt1.setInt(1, steps);

				int y = pstmt1.executeUpdate();
				if (y > 0) {
					System.out.println("RECORDS INSERTED TO BOTH TABLES AND UPDATED...");
					con.commit();
					System.out.println("Committed");
				} else {
					System.out.println("--UPDATE FAILED--");
					con.rollback();
					System.out.println("DB rolled Back to original state");
				}
			} else {
				System.out.println("Fail");
			}

		} catch (SQLException sql) {
			System.out.println("SQL EXC");
		} catch (IOException e) {
			System.out.println("IOEXC");
			e.printStackTrace();
		}
	}

}
