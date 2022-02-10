package com.java8.dateandtimeapi;

import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeExample {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		int dayofmonth = dt.getDayOfMonth();
		Month monthvalue = dt.getMonth(); //getMonthValue() gets value from 1 to 12.
		int year = dt.getYear();
		
		System.out.printf("\nDate: %d/%s/%d", dayofmonth, monthvalue, year);
		
		int hour = dt.getHour();
		int min = dt.getMinute(); 
		int sec = dt.getSecond();
		int nanosec = dt.getNano();
		System.out.println();
		System.out.printf("\nTime: %d:%d:%d:%d", hour, min, sec, nanosec);

		LocalDateTime ldt = LocalDateTime.of(1994,Month.MAY,23,12,45); // can use 05 in the place of Month.MAY.
		System.out.println();
		System.out.println("Date Time: " + ldt);

		System.out.println("After 5 months: " + ldt.plusMonths(5));
		
	}

}
