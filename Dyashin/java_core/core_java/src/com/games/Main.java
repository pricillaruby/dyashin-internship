package com.games;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InDoor chess = new Chess();
		chess.indoorPlay();
		OutDoor cricket = new Cricket();
		cricket.outdoorPlay();
		//One method Create a class name and call
		Kabaddi kabaddi = new Kabaddi();
		kabaddi.indoorPlay();
		kabaddi.outdoorPlay();
		
		//Another method is separately called using an interface
		InDoor kabaddi1 = new Kabaddi();
		kabaddi1.indoorPlay();
		OutDoor kabaddi2 = new Kabaddi();
		kabaddi2.outdoorPlay();
	}

}
