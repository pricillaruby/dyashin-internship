package castingtypes;

//Upcasting is when you treat a subclass object as an instance of its superclass
//Downcasting is when you cast a superclass reference back to its subclass type

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog(); //Upcasting
		dog.sound();
//		dog.eat(); //here it shows error because it refer Animal class 
		//Animal class doesn't know about methods present in the subclasses
		
		if(dog instanceof Dog) { //Here it works , we use downcasting
			//using instanceof
			Dog d = (Dog)dog;
			d.eat();
		}
		
	}

}
