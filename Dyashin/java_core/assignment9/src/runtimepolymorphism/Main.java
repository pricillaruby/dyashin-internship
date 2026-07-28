package runtimepolymorphism;

public class Main {
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.juice();
		
		Fruits fruits = new Fruits();
		fruits.juice();
	}
}
