package com.java8.lambdaexpression;
import java.util.ArrayList;
import java.util.Collections;

class Employee {
	String ename;
	int eno;
	
	Employee(String ename, int eno){
		this.ename = ename;
		this.eno = eno;
	}

	@Override
	public String toString() {
		//return "Employee [ename=" + ename + ", eno=" + eno + "]";
		return eno + ":" + ename;
	}
	
}

public class LambdaCustomExample {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sourav",232));
		empList.add(new Employee("ViratKohli",230));
		empList.add(new Employee("RohitSharma",220));
		empList.add(new Employee("KLRahul",250));
		empList.add(new Employee("Dhoni",270));
		System.out.println(empList);
		Collections.sort(empList, (e1,e2)-> (e1.eno<e2.eno?-1:e1.eno>e2.eno?1:0) );
		System.out.println(empList);
		//String objects s1.compareTo(s2) method is always sorts in alphabetical only by default	
		Collections.sort(empList, (e1,e2)-> e1.ename.compareTo(e2.ename));
		System.out.println(empList);
		
		
	}

}