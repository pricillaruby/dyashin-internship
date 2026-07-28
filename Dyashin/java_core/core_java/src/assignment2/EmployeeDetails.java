package assignment2;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//employeeID
		System.out.println("Enter Employee ID:");
		String employeeID = in.nextLine();
		
		//employeename
		System.out.println("Enter Employee Name:");
		String employeeName = in.nextLine();
		
		//department
		System.out.println("Enter Department:");
		String department = in.nextLine();
		
		//designation
		System.out.println("Enter Designation:");
		String designation = in.nextLine();

		//salary
		System.out.println("Enter Salary:");
		float salary = in.nextFloat();
		
		//contactNumber
		System.out.println("Enter Contact Number:");
		long contactNumber = in.nextLong();
		
		//email
		System.out.println("Enter Email:");
		String email = in.next();
		
		//address
		System.out.println("Enter Address:");
		String address = in.next();
		
		System.out.println("Employee Details");
		System.out.println("Employee ID : "+employeeID);
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Department:"+department);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
		System.out.println("Contact Number:"+contactNumber);
		System.out.println("Email:"+email);
		System.out.println("Address:"+address);
	}

}
