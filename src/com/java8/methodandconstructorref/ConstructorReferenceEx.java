package com.java8.methodandconstructorref;

class Sample {
	
	Sample(String s){ 
		System.out.println("Sample class constructor execution with argument..."); 
	}
	
	Sample() {
		System.out.println("Sample class constructor execution...");
	}
	 
}
interface NewInter {
	public Sample get(String s);
	//public Sample get();
}

public class ConstructorReferenceEx {
	/*
	 * ConstructorReferenceEx::new
	 * 
	 * When we can go for Constructor reference, if the functional interface method returns an Object, then we can
	 * go for constructor reference.
	 */
	public static void main(String[] args) {
		/* Interface get() method refers Sample class constructor.
		 * 
		 * 
		 */
		NewInter itf = Sample::new;
		Sample samp = itf.get("Virat");
		Sample samp1 = itf.get("Kohli");
	}

}