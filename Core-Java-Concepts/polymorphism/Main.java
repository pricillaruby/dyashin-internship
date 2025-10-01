package com.polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog(); //here Polymorphism , depends on object
		//it access based on object, so it prints Dog class method
		dog.sound();
		
		Animal animal = new Animal();
		animal.sound();  //here we tell polymorphism depends on object only 
		//know then we put Dog animal = new Animal() is also possible right
		//but here Animal doesn't know what are below classes are there
		//but Dog knows Above classes , so we can't use Dog
		//Animal has its own properties we have to create separate object for this
	}

}
