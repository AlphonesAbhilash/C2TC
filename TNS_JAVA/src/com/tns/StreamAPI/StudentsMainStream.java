package com.tns.StreamAPI;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StudentsMainStream {

	public static void main(String[] args) {
		List<Students> students=new ArrayList<>();
		
		students.add(new Students("Abhi",55));
		students.add(new Students("Rushitha",85));
		students.add(new Students("Ruthwik",76));
		students.add(new Students("Sai Raja",45));
		students.add(new Students("Anjali",92));
		students.add(new Students("Teju",63));
		
		students.stream()
			.filter(student->student.marks>=60)		
			.map(student->student.name.toUpperCase())
			.sorted()
			.forEach(System.out::println);
		
//			.filter(student->student.marks>60).map(student->student.toLowerCase())
//			.sorted()
//			.forEach(System.out::println);
//	
		System.out.println();

		for(Students s:students) {
			System.out.println(s);

		}
	}
	
	
}
