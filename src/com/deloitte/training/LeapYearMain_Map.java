package com.deloitte.training;

import java.util.Arrays;
import java.util.List;

public class LeapYearMain_Map {

	public static void main(String[] args) {
		List<Year> yearlist = Arrays.asList(new Year(2020), new Year(1997), new Year(2014), new Year(2016),
				new Year(2000), new Year(2024), new Year(1954), new Year(1882), new Year(1798));
		yearlist.
			stream().
				filter(Year::isLeapYear).
					forEach(System.out::println);
	}

}

class Year {
	private Integer year;

	public Year(Integer year) {
		this.year = year;
	}

	public Integer getYear() {
		return year;
	}

	public static boolean isLeapYear(Year year) {
		if (year.getYear() % 100 == 0) {
			return year.getYear() % 400 == 0;
		} else {
			return year.getYear() % 4 == 0;
		}
	}

	@Override
	public String toString() {
		return "" + year;
	}
}