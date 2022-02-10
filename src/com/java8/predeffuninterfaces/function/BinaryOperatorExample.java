package com.java8.predeffuninterfaces.function;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BiFunction<String, String, String> bf = (s1, s2) -> s1 + s2;
		System.out.println(bf.apply("Virat","Rahul"));
	
		System.out.println("-----------------");
		/* When the TWO Inputs and Return type are same, we can go with BinaryOperator 
		 * Binary Operator is a child class of BIFUNCTION.
		 * 
		 * BinaryOperator<T> - This is a functional interface and can therefore be used as the
		 * assignment target for a lambda expression or method reference. Has method identity().
		 * 
		 * TWO INPUTS AND RETURN TYPE ARE SAME.
		 *  
		 *  
		 * */
		
		BinaryOperator<String> f1 = (s1, s2) -> s1 + s2; 
		System.out.println(f1.apply("Virat", "Rahul")); // BinaryOperator has maxBy, minBy methods.
		System.out.println("-----------------");
		
		/*
		 * PRIMITIVE TYPES OF BINARYOPERATOR
		 * ---------------------------------
		 * IntBinaryOperator - Represents an operation on a single int-valued argument and produces
		 * an Int-valued result, methods applyAsInt(int).
		 * 
		 * LongBinaryOperator - Represents an operation on a single long-valued argument and produces
		 * an long-valued result, applyAsLong(long)
		 *  
		 * DoubleBinaryOperator - Represents an operation on a single double-valued argument and produces
		 * an double-valued result, applyAsDouble(double)
		 * 
		 **/
		 
		 IntBinaryOperator f5 = (i1, i2) -> (i1 * i2);
		 System.out.println(f5.applyAsInt(10,20));

	}

}
