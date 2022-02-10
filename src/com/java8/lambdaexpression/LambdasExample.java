package com.java8.lambdaexpression;

interface Interf {
	//public void m1();
	public void m1(int a, int b);
}

class Demo implements Interf {
	//public void m1() {
	public void m1(int a, int b) {
		System.out.println("Hello..." + (a+b));
	}
}
public class LambdasExample {
	/* 
	 * Java8 - March 18th 2014
	 * By Enabling Functional Programming, can able to write concise code.
	 * Lambda Expressions main purpose to enable functional programming in java 
	 * The main objective of Lambda Expression is to bring benefits of functional programming into java
	 * What is Lambda Expression: It is a anonymous(nameless) function, nameless, without return type,
	 * without modifiers.
	 * (int n) -> {return n*n;} // If statement is under curly braces, compulsory you should use return.
	 * (int n) -> n*n; // If statement is not under curly braces, no need to specify return.
	 * n -> n*n; //Compiler can guess the type automatically, hence removed, if only one data type is available
	 * // we can remove the paranthesis.
	 * 
	 * Functional Interface - If a interface contains only one abstract method, it is called functional interface. If
	 * you want to invoke lambda expression, functional interface must be required.
	 * n -> return n*n; // invalid, cannot use return when curlybraces are not present.
	 * n -> {return n*n;}; // VALID
	 * n -> {return n*n}; // invalid, every java statement should end with semi colon. 
	 * n -> {n*n;}; // invalid, curly braces used, there is no return
	 * n -> n*n; // VALID
	 * Can we declare any number of default and static methods in functional interface -> YES
	 * @FunctionalInterface interface A { public void m1(); }
	 * @FunctionalInterface interface B { public void m1(); }
	 * Is this valid, yes(uses overriding), but if method name changes in B, it is invalid.
 	 * */
	public static void main(String[] args) {
		//Demo d = new Demo(); or Interf d = new Demo();
		//Interf d = new Demo();
		//d.m1();

		//Interf d = () -> System.out.println("Hello from Lambda Expression...");
		//d.m1();

		//Demo d = new Demo();
		//d.m1(4, 5);
		Interf d = (a, b) -> System.out.println("Hello from Lambda" + (a+b));
		d.m1(2,6);
		
	}

	
	/*
	 * Enables Functional Programming, Readable and concise code, Easier-to-use APIs and libraries,
	 * Enables support for parallel processing
	 * Object Oriented vs Functional
	 * Everything is an object, All code blocks are "associated" with classes and objects
	 * Lambdas are not methods of a class, they are just functions that exists in isolation,
	 * those functions can be treated as values
	 */
}
