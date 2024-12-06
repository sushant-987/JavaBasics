package com.basics;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 21000;

		if ((year % 4 == 0 && year % 4 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

	}

}
