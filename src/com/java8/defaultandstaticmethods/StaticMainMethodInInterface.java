package com.java8.defaultandstaticmethods;

public interface StaticMainMethodInInterface {
	
	public static void main(String[] args) {
		//  Main Method can be declared inside Interface? YES from java 1.8.
		// So, interface can be invoked from command prompt also.
		// Static method came for implementing general utility methods.
		System.out.println("Main Method from Interface, since Java 1.8.");
	}

}
