package com.java8.predeffuninterfaces.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	boolean isHavingGf = true;
	String name;
	double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
}

public class PredicateEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Virat", 40000));
		emp.add(new Employee("Rohit", 10000));
		emp.add(new Employee("Rahul", 30000));
		emp.add(new Employee("Rishabh", 20000));
		emp.add(new Employee("Dhoni", 50000));
		
		Predicate<Employee> p = e -> e.salary > 20000 && e.isHavingGf==true;
		
		for(Employee e1 : emp) {
			if(p.test(e1)) { 
				/*  We can use e.salary > 20000 in the if statement, but if future, if there are
				 *  10 conditions, Predicate<Employee> p = e -> e.salary > 20000, 10 conditions,
				 *  we can simply use p.test(e1) in the if statement.
				 * 
				 */
				System.out.println(e1.name + " - " + e1.salary);
			}
		}
	}
}