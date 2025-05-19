package com.tns.StreamAPI;

import java.util.List;
import java.util.ArrayList;

public class Students {

	int marks;
	String name;
	
	Students(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return name+" : "+marks;
	}
	
	
	
}
