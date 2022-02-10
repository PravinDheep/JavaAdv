package com.java8.predeffuninterfaces.function;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(5));
	
		System.out.println("-----------------");
		/* When the Input and Return type are same, we can go with UnaryOperator 
		 * Unary Operator is a child class of Function.
		 * 
		 * UnaryOperator - This is a functional interface and can therefore be used as the
		 * assignment target for a lambda expression or method reference. Has method identity().
		 *  
		 * */
		UnaryOperator<Integer> f1 = i -> i * i;
		System.out.println(f1.apply(6));
		System.out.println("-----------------");
		
		/** **********************VVImp*********UNARY AND INTUNARY OPERATOR *
		 * When the input and output types are Student type, then we can go for UNARYOPERATOR, when the input and output types are
		 * primitive types, then we can go for INTUNARY, LONGUNARY OR DOUBLEUNARY operator.
		 * 
		 * Difference between unary operator and binary operator: Unary operator is always applicable for ONE INPUT TYPE, Binary operator
		 * is always applicable for TWO INPUT TYPES. Unary operator is the child of FUNCTION whereas BINARY OPERATOR is the child of
		 * BIFUNCTION.
		 * 
		 * */
		/*
		 * PRIMITIVE TYPES OF UNARYOPERATOR
		 * --------------------------------
		 * IntUnaryOperator - Represents an operation on a single int-valued argument and produces
		 * an Int-valued result, methods are andThen(intunary), applyAsInt(int),
		 * compose(intunary),identity().
		 * 
		 * LongUnaryOperator - Represents an operation on a single long-valued argument and produces
		 * an long-valued result, applyAsLong(long)
		 *  
		 * DoubleUnaryOperator - Represents an operation on a single double-valued argument and produces
		 * an double-valued result, applyAsDouble(double)
		 * 
		 */
		 IntUnaryOperator f2 = i -> i * i;
		 System.out.println(f2.applyAsInt(7));
	}

}