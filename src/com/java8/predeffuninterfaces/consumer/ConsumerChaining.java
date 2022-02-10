package com.java8.predeffuninterfaces.consumer;
import java.util.function.Consumer;
class Movie {
	String name;
	Movie(String name){
		this.name = name;
	}
}
public class ConsumerChaining {

	public static void main(String[] args) {
		Consumer<Movie> c1 = m -> System.out.println(m.name + " to be released");
		Consumer<Movie> c2 = m -> System.out.println(m.name + " released and it is flop");
		Consumer<Movie> c3 = m -> System.out.println(m.name + " storing flop movie in sun tv database");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		Movie fm = new Movie("Spider");
		cc.accept(fm);
	}

}
