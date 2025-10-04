package assignment6;

public class Employee {
	String empID;
	String empName;
	int salary;
	public Employee(String empID,String empName,int salary) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	public void displayEmployee() {
		System.out.println("Employee Id: "+empID+" "+"Employee Name: "+empName+" "+"Salary: "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("PR033","Pricilla",468024);
		Employee emp2 = new Employee("RB032","Ruby",468291);
		
		emp1.displayEmployee();
		emp2.displayEmployee();
		
	}

}
