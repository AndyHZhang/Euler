package com.andy.euler;

import java.util.ArrayList;

public class Euler023 {
	public static void run() {
		System.out.println("Euler023 begin " + System.currentTimeMillis());
		
		//final int MAX = 28123 + 1;
		final int MAX = 30000;
		
		int[] num = new int[MAX];
		for (int i = 0; i < MAX; i++) {
			num[i] = i;
		}
		
		ArrayList<Integer> abundant = new ArrayList<Integer>();
		for (int i = 10; i < MAX; i++) {
			if (sum(i) > i) {
				abundant.add(i);
				for (Integer j : abundant) {
					if (i + j < MAX) {
						num[i+j] = 0;
					}
				}				
			}
		}
		
		double sum = 0;
		for (int i = 0; i < MAX; i++) {
			sum += num[i];
		}
		System.out.println(sum);
		
		System.out.println("Euler023 end " + System.currentTimeMillis());
	}
	
	private static int sum(int num) {
		int sum = 1;
		int s = (int)Math.sqrt(num);
		for (int i = 2; i <= s; i++) {
			if (num % i == 0) {
				sum += i;
				sum += num / i;
			}
		}
		
		if (s*s == num) sum -= s;
		
		return sum;
	}
}
