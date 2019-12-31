package com.deloitte.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test_MapFilterReduce {
	public static void main(String[] args) {
		run();
	}
	
	private static void run() {
		List<Integer> nums = Arrays.asList(5,2,6,7,1,9,3,8,4);
		nums.
			stream().
				filter((i)->i%2!=0).
					map((i)->i*i).
						reduce(0, (s,c)->s+c);
		
		
		List<String> items = Arrays.asList("Abhi","Payal","Rahul","Mohan");
		/*Lambda Expression Implementation*/
		items.
			stream().
				filter((s)->s.length()>4).
					map(String::toUpperCase).
						forEach(System.out::println);
		
		/*Anonymous Inner Class Implementation*/
		items.
			stream().
				filter(new Predicate<String>() {
					@Override
					public boolean test(String t) {
						return t.length()>4;
					}
					
				}).
					map(new Function<String, String>() {
						@Override
						public String apply(String t) {
							return t.toUpperCase();
						}
						
					}).
						forEach(new Consumer<String>() {
							@Override
							public void accept(String t) {
								System.out.println(t);
							}
						});
	}
}