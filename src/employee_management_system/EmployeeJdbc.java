package employee_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeJdbc {
	
	
	public static void main(String[] args) {
		
		
		 try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Yogesh.@0059");

	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter Database Name: ");
	            String dbname = sc.next();

	            String query = "CREATE DATABASE " + dbname;

	            Statement stmt = connection.createStatement();
	            stmt.executeUpdate(query);

	            System.out.println("Database '" + dbname + "' created successfully!");

	            stmt.close();
	            connection.close();
	            sc.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
	

}
