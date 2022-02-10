package com.java8.dateandtimeapi;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.Scanner;

public class DateAndTimeYearClassExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year number: ");
		int n = scan.nextInt();
		Year y = Year.of(n);
		if(y.isLeap()) {
			System.out.printf("%d year is a leap year.", n);
		}
		else {
			System.out.printf("%d year is not a leap year.", n);
		}
	}
}