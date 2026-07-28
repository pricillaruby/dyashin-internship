package assignment4;

public class Employee {
	String employeeName;
	String employeeID;
	int salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.employeeName ="Pricilla";
		employee.employeeID ="264bdsjry782";
		employee.salary = 540000;
		
		System.out.println("Employee: "+employee.employeeName+"\n"+"Employee ID: "+employee.employeeID+"\n"+"Salary: "+employee.salary);
	}

}
