package onlineLearning;

public abstract class User {
	String name;
	String email;
	
	public User(String name,String email) {
		this.name = name;
		this.email = email;
	}
	
	public void login() {
		System.out.println("Welcome "+name+" Login Successful");
	}
	
	public abstract void accessContent();
}
