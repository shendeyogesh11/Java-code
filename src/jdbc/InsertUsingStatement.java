package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {
	
	public static void main(String[] args) {
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelr", "root", "Yogesh.@0059");
		
		Statement st = connection.createStatement();
		
		String query = "insert into customer values (1,'Alice',21), (3,'cris',23) ";
		
		int rows = st.executeUpdate(query);
		
		
		if(rows > 0) {
			
		  System.out.println(rows + " Records Inserted");
		}
		else {
			System.out.println("No records inserted");
		}
		
		
		st.close();
		connection.close();
		
		} catch(Exception e1) {
			
			e1.printStackTrace();
		}
		
	}

}
