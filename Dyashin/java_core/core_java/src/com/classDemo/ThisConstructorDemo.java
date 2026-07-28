package com.classDemo;

public class ThisConstructorDemo {
	String name;
	int age;
	String usn;
	String branch;
	public ThisConstructorDemo(String name,int age,String usn,String branch) {
		this.name = name;
		this.age = age;
		this.usn = usn;
		this.branch = branch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructorDemo th=new ThisConstructorDemo("Pricilla",20,"33RC","CSE");
		System.out.println("Student Name: "+th.name+" "+"Student age: "+th.age+"Student USN: "+th.usn+" "+"Student Branch: "+th.branch);
		
		ThisConstructorDemo th1=new ThisConstructorDemo("Jinu",20,"23RC","CSE");
		System.out.println("Student Name: "+th1.name+" "+"Student age: "+th1.age+"Student USN: "+th1.usn+" "+"Student Branch: "+th1.branch);

		ThisConstructorDemo th2=new ThisConstructorDemo("Priyanka",20,"34RC","CSE");
		System.out.println("Student Name: "+th2.name+" "+"Student age: "+th2.age+"Student USN: "+th2.usn+" "+"Student Branch: "+th2.branch);
		
		ThisConstructorDemo th3=new ThisConstructorDemo("Kanisha",21,"25RC","CSE");
		System.out.println("Student Name: "+th3.name+" "+"Student age: "+th3.age+"Student USN: "+th3.usn+" "+"Student Branch: "+th3.branch);
		
		ThisConstructorDemo th4=new ThisConstructorDemo("Praveena",20,"31RC","CSE");
		System.out.println("Student Name: "+th4.name+" "+"Student age: "+th4.age+"Student USN: "+th4.usn+" "+"Student Branch: "+th4.branch);

		ThisConstructorDemo th5=new ThisConstructorDemo("CJ & PJ",20,"2122C","CSE");
		System.out.println("Student Name: "+th5.name+" "+"Student age: "+th5.age+"Student USN: "+th5.usn+" "+"Student Branch: "+th5.branch);
	}

}
