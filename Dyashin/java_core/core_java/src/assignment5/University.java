package assignment5;

public class University {
	String universityName="ABC";
	public class Faculty{
		String facultyName="Pricilla";
		public class Subject{
			String subjectName = "Computer Science";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University uni = new University();
		System.out.println(uni.universityName);
		
		University.Faculty fac = uni.new Faculty();
		Faculty.Subject sub = fac.new Subject();
		
		System.out.println(fac.facultyName);
		System.out.println(sub.subjectName);
	}

}
