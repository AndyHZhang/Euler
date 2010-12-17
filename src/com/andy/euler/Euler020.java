package com.andy.euler;

import java.math.BigInteger;

public class Euler020 {
	public static void run() {
		System.out.println("Euler020 begin");

		BigInteger n = new BigInteger("1");
		for (int i = 1; i <= 100; i++) {
			n = n.multiply(new BigInteger(Integer.toString(i)));
		}
		String str = n.toString();
		long sum = 0;
		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i+1);
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);

		System.out.println("Euler020 end");
	}
}
