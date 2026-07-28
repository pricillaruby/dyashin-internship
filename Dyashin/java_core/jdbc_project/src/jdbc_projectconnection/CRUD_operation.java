package jdbc_projectconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUD_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/college";
		String username="postgres";
		String password = "postgres";
		
		try {
			//load the driver
			Class.forName("org.postgresql.Driver");
			
			//establish the connection
			Connection connect = DriverManager.getConnection(url, username, password);
			
			//create the statement
			Statement stmt = connect.createStatement();
			
			//For C - create so insert new user
			//Inserting new user that is creating a new one
			String createQuery = "INSERT INTO workers.emp(emp_name,dept_id)VALUES('Steve',3)";
			stmt.executeUpdate(createQuery);
			System.out.println("1 Data is inserted");
			
			//For R->Retrieve
			String fetchQuery = "SELECT * FROM workers.emp";
			ResultSet res = stmt.executeQuery(fetchQuery);
			while(res.next()) {
				System.out.println(res.getString("emp_name")+"-"+res.getInt("dept_id"));
			}
			
			//update for U
			String updateQuery = "UPDATE workers.emp SET emp_name='Jonathan' WHERE emp_id=17";
			stmt.executeUpdate(updateQuery);
			System.out.println("updated");
//			
			//delete for D
			String deleteQuery = "DELETE FROM workers.emp WHERE emp_id=22";
			stmt.executeUpdate(deleteQuery);
			System.out.println("deleted");
			
			connect.close();
		}catch(Exception e) {
			System.out.println("Error "+e.getMessage());
		}
	}

}
