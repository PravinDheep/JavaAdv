package com.java8.methodandconstructorref;

class Student {
	String sname;
	int marks, age;
	
	Student(String sname, int marks, int age){
		this.sname = sname;
		this.marks = marks;
		this.age = age;
		System.out.println(this.sname + " - " + this.marks + " - " + this.age);
	}
}
interface InterStud {
	public Student get(String sname,int marks,int age);
}
public class ConstructorReferenceEx2 {

	public static void main(String[] args) {
		InterStud is = (sname, marks, age) -> new Student(sname, marks, age);
		InterStud iss = Student::new;
		is.get("virat", 78, 28);
		iss.get("viratkohli", 98, 29);
	}

}