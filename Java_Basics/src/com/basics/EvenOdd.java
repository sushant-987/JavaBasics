package com.basics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		sc.close();

		if (number % 2 == 0) {
			System.out.println(number + " is Even.");
		} else {
			System.out.println(number + " is Odd");
		}

	}

}
