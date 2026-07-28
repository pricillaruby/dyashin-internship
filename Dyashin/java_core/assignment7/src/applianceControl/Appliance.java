package applianceControl;

public abstract class Appliance {
	//abstract method
	public abstract void turnOn();
	void pluggedIn() {
		System.out.println("Plugged In");
	}
}
