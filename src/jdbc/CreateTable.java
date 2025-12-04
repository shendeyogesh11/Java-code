package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelr", "root", "Yogesh.@0059");
			
			Statement st = connection.createStatement();
			
			
			String query="create table customer(\r\n"
					+ "cno int primary key,\r\n"
					+ "cname varchar(10) not null,\r\n"
					+ "cage int not null)";
			
			st.execute(query);
			
			System.out.println("Table created");
			
			st.close();
			connection.close();
			
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}

}
