package com.java8.predeffuninterfaces.predicate;

import java.util.function.Predicate;

public class CombineTwoPredicatesToSingle {
	static boolean flag = false;
	public static void main(String[] args) {
		/*
		 * p1 -> to check whether the number is even or not
		 * p2 -> to check whether the number is greater than 10
		 * p1.and(p2).test(inputs); called Predicate Joining
		 * p1.or(p2).test(inputs); 
		 * p1.negate().test(inputs); -> opposite of p1
		 */
		
		int[] x = {0, 5,10, 13, 15,20,25,30,35};
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;
		
		//and(), or(), negate()
		System.out.println("And : ");
		for(Integer i : x) {
			if(p1.and(p2).test(i)) {
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		//or
		System.out.println("Or : ");
		for(Integer i : x) {
			if(p1.or(p2).test(i)) {
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		//negate
		System.out.println("Negate : ");
		for(Integer i : x) {
			if(p1.negate().test(i)) {
				System.out.print(i+"\t");
			}
		}
	}

}
