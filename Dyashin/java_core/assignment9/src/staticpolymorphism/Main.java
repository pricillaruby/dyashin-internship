package staticpolymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		dog.sound(); //here it calls the sound() present in the animal
		//because When we use static it belongs to parent class only.
		//when you create object for child , but it prints parent class sound
		//so , you cannot override a static method .

	}

}
