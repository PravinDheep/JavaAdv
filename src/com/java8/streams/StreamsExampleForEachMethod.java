package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsExampleForEachMethod {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Insertion order: " + al);
		System.out.println("------------------------------------------------------------------------------");
		//Consumer<Integer> c = i -> { System.out.println("The square of" + i + " is: " + i * i);};
		//al.stream().forEach(System.out::println); //can call custom function also instead of println
		al.stream().forEach(i -> System.out.println("The square of" + i + " is: " + i * i));
		System.out.println("------------------------------------------------------------------------------");
		//toArray() - to convert stream of objects into array
		Integer[] ii = al.stream().toArray(Integer[]::new);
		Stream.of(ii).forEach(System.out::print);
		System.out.println("------------------------------------------------------------------------------");
		// Stream.of - converting array to stream or al.toArray(), Arrays.asList - to convert arrays into list
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		System.out.println("------------------------------------------------------------------------------");
		Integer[] iel = {10,20,30,40,50};
		Stream.of(iel).forEach(System.out::println);
	}
}