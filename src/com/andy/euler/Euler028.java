package com.andy.euler;

import java.math.BigInteger;

public class Euler028 {
	public static void run() {
		System.out.println("Euler027 begin " + System.currentTimeMillis());

		int count1 = 0;
		for (int i = 3; i <= 1001; i += 2) {
			count1 += i * i;
		}

		int count2 = 0;
		for (int i = 2; i <= 1000; i += 2) {
			count2 += i;
		}

		int count = 1 + count1 * 4 - count2 * 6;
		System.out.println(count);

		System.out.println("Euler027 end " + System.currentTimeMillis());
	}
}
