package com.games;

public class Kabaddi implements InDoor,OutDoor{

	@Override
	public void outdoorPlay() {
		// TODO Auto-generated method stub
		System.out.println("Kabaddi played at Ground");
	}

	@Override
	public void indoorPlay() {
		// TODO Auto-generated method stub
		System.out.println("Kabaddi played using mat");
	}

}
