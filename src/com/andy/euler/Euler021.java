package com.andy.euler;

public class Euler021 {
	public static void run() {
		System.out.println("Euler021 begin " + System.currentTimeMillis());
		
		final int MAX = 10000;
		
		int[] num = new int[MAX];
		for (int i = 1; i < MAX; i++) {
			num[i] = d(i);
		}
		
		long sum = 0;
		for (int i = 1; i < MAX; i++) {
			int d = num[i];
			if (d < MAX && d != i && i == num[d]) {
				sum += i + d;
				System.out.println(i + " " + d);
			}
		}
		
		System.out.println(sum/2);
		
		System.out.println("Euler021 end " + System.currentTimeMillis());
	}
	
	private static int d(int n) {
		int sum = 1;
		int s = (int)Math.sqrt(n);
		for (int i = 2; i < s; i++) {
			if (n % i == 0) {
				sum += i;
				sum += n / i;
			}
		}
		return sum;
	}
}
