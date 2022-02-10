package com.java8.streams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class StreamsExampleString {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		/* al.add("ViratKohli");
		al.add("SachinTendulkar");
		al.add("RohitSharma");
		al.add("KLRahul");
		al.add("Bumrah");
		al.add("YuzvendharChahal"); */
		al.add("A");
		al.add("AAAA");
		al.add("AA");
		al.add("AAAAA");
		al.add("XXX");
		al.add("AAA");
		System.out.println("List in Insertion order: " + al);
		System.out.println("------------------------------------------------------------------------------");
		List<String> stList = al.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order: " + stList);
		System.out.println("------------------------------------------------------------------------------");
		List<String> st = al.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Descending order: " + st);
		System.out.println("------------------------------------------------------------------------------");
		//Increasing length order : Type 1
		Comparator<String> c = (s1, s2) -> { int l1 = s1.length(); int l2 = s2.length();
			if (l1 < l2)
				return -1;
			else if (l1 > l2)
				return 1;
			else
				return s1.compareTo(s2);  //to arrange in alphabetical order(ascending order).
		};
		//Increasing length order : Type 2
		List<String> ilo = al.stream().sorted((s1,s2) -> (s1.length() < s2.length() ? -1 : s1.length() > s2.length() ? 1 : s1.compareTo(s2))).collect(Collectors.toList());
		System.out.println("Increasing Length order: " + ilo);
		System.out.println("------------------------------------------------------------------------------");
		//Reversed Increasing length order
		List<String> rilo = al.stream().sorted((s1,s2) -> -(s1.length() < s2.length() ? -1 : s1.length() > s2.length() ? 1 : s1.compareTo(s2))).collect(Collectors.toList());
		System.out.println("Reversed Increasing Length order: " + rilo);
	}
}