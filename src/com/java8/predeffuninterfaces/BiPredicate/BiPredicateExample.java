package com.java8.predeffuninterfaces.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		/*
		 *  Predicate<T> ---> test()  -- one input, boolean returntype
		 *  Function<T,R> ---> apply()  -- one input, any returntype(R->Returntype)
		 *  Consumer<T> ---> accept() -- one input, no returntype(void)
		 *  Supplier<R> ---> get()    -- NO input, any returntype(R->Returntype)
		 * 
		 *  BiPredicate<T> ---> test()  -- TWO input, boolean returntype 
		 * 
		 *  Normal Predicate can take only one input argument and perform some conditional check. Sometimes our
		 *  programming requirement is we have to take 2 input arguments and perform some conditional check,
		 *  for this requirement we should go for BiPredicate.
		 *  BiPredicate is exactly same	as Predicate except that it will take 2 input arguments.
		 */
		
		 BiPredicate<Integer, Integer> bip = (a , b) -> (a+b) % 2 == 0;
		 System.out.println(bip.test(10, 20));
		 System.out.println(bip.test(10, 15));
	}
}
