package com.codegnan.controlstatements;

import java.util.Scanner;

public class CanteenSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int teaprice = 10, coffeeprice = 15, samosaprice = 20;
		int teaqty=0,coffeeqty=0,samosaqty=0;
		int choice;
		double taxRate=0.05;
		do {
			System.out.println("||==========Canteen Menu=========||");
			System.out.println("||==========1. View Menu=========||");
			System.out.println("||==========2. Order Choice======||");
			System.out.println("||==========3. View Items========||");
			System.out.println("||==========4. CheckOt And Exit==||");
			switch(choice) {
			case 1:
				System.out.println("===== MENU =========");
				System.out.println(" 1. Tea- $ "+teaprice);
				System.out.println(" 2. coffee- $ "+coffeeprice);
				System.out.println(" 3. samosa- $"+samosaprice);
				break;
			case 2:
				System.out.println("Enter Item Number to order (1-3)");
				int item=scanner.nextInt();
				System.out.println("Enter Quantity");
				int qty=scanner.nextInt();
				if(qty<=0) {
					System.out.println("Quantity must be Greater Than 0");
					break;
				}
				switch(item) {
				case 1:
					teaQty+=qty;
					System.out.println(qty+" Tea(s) Added");
					break;
				case 2:
					coffeeQty+=qty;
					System.out.println(qty+" coffee(s) Added");
					break;
				case 3:
					samosaQty+=qty;
					System.out.println(qty+" samosa(s) Added");
					break;
					default:
						System.out.println("Invalid Iteam Number."+ " please choose between 1-3" );
						break;
				}
				break;
			case 3:
				int teaTotal = tea * teaprice;
				int coffeeTotal=coffee*coffeeprice;
				int samosaTotal = samosa *samosaprice;
				int subTotal=teaTotal+coffeeTotal+samosaTotal;
				double tax=taxRate*subTotal;
				double grandTotal=subTotal+tax;
				System.out.println("======== Bill =======");
				if(teaQty>0) {
					System.out.println("Tea x :"+teaQty+" =$ "+teaTotal);
				}
				if(coffeeQty>0) {
					System.out.println("coffee x :"+coffeeQty+" =$ "+coffeeTotal);
				}
				if(samosaQty>0) {
					System.out.println("samosa x :"+samosaQty+" =$ "+samosaTotal);
				}
				if(subTotal == 0) {
					System.out.println("No Items Yet");
				} else {
					System.out.println("Sub Total : " + subTotal);
					System.out.println("Tax(5%) " + tax);
					System.out.println("Total = " + grandTotal);
				} 
				break;
			case 4:
				System.out.println("Thank You . Existing system");
				break;
				default:
					System.out.println("Invalid Choice." + please Enter A Number from 1 to 4");"
							break;
			}
		} while (choice != 4);
		scanner.close();
					
				
						
				}
          }  
		}
				

	}

}
