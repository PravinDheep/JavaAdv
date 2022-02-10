package com.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMapExample {

	public static void main(String[] args) {
		Map<String, List<String>> peopleAndPhoneNumbersMap = new HashMap<>();
		peopleAndPhoneNumbersMap.put("AA", Arrays.asList("999-2256-766","999-4467-788"));
		peopleAndPhoneNumbersMap.put("BB", Arrays.asList("999-5523-877","999-8766-877"));
		peopleAndPhoneNumbersMap.put("CC", Arrays.asList("999-7766-654","999-7756-754"));
		
		
		List<String> flatMapValues = peopleAndPhoneNumbersMap.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
	
		flatMapValues.forEach(System.out::println);
		System.out.println("------------------------------------------------");
		List<Stream<String>> mapValues = peopleAndPhoneNumbersMap.values().stream().map(Collection::stream).collect(Collectors.toList());
	
		for(Stream<String> s : mapValues) {
			List<String> phoneList = s.collect(Collectors.toList());
			System.out.println(phoneList);
		}
		System.out.println("------------------------------------------------");
	}
	
}
