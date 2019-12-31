package com.deloitte.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test_Map {
	public static void main(String[] args) {
		run();
		run1();
	}
	private static void run() {
		Map<String, String> trainees = new HashMap<>();
		trainees.put("Hashir", "Jamshedpur");
		trainees.put("Siddharth", "Odisha");
		trainees.put("Badyal", "Jammu");
		trainees.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println(trainees);
	}
	private static void run1() {
		Map<Character, Integer> coc = new HashMap<>();
		String in = Utility.read("Enter a String: ");
		int n = in.length();
		for(int i = 0; i < n; i++) {
			Character c = in.charAt(i);
			if(coc.containsKey(c))
				coc.put(c, coc.get(c)+1);
			else
				coc.put(c, 1);
		}
		coc.forEach((k,v)->System.out.println(k+" = "+v));
	}
	public static void sortMails(String[] mails) {
		Map<String, HashSet<String>> sortedList = new HashMap<>();
		String mailsite = null;
		for(int i =0; i < mails.length; i++) {
			mailsite = mails[i].substring(mails[i].lastIndexOf('@') + 1, mails[i].lastIndexOf('.'));
			if(sortedList.containsKey(mailsite)) {
				sortedList.get(mailsite).add(mails[i]);
			} else {
				HashSet<String> m = new HashSet<>();
				m.add(mails[i]);
				sortedList.put(mailsite, m);
			}
		}
		System.out.println(sortedList);
	}
}
