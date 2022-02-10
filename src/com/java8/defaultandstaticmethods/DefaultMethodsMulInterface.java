package com.java8.defaultandstaticmethods;

interface left {
	
	default void m1() {
		System.out.println("Left interface method m1.");
	}	
}

interface right {
	
	default void m1() {
		System.out.println("Right interface method m1.");
	}	
}

public class DefaultMethodsMulInterface implements left,right{
	
	public static void main(String[] args) {
		//Multiple inheritance not available for class, but we can use for interface.
		DefaultMethodsMulInterface dmi = new DefaultMethodsMulInterface();
		dmi.m1();
	}
	
	@Override
	public void m1() {
		left.super.m1(); // Invokes left interface method, but this support is still not
		// available for classes, its available for interfaces alone till java 1.8.
	}
}
