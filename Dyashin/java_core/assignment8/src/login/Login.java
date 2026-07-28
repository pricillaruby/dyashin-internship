package login;

public class Login {
	private String username = "Admin";
	private String password = "admin@1234";
	
	public void validateCredentials(String username , String password) {
		if(isValid(username,password)) {
			System.out.println("Login successfull");
		}else {
			System.out.println("Invalid login credentials");
		}
	}
	private boolean isValid(String name , String password) {
		return username.equals(name) && password.equals(password);
	}
}
