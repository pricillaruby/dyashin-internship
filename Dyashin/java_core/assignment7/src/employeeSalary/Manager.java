package employeeSalary;

public class Manager extends Employee{
	Manager(String name, int id, double basicSalary) {
		super(name, id, basicSalary);
		// TODO Auto-generated constructor stub
	}
	double incentives = 3000;
	public void managerTotalSalary() {
		double totalSalary = incentives + basicSalary;
		System.out.println("Total Salary of Manager: "+totalSalary);
	}
}
