package com.staticBehaviour;

public class StaticBehaviour2 {

	public static void main(String[] args) {
		
		System.out.println(StaticBehaviour1.collegename);// only static variables can access directly 
		
		//System.out.println(StaticBehaviour1.totalStudentCount);//normal variables can not access directly 
		
		StaticBehaviour1.studentList();
		
		StaticBehaviour1 obj=new StaticBehaviour1();
		
		obj.normalMtd();
		
		StaticBehaviour3 obj3=new StaticBehaviour3();
		obj3.mtdtoFetch();
		
		
		
	}

}
