package com.hybridInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Properties of C");
		ClassC c = new ClassC();
		c.a();
		c.b();
		c.c();
		
		System.out.println("Properties of D");
		ClassD d = new ClassD();
		d.a();
		d.b();
		d.d();
		
		System.out.println("Properties of B");
		ClassB b = new ClassB();
		b.a();
		b.b();
		
	}

}
