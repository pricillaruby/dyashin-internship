package onlineLearning;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your role: Student or Instructor");
		String role = sc.next();
		
		switch(role) {
		case "Student":
			Student student = new Student("Pricilla","pricilla@gmail.com");
			student.login();
			student.enroll();
			student.accessContent();
			break;
			
		case "Instructor":
			Instructor instructor = new Instructor("Ruby","ruby@gmail.com");
			instructor.login();
			instructor.enroll();
			instructor.accessContent();
			break;
		
		default:
				System.out.println("Enter Valid Option");
		}
	}

}
