package com.java8.streams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamsExample {

	public static void main(String[] args) {
		/*
		 * If we want to process a group of objects as a single entity then we should go 
		 * for collection.
		 * 
		 * If you want to process object from the collection, then we should go for streams
		 * concept.
		 * 
		 * Stream s = list.stream() // java.util.Stream
		 * 
		 */
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0); al.add(10); al.add(20); al.add(5); al.add(15); al.add(25);
		System.out.println(al);
		List<Integer> filteredList = al.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println("Check for even in the List: " + filteredList);
		
		System.out.println("***********************************************************************");
		List<Integer> mappedList = al.stream().map(i -> i+3).collect(Collectors.toList());
		System.out.println("Create new collection object by adding 3: " + mappedList);
		
		System.out.println("***********************************************************************");
		long countOfNumbers = mappedList.stream().filter(i -> (i < 15)).count();
		System.out.println("Count of values less than 15: " + countOfNumbers); 
		
		System.out.println("***********************************************************************");
		List<Integer> sortedAscendingNumbers = mappedList.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order sorting: " + sortedAscendingNumbers); 
		
		System.out.println("***********************************************************************");
		Comparator<Integer> comp = (i1,i2) -> (i1 < i2) ? 1 : ( (i1>i2) ? -1 : 0 );
		List<Integer> sortedDescendingNumber = mappedList.stream().sorted((i1,i2) -> (i1 < i2) ? 1 : (i1>i2) ? -1 : 0 ).collect(Collectors.toList());
		System.out.println("Descending order sorting: " + sortedDescendingNumber);
		
		List<Integer> sortedAscNumbers = mappedList.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Ascending order sorting using Comparable with reverse objects: " + sortedAscNumbers);
		
		List<Integer> sortedAscNumbers1 = mappedList.stream().sorted((i1,i2) -> -i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Ascending order sorting using Comparable with reverse and negative sign: " + sortedAscNumbers1);
		
		List<Integer> sortedDescendingNumbers = mappedList.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Descending order sorting using Comparable with negative sign: " + sortedDescendingNumbers);
		
		List<Integer> sortedDescendingNumbers1 = mappedList.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Descending order sorting using Comparable with reverse objects: " + sortedDescendingNumbers1);
		
		
	}
}
