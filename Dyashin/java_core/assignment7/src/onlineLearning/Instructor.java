package onlineLearning;

public class Instructor extends User implements Course{

	public Instructor(String name, String email) {
		super(name, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accessContent() {
		// TODO Auto-generated method stub
		System.out.println(name+" (Instructor) can access the course content");
	}

	@Override
	public void enroll() {
		// TODO Auto-generated method stub
		System.out.println("Course is enrolled using this "+email+" for the instructor");
	}

}
