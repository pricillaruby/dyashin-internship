package com.customException;

public class InvaliddepositAmount extends RuntimeException{
	public InvaliddepositAmount(String message) {
		super(message);
	}
}
