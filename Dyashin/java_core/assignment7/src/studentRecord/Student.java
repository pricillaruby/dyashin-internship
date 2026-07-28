package studentRecord;

public class Student extends Person{
	long rollNo;
	String course;
	public Student(String name, int age,long rollNo,String course) {
		super(name, age);
		this.rollNo = rollNo;
		this.course = course;
		// TODO Auto-generated constructor stub
	}

}
