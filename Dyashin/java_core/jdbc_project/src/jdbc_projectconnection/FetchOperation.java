package jdbc_projectconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/college";
		String username="postgres";
		String password = "postgres";
		try {
			//load the driver
			Class.forName("org.postgresql.Driver");
			
			//establish the connection
			Connection connect = DriverManager.getConnection(url,username,password);
			
			//Create the statement
			Statement stmt = connect.createStatement();
			
			//execute the query - result set is used to store data
			ResultSet result = stmt.executeQuery("SELECT * FROM employee.employee_details");
			while(result.next()) {
				System.out.println(result.getString("employee_name"));
			}
			
			connect.close();
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

}
