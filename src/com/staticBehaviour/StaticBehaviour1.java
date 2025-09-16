package com.staticBehaviour;

public class StaticBehaviour1 {
	
	public static String collegename="BVB";
	final int totalStudentCount=1000;
	
	public static void studentList() {
		collegename="hubli";  // non static methd used to chnage staic variable value
		//totalStudentCount=2000; cant assign non static variable value in static mthd
		System.out.println("static method");
		//System.out.println(totalStudentCount); cant call non static variable in static method
	}
	
	public void normalMtd() {	
		
		//totalStudentCount=2000; cany change final variable value
		System.out.println("non static method");
		System.out.println(totalStudentCount);
		System.out.println(collegename);
		
	}

}
