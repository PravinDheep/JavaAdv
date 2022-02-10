package com.java8.defaultandstaticmethods;

interface Interf {
	public static void m11() {
		System.out.println("Interface static method m1.");
	}
}
class StaticMethods /* implements Interf : Even without implements, this is going to work.*/ {

	public static void main(String[] args) {
		/*
		 * Class vs Interface: which is costly, Class is costly because interface don't have
		 * constructor, static class, instance map. So interface is light weight component.
		 * Class is associated with object, but interface no concept of object,
		 * If all the methods are static(no way related to object), it is better to go for 
		 * Interface instead of class. Because from 1.8v onwards interface support static methods.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		 Interf.m11();
			/*
			 * StaticMethods.m11(); 
			 * m11(); 
			 * StaticMethods sm = new StaticMethods(); 
			 * sm.m11();
			 */
		 /*****************VERY VERY IMPORTANT**************
		  *  Interface static methods by default not available to the implementation classes. 
		  *  Even without implements, this is going to work.
		  *  Main Method can be declared inside Interface? YES from java 1.8.
		  *  So, interface can be invoked from command prompt also.
		  *  Static method came for implementing general utility methods.
		  *  
		  **/
	}
}
