package com.classDemo;

public class College {
	//without static
	public class Student{
		String name;
		int age;
		String branch;
		long usn;
		int marks;
	}
	//with static 
	public static class Student1{
		static String name;
		static int age;
		static String branch;
		static long usn;
		static int marks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College co = new College();
		College.Student stud = co.new Student();
		stud.name = "abc";
		stud.age = 20;
		stud.branch = "CSE";
		stud.usn = 63729;
		stud.marks = 50;
		System.out.println("Without Static :"+stud.name+","+stud.age+","+stud.branch+","+stud.usn);
		
		Student1.name = "Pricilla";
		Student1.age = 20;
		Student1.branch = "CSE";
		Student1.usn =34929;
		Student1.marks=76;
	}

}
