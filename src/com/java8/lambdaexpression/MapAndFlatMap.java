package com.java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MapAndFlatMap {

	static void mapping() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Integer> squareOfNumbers = numbers.stream().map(i -> i * i).collect(toList());
		System.out.println(squareOfNumbers);
		
		String[] arrayOfWords = {"hello", "world"};
		Stream<String> streamList = Arrays.stream(arrayOfWords);
		System.out.println(streamList.distinct().collect(toList()));
		List<String> words = Arrays.asList("Java8","Lambdas","In","Action");
		List<String[]> splitWords = words.stream().map(word -> word.split("")).collect(toList());
		for(String[] splitWord : splitWords) {
			System.out.println(">>>>>: " + Arrays.toString(splitWord));
		}
		
		
		//splitWords.forEach(System.out::println);
		for(int i = 0; i < splitWords.size() ; i++) {
			String[] splitArray = splitWords.get(i);
			for(int j = 0; j < splitArray.length; j++) {
				System.out.print(splitArray[j] + ",");
			}
		}		
		
		List<Integer> number1 = Arrays.asList(1,2,3);
		List<Integer> number2 = Arrays.asList(3,4);
		List<int[]> listStreams = number1.stream().flatMap(j -> number2.stream().map(k -> new int[]{j,k})).collect(toList());
		for (int i = 0; i < listStreams.size(); i++) {
		    int[] strings = listStreams.get(i);
		    System.out.println();
		    for (int j = 0; j < strings.length; j++) {
		        System.out.print(strings[j] + " ");
		    }
		    System.out.println();
		}
	}
	
	public static void main(String[] args) {
		mapping();
	}

}
