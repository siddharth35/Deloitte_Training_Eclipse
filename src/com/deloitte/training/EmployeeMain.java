package com.deloitte.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.forEach(System.out::println);
		
		Comparator<Employee> sortBySal = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				 return (int)(o1.getSal()-o2.getSal()); 
			}
		};
		Comparator<Employee> sortByName = (o1,o2)->{ return o1.getName().compareTo(o2.getName()); };
		Collections.sort(emplist, (o1,o2)->{return o1.getId()-o2.getId();});
	}

}

class Employee implements Comparable<Employee> {
	private Integer id;
	private String name;
	private Double sal;

	public Employee(Integer id, String name, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return id + "\t\t" + name + "\t\t" + sal;
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}

}
