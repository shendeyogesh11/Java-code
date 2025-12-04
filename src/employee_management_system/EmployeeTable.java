package employee_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeTable {
	
	public static void main(String[] args) {
		
		 try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management", "root", "Yogesh.@0059");

	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter Table Name: ");
	            String tbname = sc.next();

	            String query = "CREATE TABLE " + tbname + " (eno INT, ename VARCHAR(30), salary DOUBLE, dept VARCHAR(30), gender VARCHAR(10), dob DATE)";

	            Statement stmt = connection.createStatement();
	            stmt.executeUpdate(query);

	            System.out.println("Table '" + tbname + "' created successfully!");

	            stmt.close();
	            connection.close();
	            sc.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
		
	}

}
