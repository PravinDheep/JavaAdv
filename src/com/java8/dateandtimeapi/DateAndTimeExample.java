package com.java8.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateAndTimeExample {

	public static void main(String[] args) {
		/*
		 * Also called as Joda-time API, because the time api was developed by joda.org.
		 * Until 1.7, we had Date,Calendar,TimeStamp. These classes not recommended to use
		 * wrt. performance, wrt. convenience, some methods also depricated. So for efficient
		 * use, introduced a new API.
		 * 
		 */
		LocalDate ldate = LocalDate.now();
		System.out.println(ldate);
		
		LocalTime ltime = LocalTime.now();
		System.out.println(ltime);
		
		LocalDateTime dt = LocalDateTime.of(ldate, ltime);
		System.out.println();
		System.out.println("Local date time: " + dt);
		
		
		int dayofmonth = ldate.getDayOfMonth();
		Month monthvalue = ldate.getMonth(); //getMonthValue() gets value from 1 to 12.
		int year = ldate.getYear();
		
		System.out.printf("%d/%s/%d", dayofmonth, monthvalue, year);
		
		int hour = ltime.getHour();
		int min = ltime.getMinute(); 
		int sec = ltime.getSecond();
		int nanosec = ltime.getNano();
		System.out.println();
		System.out.printf("%d:%d:%d:%d", hour, min, sec, nanosec);
		
		//Period = Quantity of Time, how many days, hours, years etc.
		LocalDate birthDay = LocalDate.of(1989, 4, 8);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthDay, today);
		System.out.println();
		System.out.printf("Your age is %d years %d months and %d days.", p.getYears(), p.getMonths(), p.getDays());
		
		LocalDate deathDay = LocalDate.of(1989+60, 4, 8);
		Period p1 = Period.between(today, deathDay);
		System.out.println();
		System.out.println("Period: " + p1.getYears() + ", " + p1.getMonths() + ", " + p1.getDays());
		int d = p1.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();
		System.out.println();
		System.out.printf("\n You will be on the earth only %d days, hurryup to do more important things. %d years, %d months, %d days", d, p1.getYears(), p1.getMonths(), p1.getDays());
	}

}
