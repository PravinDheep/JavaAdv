package com.java8.predeffuninterfaces.BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Cricketer {
	int eno;
	String ename;
	Cricketer(int eno, String ename){
		this.eno = eno;
		this.ename = ename;
	}
}
public class BiFunctionExample {

	public static void main(String[] args) {
		// Sometimes, it has to take two input arguments and peform some operation.
		ArrayList<Cricketer> al = new ArrayList<>(); 
		BiFunction<Integer, String, Cricketer> bif = (eno, ename) -> new Cricketer(eno, ename);
		al.add(bif.apply(5, "ViratKohli"));
		al.add(bif.apply(7, "MSDhoni"));
		al.add(bif.apply(45, "RohitSharma"));
		
		for(Cricketer e : al) {
			System.out.println("Cricketer No: " + e.eno + " - " + "Cricketer Name: " + e.ename);
		}
	}

}