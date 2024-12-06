package com.basics;

class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("The dog barks.");
	}
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.eat();
		d.bark();

	}

}
