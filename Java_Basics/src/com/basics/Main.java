package com.basics;

class Student {
	String name;
	int age;

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student();
		st.name = "Govind";
		st.age = 23;
		st.display();
	}

}
