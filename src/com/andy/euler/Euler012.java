package com.andy.euler;

public class Euler012 {
	public static void run() {
		System.out.println("Euler012 begin");
		
		final int MAX = Integer.MAX_VALUE/10;
		
		int sum = 0;
		for (int i=1; i < MAX; i++) {
			sum += i;
			int end = (int)Math.sqrt(sum);
			int divisorCount = 0;
			for (int j=1; j <= end; j++) {
				if (sum % j == 0) {
					divisorCount += 2;
				}
			}
			if (sum % end == 0) divisorCount--;
			
			if (divisorCount >= 500) {
				System.out.println("sum: " + sum + ",divisor count: " + divisorCount);
				break;
			}
		}
		
		System.out.println("Euler012 end");
	}
}
