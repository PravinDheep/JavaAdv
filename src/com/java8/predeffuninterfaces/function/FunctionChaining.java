package com.java8.predeffuninterfaces.function;
import java.util.function.Function;
public class FunctionChaining {
	public static void main(String[] args) {
		/*
		 * Function Chaining
		 * f1.andThen(f2).apply(i) - First apply f1 process and then apply f2 process, so two functions
		 * can be combined to form more complex functions. (F1 followed by F2)
		 * 
		 * f1.compose(f2).apply(i) - First apply f2 process and then apply f1 process, so two functions
		 * can be combined to form more complex functions. (F2 followed by F1)
		 * 
		 */
		
		Function<Integer, Integer> f1 = i -> 2 * i;
		Function<Integer, Integer> f2 = i -> i * i * i;
		
		System.out.println(f1.andThen(f2).apply(2));
		
		System.out.println("--------------------------------------");
		
		System.out.println(f1.compose(f2).apply(10));
	}
}
