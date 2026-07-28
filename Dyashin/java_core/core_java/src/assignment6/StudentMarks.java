package assignment6;

import java.util.Scanner;

public class StudentMarks {
	public void gradeDetails(int marks) {
		if((marks>100)||(marks<=0)) {
			System.out.println("Invalid Marks");
		}else {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Marks: ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		StudentMarks sm = new StudentMarks();
		sm.gradeDetails(marks);
	}

}
