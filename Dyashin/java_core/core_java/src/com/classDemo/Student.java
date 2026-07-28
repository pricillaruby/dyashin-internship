package com.classDemo;

public class Student {
	String name;
	int age;
	String branch;
	long usn;
	//Parameterized constructor
	public Student(String n,int a,String b,long u) {
		name = n;
		age = a;
		branch = b;
		usn = u;
	}
	//Non-parameterized Constructor
	public Student() {
		name = "ruby";
		age = 20;
		branch = "CSE";
		usn = 74290;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Pricilla",20,"CSE",27468);
		Student student1 = new Student();
		System.out.println(student.name+","+student.age+","+student.branch+","+student.usn);
		System.out.println(student1.name+","+student1.age+","+student1.branch+","+student1.usn);
	}

}
