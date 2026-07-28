package assignment4;

import java.util.Scanner;

public class Person1 {
	String personName;
	int personAge;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 person1 = new Person1();
		Person1 person2 = new Person1();
		Person1 person3 = new Person1();
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("Enter Person"+i);
			String name = sc.next();
			
			System.out.println("Enter Person"+i+" Age");
			int age = sc.nextInt();
			switch(i) {
			case 1:
				person1.personName = name;
				person1.personAge = age;
				break;
			case 2:
				person1.personName = name;
				person1.personAge = age;
				break;
			case 3:
				person1.personName = name;
				person1.personAge = age;
				break;
			default:
				System.out.println("Enter valid");
			}
			if(age<13) {
				System.out.println("Person"+i+" is a Child");
			}else if(age>=13 && age<=19) {
				System.out.println("Person"+i+" is a Teen");
			}else if(age>=20 && age<=59) {
				System.out.println("Person"+i+" is a Adult");
			}else {
				System.out.println("Person"+i+" is a Senior");
			}
		}
	}

}
