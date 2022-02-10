package com.java8.predeffuninterfaces.BiConsumer;
import java.util.ArrayList;
import java.util.function.BiConsumer;

class Cricketers {
	String name;
	double salary;
	Cricketers(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
}
public class BiConsumerExample {

	public static void main(String[] args) {
		ArrayList<Cricketers> l = new ArrayList<>();
		populate(l);
		BiConsumer<Cricketers, Double> e = (c,d) -> c.salary = c.salary + d;
		for(Cricketers c: l) {
			e.accept(c, 1000.0);
		}
		for(Cricketers cc : l) {
			System.out.println("Employee Name: " + cc.name);
			System.out.println("Employee Salary: " + cc.salary);
		}
	}

	public static void populate(ArrayList<Cricketers> l) {
		l.add(new Cricketers("KLRahul", 70000));
		l.add(new Cricketers("Virat", 90000));
		l.add(new Cricketers("Shreyas", 60000));
		l.add(new Cricketers("Shubmann", 50000));
		l.add(new Cricketers("Rohit", 80000));
	}
}
