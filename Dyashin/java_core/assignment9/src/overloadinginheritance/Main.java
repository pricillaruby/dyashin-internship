package overloadinginheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();
		add.add(10,20,"Hello");
		//if it is same parameter list , it calls the parent class only
		
		Arithmetic a = new Arithmetic();
		a.add(10,50);
	}

}
