package com.java8.methodandconstructorref;

public class MethodRefExample {
	/*
	 * Instead of Anonymous classes we can go for Lambda expression if we have functional interface.
	 * Whereever functional interface is there, we can go for Lambda expressions.
	 * Method reference and Constructor reference are alternative to Lambda expressions. 
	 * Reusability
	 * Only matched thing is, the arguments must be same.
	 * In the method reference, different return types are allowed, only restriction is arguments type must be matched.
	 *
	 * Static method syntax: classname::method name
	 * Instance method syntax: objectreference::method name
	 *
	 */
	
	public static void m1() {
		for(int i = 0; i <=5; i++) {
			System.out.println("Child Thread");
		}
	}
	private int m2() {
		for(int i = 0; i <=5; i++) {
			System.out.println("Child Thread1");
		}
		return 10;
	}
	public static void main(String[] args) {
		MethodRefExample t1 = new MethodRefExample();
		Runnable r = MethodRefExample::m1;
		Runnable r1 = t1::m2;
		
		Thread t = new Thread(r);
		t.start();
		
		Thread t2 = new Thread(r1);
		t2.start();
		
		for(int i = 0; i <=5; i++) {
			System.out.println("Main Thread");
		}
	}

}
