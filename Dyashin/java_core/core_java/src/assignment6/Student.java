package assignment6;

public class Student {
	String name;
	int rollNo;
	String grade;
	public Student(String name,int rollNo,String grade) {
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}
	public void displayDetails() {
		System.out.println("Name: "+name+" "+"Roll No: "+rollNo+" "+"Grade: "+grade);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud1 = new Student("Pricilla",33,"B");
		stud1.displayDetails();
		Student stud2 = new Student("Praveena",31,"B+");
		stud2.displayDetails();
		Student stud3 = new Student("Jinu",23,"A");
		stud3.displayDetails();

	}

}
