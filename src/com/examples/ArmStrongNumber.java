package com.examples;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int num=371;
		int givennumber=num;
		int rem;
		double sum = 0;
		System.out.println("Given number--"+num);
		while(num!=0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			//sum=sum+Math.pow(rem, 3);
			num=num/10;
		}
		
		if(givennumber==sum) {
			System.out.println("Given number is armstrong");
			
		}else {
			System.out.println("Given number is not armstrong");
		}	

	}

}
