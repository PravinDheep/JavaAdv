package com.java8.predeffuninterfaces.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.predeffuninterfaces.consumer.Student;

import java.util.function.Function;

class Student{
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
}

public class ConsumerExample {

	public static void main(String[] args) {
		// Consumer<T> --> void
		/* interface Consumer<T>{
		 * 		public void accept(T t);
		 * }
		 */
		
		/*
		 * PRIMITIVE TYPES OF CONSUMER
		 * ---------------------------
		 * In order to avoid, autoboxing and auto unboxing performance issues, we can use
		 * 
		 * Always Consumer cares about INPUT only, it doesn't have return type, hence
		 * 
		 * IntConsumer - accepts a INT valued argument and no return type. 
		 * LongConsumer - accepts a LONG valued argument and no return type. 
		 * DoubleConsumer - accepts a DOUBLE valued argument and no return type. 
		 * 
		 * ObjIntConsumer<T> - accepts an OBJECT-VALUED and INT-VALUED argument and returns no result, method accept(T t, int value) 
		 * ObjLongConsumer<T> - accepts an OBJECT-VALUED and LONG-VALUED argument and returns no result, method accept(T t, long value)
		 * ObjDoubleConsumer<T> - accepts an OBJECT-VALUED and DOUBLE-VALUED argument and returns no result, method accept(T t, double value)
		 * Above three are like BICONSUMER.
		 * 
		 * Method name is always accept only.
		 * 
		 * IntBiPredicate - NO SUCH METHODS AVAILABLE.
		 */
		
		Consumer<String> c1 = st -> System.out.println(st);
		c1.accept("Team India:Captain: Virat Kohli" + "\n");
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("Virat", 88));
		al.add(new Student("Rohit", 78));
		al.add(new Student("KLRahul", 76));
		al.add(new Student("RishabhPant", 63));
		al.add(new Student("Rayudu", 47));
		al.add(new Student("RuthrajGaikwad", 53));
		al.add(new Student("KedharJadhav", 33));
		
		Function<Student, String> f = stu -> {
			String grade = "";
			int marks = stu.marks;
			if(marks >= 80) grade = "A[Distinction]";
			else if(marks >= 60) grade = "B[First Class]";
			else if(marks >= 50) grade = "C[Second Class]";
			else if(marks >= 40) grade = "D[Third Class]";
			else grade = "E[Failed]";
			return grade;
		};
		
		Predicate<Student> p = st -> st.marks > 60;
		
		Consumer<Student> con = s -> System.out.println(s.name + " - " + s.marks + " - " + f.apply(s));
		
		for(Student s1 : al) {
			if(p.test(s1)) {
				con.accept(s1);
			}
		}
		
	}

}
