package assignment5;

public class School {
	String schoolName;
	public class Student{
		String studentName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school = new School();
		School.Student student = school.new Student();
		
		school.schoolName = "AMGHSS";
		student.studentName = "Pricilla";
		System.out.println(school.schoolName+","+student.studentName);
	}

}
