package com.java8.defaultandstaticmethods;

class lefty {
	
	public void m1() {
		System.out.println("Left interface method m1.");
	}	
}

class righty {
	
	public void m1() {
		System.out.println("Right interface method m1.");
	}	
}

public class MultipleInheritanceError /* extends lefty,righty */{
	
	public static void main(String[] args) {
		//Multiple inheritance not possible for classes, but we can use for interface.
		MultipleInheritanceError dmi = new MultipleInheritanceError();
		dmi.m1();
	}
	
	public void m1() {
		System.out.println("Multiple inheritance not possible for the classes.");
		//left.super.m1(); // Invokes left interface method, but this support is still not
		// available for classes, its available for interfaces alone till java 1.8.
	}
	
}