package applianceControl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appliance fan = new Fan();
		fan.turnOn();
		
		fan.pluggedIn();
		
		Appliance heater = new Heater();
		heater.turnOn();
	}

}
