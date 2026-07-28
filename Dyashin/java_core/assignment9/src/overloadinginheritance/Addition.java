package overloadinginheritance;

public class Addition extends Arithmetic{
	public void add(double a , double b,String msg) {
		System.out.println("Addition class" +(a+b)+" "+msg);
	}
}
