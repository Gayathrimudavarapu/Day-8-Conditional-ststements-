package com.codegnan.controlstatements;

import java.util.Scanner;

public class AirlineTickets {
	
	public static void main(String[] args) {
		final double BASE_PRICE = 5000.0;
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter passanger type (child/senior/adult) ");
		String PassengerType = scanner.nextLine().toLowerCase();
		double Price = BASE_PRICE;
		if (PassengerType.equals("child")) {
		    Price = Price * 0.5;
		} else if(PassengerType.equals("seniors")) {
			Price = Price * 0.8;
		} else if(PassengerType.equals("adults")) {
		} else {
			System.out.println("Invalid passenger type! ");
			return;
		}
		 System.out.println("Enter booking time(early/normal/last-miniute)");
		 String bookingtime = scanner.nextLine().toLowerCase();
		 if (bookingtime.equals("early")) {
			Price = Price * 0.9;
		} else if(bookingtime.equals("normal")) {
		} else if(bookingtime.equals("last_miniute")) {
			Price = Price * 1.2;
		} else {
			System.out.println("Invalid booking time! ");
			return;
		}
			System.out.println("Is passenger a member? (yes/no): ");
			String membership = scanner.nextLine().toLowerCase();
			if (membership.equals("yes")) {
				Price = Price * 0.95;
			} else if (membership.equals("no")) {
			} else {
				System.out.println("Invalid membership input! exiting..");
						return;
			}
						System.out.println("Finalticket price: " + Price);
						scanner.close();
				
			
			
		

			
		
		
		    
			 
		
		
		
		
		
		
		
		

		}

}

