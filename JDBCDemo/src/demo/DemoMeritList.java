package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoMeritList {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
			Statement stmt = conn.createStatement();

			String sql = "select * from student";

			ResultSet rs = stmt.executeQuery(sql);

			List<Student> studentList = new ArrayList<Student>();

			while (rs.next()) {
				studentList.add(new Student(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}

			Collections.sort(studentList);

			for (Student s : studentList) {
				System.out.println(s);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found");
		} catch (SQLException e) {
			System.out.println("SQL excpetion");
		}

	}

}
