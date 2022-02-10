package com.java8.defaultandstaticmethods;

interface I {
	public void m1();
	public void m2();
	default void m3(){};
}

public class DefaultMethods implements I {

	public static void main(String[] args) {
		/*  1.8 version onwards default methods can be used inside interfaces
		 *  1.8 : default methods + static methods
		 *  1.9 : private methods
		 *  Every variable available in interface is always public static final in all versions
		 *  Default method is also known as Virtual Extension method also known as Defender method
		 *  Without affecting implementation classes, if we want to add any new method to the
		 *  interface, then we can go for Default method concept. 
		 *  Whenever the default method is overriden in a class, it should replace default keyword
		 *  with public, because when you don't declare anything in a method, its scope is default.
		 *  Object class methods are not allowed to use by declaring default as the modifier:
		 *  eg: default void hashCode(), here hashcode is already a method of Object, compile error.
		 *  Multiple inheritance not available for class, but we can use for interface.
		 *  
		 * */
	}

	@Override
	public void m1() {
		System.out.println("Method m1");
	}

	@Override
	public void m2() {
		System.out.println("Method m2");
	}
	
	public void m3() {
		System.out.println("Overriding default Method m3");
	}
}
