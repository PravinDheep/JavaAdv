package com.java8.predeffuninterfaces.supplier;
import java.util.function.Supplier;
import java.util.Date;
public class SupplierExample {

	public static void main(String[] args) {
		// Just supply my required objects and it won't take any input and return type is anything.
		Supplier<Date> s = () -> new Date();
		//where <Date> is the return type, () is always with no input.
		
		/* PRIMITIVE TYPES OF CONSUMER
		 * ---------------------------
		 * In order to avoid, autoboxing and auto unboxing performance issues, we can use
		 * 
		 * Always Supplier cares about RETURN-TYPE only, it doesn't have input type, hence
		 *
		 * BooleanSupplier - Represents a supplier of boolean-valued results, method is getAsBoolean()
		 * IntSupplier - Represents a supplier of int-valued results, method is getAsInt()
		 * LongSupplier - Represents a supplier of long-valued results, method is getAsLong()
		 * DoubleSupplier - Represents a supplier of double-valued results, method is getAsDouble().
		 *
		 */
		 
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

		System.out.println("----------------------------------------------------------------------");
		Supplier<String> s1 = () -> {
			String otp = "";
			for(int i = 1; i <= 6; i++) {
				otp += (int)(Math.random() * 10);
			}
			return otp;
		};
		// Can use any number of times.
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		
	}

}
