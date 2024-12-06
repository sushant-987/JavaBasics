package com.basics;

public class FibonaaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, first = 0, second = 1;

		System.out.println("Fibonacci Series: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}

	}

}
