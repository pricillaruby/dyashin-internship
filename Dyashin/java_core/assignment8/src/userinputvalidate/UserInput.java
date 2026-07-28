package userinputvalidate;

public class UserInput {
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if(userName != null && userName.length() >=3) {
			this.userName = userName;
		}else {
			System.out.println("Invalid user , please enter valid username");
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password != null && password.length() >=8) {
			this.password = password;
		}else {
			System.out.println("Invalid user , password must be atleast 8 characters");
		}
	}
	
	
}
