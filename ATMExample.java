package com.codegnan.controlstatements;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 50000;// initial account balance.
		int pin = 1234;// original pin.
		int enteredpin;
		System.out.println("Enter your pin..");
		enteredpin = scanner.nextInt();
		if (enteredpin != pin) {
			System.out.println("Incorrect pin.Existing");
			return;
		}
		int choice;
		System.out.println("||=============================||");
		System.out.println("||=========ATM Menu============||");
		System.out.println("||=========1. check Balance====||");
		System.out.println("||==========2. Deposit=========||");
		System.out.println("||==========3. Withdraw========||");
		System.out.println("||==========4. Exit============||");
		System.out.println("||=============================||");
		System.out.println("Enter Your Choice");
		choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Your Balance is :"+balance);
			break;
		case 2:
			System.out.println("Enter Deposit Amount: ");
			double depositAmount=scanner.nextDouble();
			if(depositAmount%100!=0) {
				System.out.println("please Deposit Multiple of 100 like" +"[700,1000,1200]");
			}else {
				if(depositAmount<500) {
					System.out.println("please Deposit more than 500 rupees");
				}else {
					balance+=depositAmount;
					System.out.println("Deposited :" +depositAmount+ "Successfully....update balance is :"+balance);
				}
			}
		}
				break;
				case 3:
				System.out.println("Enter Withdraw Amount: ");
				double withdrawAmount=scanner.nextDouble();
				if(withDrawAmount%100!=0) {
					System.out.println("please Deposit Multiple of 100 like" +"[700,1000,1200]");
				}else {
					if(withdrawt<500) {
						System.out.println("please Deposit more than 500 rupees");
					}else {
						balance+=depositAmount;
						System.out.println("the"+withdrawAmount+"is withdrawAmount balance is :"+balance);
					}
					break;
					case 4:
						System.out.println("invalid choicve."+"please choice valid option");
						
				
			}
		}
		
		

	}

}
