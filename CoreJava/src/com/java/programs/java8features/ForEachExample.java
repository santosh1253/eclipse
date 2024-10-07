package com.java.programs.java8features;

import java.util.HashSet;

interface Sim {
	public void Airtel(int simno);
}

public class ForEachExample {
	public static void main(String[] args) {
		Sim sim = (simno) -> {
			System.out.println("User is using Airtel Sim using simno" + simno);

		};
		sim.Airtel(87654);
        HashSet<String> hs=new HashSet<>();
        hs.add("Guru");
        hs.add("Datta");
        hs.add("rowdy");
        hs.add("datta");
        hs.add("hello");
        hs.stream().forEach((x)->{System.out.println(x);});
//        hs.forEach((x)->{System.out.println(x);});
//        hs.forEach(System.out::println);

        
        
	}

}
