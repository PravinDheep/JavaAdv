package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsExampleMaxMin {

	public static void main(String[] args) {
		/* There is no concept of min(Comparator) and max(Comparator) element without sorting.
		 * [5,3,10,15,4]
		 * [3,4,5,10,15] min = 3, max = 15; Ascending order as per sorting.
		 * [15,10,5,4,3] min = 15, max = 3; Descending order as per sorting.
		 */
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Insertion order: " + al);
		System.out.println("------------------------------------------------------------------------------");
		Integer minVal = al.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println("Minimum Value in the List: " + minVal);
		System.out.println("------------------------------------------------------------------------------");
		Integer maxVal = al.stream().max((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println("Maximum Value in the List: " + maxVal);
	}

}
