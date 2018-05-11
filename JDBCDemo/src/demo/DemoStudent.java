package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoStudent {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
			Statement stmt = conn.createStatement();
			
			
			System.out.println("Connection established");

			// Select Query

			String sql = "select * from student";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println("Name = " + rs.getString(2) + "\t Marks = " + rs.getInt(3));
			}

			// Insert Query

			// String sql = "Insert into student values(103,'Geroge',90)";
			// stmt.executeUpdate(sql);
			// System.out.println("Data inserted successfully!!");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found");
		} catch (SQLException e) {
			System.out.println("SQL excpetion");
		}

	}

}
