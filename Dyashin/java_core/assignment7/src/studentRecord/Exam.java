package studentRecord;

public class Exam extends Student{
	int marks;
	public Exam(String name, int age, long rollNo, String course,int marks) {
		super(name, age, rollNo, course);
		this.marks = marks;
		// TODO Auto-generated constructor stub
	}
	
	public void calculateGrade() {
		System.out.println("Name: "+name+"\n"+"Age: "+age+"\n"+"RollNo: "+rollNo+"\n"+"Course: "+course+"\n"+"Marks: "+marks);
		if((marks >= 90)&&(marks<=100)) {
			System.out.println("Grade A");
		}else if ((marks>=75)&&(marks<=89)) {
			System.out.println("Grade B");
		}else if((marks>=60)&&(marks<=74)) {
			System.out.println("Grade C");
		}else if((marks>=40)&&(marks<=59)) {
			System.out.println("Grade D");
		}else {
			System.out.println("Fail");
		}
	}

}
