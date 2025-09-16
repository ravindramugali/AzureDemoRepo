package com.examples;

public class PrimeNumbers {

	public static void main(String[] args) {
				
		System.out.println("Prime numbers between 1 and 10 are:");
		
        for (int i = 2; i <= 10; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                
            }
        }

	}

}
