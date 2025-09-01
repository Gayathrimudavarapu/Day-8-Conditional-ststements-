package com.codegnan.controlstatements;

import java.util.Scanner;


public class Wishes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name");
        String city = scanner .next();
        if (city.equalsIgnoreCase("hyderabad")) {
        	System.out.println("Hello Hyderabadi....Adaab");
        }else {
        	if (city.equalsIgnoreCase("banglore")) {
        		System.out.println("Hello banglori..namaskaram");
        	}else {
        		if (city.equalsIgnoreCase("madras")) {
        		System.out.println("Hello madrasi....vanamkam");
        		}
        		
        		scanner .close();
        		
        		
        	}
        }

	}

}
