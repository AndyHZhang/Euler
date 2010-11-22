package com.andy.euler;

public class Euler002 {
	public static void run() {
		int a = 1, b = 2;
		int next = a + b;
		int sum = b;
		
		while (next < 4000000) {
			if (next % 2 == 0) {
				sum += next;
				//System.out.println(next);
			}
			
			a = b;
			b = next;
			next = a + b;
		}
		
		System.out.println(sum);
	}
}
