package com.basics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Programming";
		String reversed = " ";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reversed);

	}

}
