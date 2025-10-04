package assignment4;

public class Student {
	String name;
	int age;
	String branch;
	int usn;
	int marks;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.name = "Pricilla Ruby";
		student1.age = 20;
		student1.branch = "CSE";
		student1.usn = 26348;
		student1.marks = 55;
		
		Student student2 = new Student();
		student2.name = "Jinu";
		student2.age = 19;
		student2.branch = "CSE";
		student2.usn = 26349;
		student2.marks = 65;
		
		Student student3 = new Student();
		student3.name = "Priyanka";
		student3.age = 20;
		student3.branch = "CSE";
		student3.usn = 26350;
		student3.marks = 75;
		
		Student student4 = new Student();
		student4.name = "Kanisha";
		student4.age = 25;
		student4.branch = "CSE";
		student4.usn = 376419;
		student4.marks = 25;
		
		Student student5 = new Student();
		student5.name = "PJ";
		student5.age = 20;
		student5.branch = "CSE";
		student5.usn = 237489;
		student5.marks = 55;
		
		Student student6 = new Student();
		student6.name = "CJ";
		student6.age = 20;
		student6.branch = "CSE";
		student6.usn = 239847;
		student6.marks = 55;
		
		System.out.println("Student1:"+"\n"+student1.name+"\n"+student1.age+"\n"+student1.branch+"\n"+student1.usn+"\n"+student1.marks+"\n");
		System.out.println("Student2:"+"\n"+student2.name+"\n"+student2.age+"\n"+student2.branch+"\n"+student2.usn+"\n"+student2.marks+"\n");
		System.out.println("Student3:"+"\n"+student3.name+"\n"+student3.age+"\n"+student3.branch+"\n"+student3.usn+"\n"+student3.marks+"\n");
		System.out.println("Student4:"+"\n"+student4.name+"\n"+student4.age+"\n"+student4.branch+"\n"+student4.usn+"\n"+student4.marks);
		System.out.println("Student5:"+"\n"+student5.name+"\n"+student5.age+"\n"+student5.branch+"\n"+student5.usn+"\n"+student5.marks);
		System.out.println("Student6:"+"\n"+student6.name+"\n"+student6.age+"\n"+student6.branch+"\n"+student6.usn+"\n"+student6.marks);
	}

}
