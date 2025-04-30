// Compile time Polymorphism

package com.tns.oops;

class Polymorphism{
	
	String message;
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public float add(float a, float b) {
		return a+b;
	}
	
	Polymorphism(String message){
		this.message=message;
	}
	
	@Override
	public String toString() {
		return message;
	}
	
	public static void main(String args[]) {
		Polymorphism pol=new Polymorphism("Hi Da..");
		
		System.out.println(pol);
		
		System.out.println(pol.add(4, 5));
		System.out.println(pol.add(3.0f, 6.0f));
	}
}