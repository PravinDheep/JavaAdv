package com.java8.methodandconstructorref;

interface Interf {
	public void add(int a, int b);
}
public class MethodRefExample2 {
	/*
	 * 	
	 * If the implementation is already available somewhere else, to reuse that implementation
	 * happily we can use MethodReference.
	 * 
	 * If the implementation is not already available, better to go for LambdaExpression.
	 * 
	 */
	public static void sum(int x, int y) {
		System.out.println("The sum is: " + (x+y));
	}
	public static void main(String[] args) {
		Interf i = (a, b) -> System.out.println("The sum is: " + (a+b));
		i.add(10, 20);
		
		Interf i1 = MethodRefExample2::sum;
		i.add(100, 200);
		
	}

}
