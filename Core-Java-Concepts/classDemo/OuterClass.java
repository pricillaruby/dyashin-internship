package com.classDemo;

public class OuterClass {
	int x =2;
	public class InnerClass{
		int y =3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Always create a object for main class i.e OuterClass
		OuterClass oc = new OuterClass();
		//object created for InnerClass using outer class object
		OuterClass.InnerClass in = oc.new InnerClass();
	}

}
