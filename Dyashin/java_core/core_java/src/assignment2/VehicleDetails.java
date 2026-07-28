package assignment2;

import java.util.Scanner;

public class VehicleDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
		
		//ownername
		System.out.println("Enter Owner Name:");
		String ownerName = in.nextLine();
		
		//vehiclenumber
		System.out.println("Enter Vehicle Number:");
		String vehicleNumber = in.nextLine();
		
		//vehicletype
		System.out.println("Enter Vehicle Type:");
		String vehicleType = in.nextLine();

		//manufacturer
		System.out.println("Enter Manufacturer Name:");
		String manufacturer = in.nextLine();
		
		//modelyear
		System.out.println("Enter Model Year:");
		int modelYear = in.nextInt();
		
		//enginecapacity
		System.out.println("Enter Engine Capacity:");
		String engineCapacity = in.next();
		
		//registrationdate
		System.out.println("Enter Registration Date:");
		String date = in.next();
		
		//address
		System.out.println("Enter Address:");
		String address = in.next();
		
		System.out.println("Vehicle Details");
		System.out.println("Owner Name : "+ownerName);
		System.out.println("Vehicle Number :"+vehicleNumber);
		System.out.println("Vehicle Type:"+vehicleType);
		System.out.println("Manufacturer:"+manufacturer);
		System.out.println("Model Year:"+modelYear);
		System.out.println("Engine Capacity:"+engineCapacity);
		System.out.println("Registration Date:"+date);
		System.out.println("Address:"+address);
	}

}
