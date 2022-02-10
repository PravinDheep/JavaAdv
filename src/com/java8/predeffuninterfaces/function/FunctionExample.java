package com.java8.predeffuninterfaces.function;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;

class Student {
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
}

public class FunctionExample {

	public static void main(String[] args) {
		// Input -> Perform some operation and produce result.
		/*  
			interface Function<T,R>
			{
				public R apply(T t);
			}
			T -> input, R -> Return type.
		 */
		
		/*
		 * Function Chaining
		 * f1.andThen(f2).apply(i) - First apply f1 process and then apply f2 process, so two functions
		 * can be combined to form more complex functions. (F1 followed by F2)
		 * 
		 * f1.compose(f2).apply(i) - First apply f2 process and then apply f1 process, so two functions
		 * can be combined to form more complex functions. (F2 followed by F1)
		 * 
		 */
		
		/*
		 * 
		 * Function
		 * BiFunction
		 * 
		 * PRIMITIVE TYPES OF FUNCTION
		 * ---------------------------
		 * 
		 * In order to avoid, autoboxing and auto unboxing performance issues, we can use
		 * 
		 * IntFunction -  accepts a INT valued argument and return type can be any type (apply)
 		 * IntToLongFunction -  accepts a INT valued argument and returns a DOUBLE valued result, method is applyAsLong(int value)
		 * IntToDoubleFunction -  accepts a INT valued argument and returns a DOUBLE valued result, method is applyAsDouble(int value)
		 * 
		 * LongFunction -  accepts a LONG and return type can be any type (apply)
		 * LongToIntFunction -  accepts a LONG valued argument and returns a INT valued result, method is applyAsInt(long value)
		 * LongToDoubleFunction -  accepts a LONG valued argument and returns a INT valued result, method is applyAsDouble(long value)
		 * 
		 * DoubleFunction -  accepts a DOUBLE and return type can be any type (apply)
		 * DoubleToIntFunction -  accepts a DOUBLE valued argument and returns a INT valued result, method is applyAsInt(double value)
		 * DoubleToLongFunction -  accepts a DOUBLE valued argument and returns a LONG valued result, method is applyAsLong(double value)
		 * 
		 * ToIntFunction - a function that produces an INT-VALUED result. (input can be anything), method is applyAsInt(T value)
		 * ToLongFunction - a function that produces an LONG-VALUED result. (input can be anything), method is applyAsLong(T value)
		 * ToDoubleFunction - a function that produces an DOUBLE-VALUED result. (input can be anything), method is applyAsDouble(T value)
		 * 
		 * ToIntBiFunction - a function that accepts TWO ARGUMENT and produces an INT-VALUED result, method is applyAsInt(T t, U u)
		 * ToLongBiFunction - a function that accepts TWO ARGUMENT and produces an LONG-VALUED result, method is applyAsLong(T t, U u)
		 * ToDoubleBiFunction - a function that accepts TWO ARGUMENT and produces an DOUBLE-VALUED result, , method is applyAsDouble(T t, U u).
		 * 
		 * 
		 * Either care about input or care about return type, any one of these can be suitable.
		 */

		
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(5));
		
		Function<String, Integer> f1 = fu -> fu.length();
		System.out.println(f1.apply("ViratKohli"));
		
		Function<String, String> f2 = fun -> fun.toUpperCase();
		System.out.println(f2.apply("ChangeMeToUpperCase"));

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("Virat", 88));
		al.add(new Student("Rohit", 78));
		al.add(new Student("KLRahul", 76));
		al.add(new Student("RishabhPant", 63));
		al.add(new Student("Rayudu", 47));
		al.add(new Student("RuthrajGaikwad", 53));
		al.add(new Student("ShubmannGill", 33));
		
		Function<Student, String> f3 = stu -> {
			int marks = stu.marks;
			String grade = "";
			//Predicate<Integer> p = marks -> { 
			if(marks >= 80) grade = "A[Distinction]";
			else if(marks >= 60) grade = "B[First Class]";
			else if(marks >= 50) grade = "C[Second Class]";
			else if(marks >= 40) grade = "D[Third Class]";
			else grade = "E[Failed]";
			return grade;
		};
		
		Predicate<Student> p = s -> s.marks > 60;
		for(Student s1 : al) {
			if(p.test(s1)) {
				System.out.println("Student [ Name: " + s1.name + ", Marks: " + s1.marks + ", Grade: " + f3.apply(s1) + "] \n");
			}
		}
		
	}
}
