package employeeSalary;

public class Developer extends Employee{
	Developer(String name, int id, double basicSalary) {
		super(name, id, basicSalary);
		// TODO Auto-generated constructor stub
	}
	double bonus = 5000;
	public void developerTotalSalary() {
		double totalSalary = bonus + basicSalary;
		System.out.println("Total Salary of Developer: "+totalSalary);
	}
}
