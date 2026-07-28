package displaymessage;

public class Message extends Sample{
	@Override
	//Use @Override , then only it shows the error ,
	//for example , in parent it is display(),but in child class
	//you put diplay(), so when you don't put @Override , it doesn't show the 
	//error , when you put this , it catch the error
	public void display() {
		System.out.println("Hi,Hello");
	}
}
