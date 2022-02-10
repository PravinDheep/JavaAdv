package com.java8.predeffuninterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		/*
		 * Whereever some BOOLEAN CONDITIONS we want to check, we can go for predicate.
		 * 
		 * Predicate(I) has only one function
		 * 	public void boolean test(T t)
		 * 
		 * If else is concise, but why do we need a predicate, once if you write conditions
		 * and assign to predicate object, whenever and whenever we need those conditions check
		 * we can use the p.test(t), instead of writing if else in various places.
		 */
		
		
		/* 
		 	Predefined functional interfaces:
		 	Predicate
		 	Function
		 	Consumer
		 	Supplier
		 	
		 	Two argument Predefined functional interfaces:
		 	BiPredicate
		 	BiFunction
		 	BiConsumer
		 	
		 	Primitive functional interfaces
		 	IntPredicate
		 	IntFunction
		 	IntConsumer
		 	......
		 */

		
		/*
		 * PRIMITIVE TYPES OF PREDICATE
		 * ----------------------------
		 * 
		 * In order to avoid, autoboxing and auto unboxing performance issues, we can use
		 * IntPredicate
		 * LongPredicate
		 * DoublePredicate
		 * 
		 * Method name is always test only.
		 * 
		 * IntBiPredicate - NO SUCH METHODS AVAILABLE.
		 */
		Predicate<Integer> p1 = i -> i%2==0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(15));
		
		/* VERY VERY IMPORTANT : INTERNAL CONVERSION*/
		//int val converted to Integer (boxing or autoboxing)
		//Integer to int when any matematical operations performed (unboxing or autounboxing)
		// Creates performance issues when boxing and autoboxing is performed, to overcome this we should go for
		// primitive version of functional interfaces.
		
		System.out.println("-------------------------------------------------------");
		Predicate<String> p2 = s -> s.length() > 5;
		System.out.println(p2.test("Ajithkumar"));
		System.out.println("-------------------------------------------------------");
		String[] sa = {"KLRahul","ViratKohli","Rohit","Ruthraj","SGill"};
		Predicate<String> p3 = s -> s.length() % 2==0;
		for(String s1 : sa) {
			if(p3.test(s1)) {
				System.out.println(s1.toString());
			}
		}
	}

}
