package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scanner.nextInt();
		int count = 0;
		while(number != 0) {//1!=0
			number /= 10;// 1/10-->0
			count++;// 5
		}
		System.out.println("The count of Digits in a given Number is :");
		scanner.close();
		
		
		

	}

}// palidrome number;
//amstrong number;//
//fibinaciio series.
