package com.methodDemo;

public class Method {
	//Without Input and ReturnType
	public void greet() {
		System.out.println("Welcome");
	}
	//With Input and Without Return Type
	public void welcome(String name) {
		System.out.println("Welcome "+name);
	}
	//With Input and Return Type
	public int add(int x , int y) {
		return x+y;
	}
	//Without Input and With Return Type
	public String greetings() {
		return "Pricilla";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method md = new Method();
		md.greet();
		md.welcome("Pricilla");
		System.out.println(md.add(10, 20));
		System.out.println(md.greetings());
	}

}
