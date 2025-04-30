package com.tns.oops;

class TryIt{
	
	public void mess() {
		System.out.println("Hi Mahca");
	}
	
}

class DoIt extends TryIt{
	public void mess() {
		System.out.println("Etlunnav");
	}
}

class RuntimePoly{
	public static void main(String args[]) {
		TryIt x=new TryIt();
		DoIt y=new DoIt();
		
		x.mess();
		y.mess();
	}
}