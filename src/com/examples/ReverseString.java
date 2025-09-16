package com.examples;

public class ReverseString {

	public static void main(String[] args) {
		String str="Vijay";
		String reverse="";
		System.out.println("Before reverse--"+str);
		
		char ch[] =str.toCharArray();
		System.out.print("After reverse--");
		
		for(int i=ch.length-1;i>=0;i--) {
			reverse=reverse+ str.charAt(i);			
		}
		System.out.print(reverse);
	}
}
