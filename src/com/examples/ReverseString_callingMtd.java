package com.examples;

class Reverse{	
	public void reverseString(String str) {
		System.out.println("Before reverse--"+str);
		char ch[] =str.toCharArray();
		System.out.print("After reverse--");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}
}

public class ReverseString_callingMtd {
	public static void main(String[] args) {
		Reverse res=new Reverse();
		res.reverseString("Vijay");
		
	}
}
