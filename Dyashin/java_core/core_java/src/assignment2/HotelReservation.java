package assignment2;

import java.util.Scanner;

public class HotelReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
		
		//guestname
		System.out.println("Enter Guest Name:");
		String guestName = in.nextLine();
		
		//no of rooms
		System.out.println("Enter Number of Rooms:");
		int noOfRooms = in.nextInt();
		
		//check in date
		System.out.println("Enter Check-In Date:");
		String checkInDate = in.next();

		//check out date
		System.out.println("Enter Check-out Date:");
		String checkOutDate = in.next();
		
		//hotelname
		System.out.println("Enter Hotel Name:");
		String hotelName = in.next();
		
		//roomtype
		System.out.println("Enter Room Type:");
		String roomType = in.next();
		
		//booking id
		System.out.println("Enter Booking ID:");
		String bookingID = in.next();
		
		
		System.out.println("Hotel Reservation Details");
		System.out.println("Booking ID : "+bookingID);
		System.out.println("Guest Name:"+guestName); 
		System.out.println("Hotel Name: "+hotelName);
		System.out.println("Number Of Rooms :"+noOfRooms);
		System.out.println("Check-In Date:"+checkInDate);
		System.out.println("Check-Out Date:"+checkOutDate);
		System.out.println("Room Type:"+roomType);
	}

}
