package employeeSalary;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager("Pricilla",33,25000);
		manager.managerTotalSalary();
		
		Developer developer = new Developer("Ruby",33303,42000);
		developer.developerTotalSalary();
	}

}
