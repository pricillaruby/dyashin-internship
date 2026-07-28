package jdbc_projectconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_demo {

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
			
			if(connect!=null) {
				System.out.println("DB is connected");
			}else {
				System.out.println("DB is not connected");
			}	
			connect.close();
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	
	}

}
