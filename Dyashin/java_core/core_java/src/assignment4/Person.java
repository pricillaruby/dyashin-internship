package assignment4;

public class Person {
	String personName;
	int personAge;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.personName="Ruby";
		person1.personAge = 20;
		
		Person person2 = new Person();
		person2.personName="Jinu";
		person2.personAge = 21;
		
		System.out.println("Person1: "+person1.personName+" , "+"Person1 Age: "+person1.personAge+"\n"+"Person2: "+person2.personName+" , "+"Person2 Age: "+person2.personAge);
		if(person1.personAge > person2.personAge) {
			System.out.println(person1.personName+" is older");
		}else {
			System.out.println(person2.personName+" is older");
		}
	}

}
