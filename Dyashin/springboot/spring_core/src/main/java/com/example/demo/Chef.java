package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chef {
	
	@Autowired
	private final Ingredient ingredient;
	
	public Chef(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public void cook() {
		ingredient.getIngredient();
		System.out.println("Pizza is cooked");
	}
}
