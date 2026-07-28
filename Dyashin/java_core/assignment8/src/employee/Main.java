package employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ruby");
		emp.setSalary(-1000);
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		emp.setSalary(-2000);
		System.out.println(emp.getSalary());
	}

}
