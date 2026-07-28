package com.abstractionDemo;

public abstract class Vehicle {
	String type;
	public Vehicle(String type) {
		this.type = type;
	}
	public abstract void brand();
	public void display() {
		System.out.println(type);
	};
}
