package com.codegnan.controlstatements;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in)	;
       double accountbalance = 50000.0;
       System.out.println("Enter Withdraw Amount : ");
       double withdrawAmount = scanner .nextDouble();
       if(withdrawAmount<=accountbalance) {
    	   accountbalance-=withdrawAmount;
    	   System.out.println("withdraw Anount : "+withdrawAmount+
    			   "succesfully.. available balanve is : "+accountbalance);
       }else {
    	   System.out.println("Insufficient Funds");
       }
       scanner .close();

	}

}
