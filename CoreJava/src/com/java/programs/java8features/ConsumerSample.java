package com.java.programs.java8features;

import java.util.function.Consumer;

public class ConsumerSample {
	
	//Consumer is a functional Interface the method is void accept()

	public static void main(String[] args) {
		Student s=new Student(1,"Guru Datta");
		Consumer c=(a)->{
			System.out.println("Hello user "+ a);
			
			};
			c.accept(s);
	}

}
