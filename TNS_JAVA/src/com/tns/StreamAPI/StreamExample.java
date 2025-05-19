package com.tns.StreamAPI;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class StreamExample {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		
		names.add("Abhi"); 
		names.add("Rushitha");
		names.add("Ruthwik");
		names.add("Sai Raja");
		
//		Filtering names with length > 4
		
		names.stream()
			.filter(name->name.length()>4)
			.map(name->name.toLowerCase())
			.sorted()
			.forEach(System.out::println);
	}
	
	
	
	 
}
