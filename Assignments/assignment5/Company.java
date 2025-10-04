package assignment5;

public class Company {
	String companyName="Zoho";
	public static class Department{
		String deptName = "Development";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company comp = new Company();
		System.out.println(comp.companyName);
		
		Department dept = new Department();
		System.out.println(dept.deptName);
	}

}
