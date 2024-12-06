package com.basics;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
		sc.close();

		int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Largest number is: " + largest);
	}

}
