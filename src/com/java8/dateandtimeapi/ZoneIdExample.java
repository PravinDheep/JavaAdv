package com.java8.dateandtimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdExample {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.systemDefault();
		Set<String> zoneIdList = ZoneId.getAvailableZoneIds();
		System.out.println(zoneId);
		System.out.println("--------------------------------------------------------");
		//zoneIdList.stream().forEach(System.out::println);
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println(zdt);
	}

}
