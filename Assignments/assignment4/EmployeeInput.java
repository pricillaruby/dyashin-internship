package assignment4;

import java.util.Scanner;

public class EmployeeInput {
	String employeeName;
	double salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInput e1 = new EmployeeInput();
		EmployeeInput e2 = new EmployeeInput();
		EmployeeInput e3 = new EmployeeInput();
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=3;i++) {
			System.out.println("Enter Employee "+i);
			String name = sc.next();
			
			System.out.println("Enter Salary: "+i);
			double empSalary = sc.nextDouble();
			
			switch(i) {
			case 1:
				e1.employeeName = name;
				e1.salary = empSalary;
				break;
	
			case 2:
				e2.employeeName = name;
				e2.salary = empSalary;
				break;
		  
			case 3:
				e3.employeeName = name;
				e3.salary = empSalary;
				break;
			default:
				System.out.println("Enter Valid Option");
		    }
			if(empSalary<30000) {
				System.out.println("Bonus Eligible");
			}else {
				System.out.println("No Bonus");
			}
	   }
	}
}
