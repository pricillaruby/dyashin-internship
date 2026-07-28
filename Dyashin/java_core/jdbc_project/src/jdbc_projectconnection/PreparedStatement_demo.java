package jdbc_projectconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatement_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:postgresql://localhost:5432/college";
		String username = "postgres";
		String password = "1907";
		
		try {
			
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			//create
			String createuser = "INSERT INTO company.employee(emp_name,dept_id)VALUES(?,?)";
			PreparedStatement pstmtinsert = con.prepareStatement(createuser);
			pstmtinsert.setString(1, "Kavin");
			pstmtinsert.setInt(2, 4);
			System.out.println("One row inserted!");
			pstmtinsert.executeUpdate();
			
			//fetch
			String fetchuser = "SELECT * FROM company.employee";
			PreparedStatement pstmtfetch = con.prepareStatement(fetchuser);
			ResultSet res = pstmtfetch.executeQuery();
			System.out.println("Users list");
			while(res.next()) {
				System.out.println(res.getString("emp_name"));
			}
			
			//update
			String updateuser = "UPDATE company.employee SET dept_id=? WHERE emp_id=?";
			PreparedStatement pstmtupdate = con.prepareStatement(updateuser);
			pstmtupdate.setInt(1, 5);
			pstmtupdate.setInt(2, 4);
			pstmtupdate.executeUpdate();
			System.out.println("User updated");
			
			//delete
			String deleteuser = "DELETE FROM company.employee WHERE emp_id=?";
			PreparedStatement pstmtdelete = con.prepareStatement(deleteuser);
			pstmtdelete.setInt(1, 3);
			pstmtdelete.executeUpdate();
			System.out.println("User deleted");
			
			con.close();
			
		} catch(Exception e) {
			
			System.out.println("Error:"+e.getMessage());
			
		}

	}

}
