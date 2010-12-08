package com.andy.euler;

import java.math.BigInteger;

public class Euler016 {
	public static void run() {
		System.out.println("Euler016 begin");
		
		BigInteger num = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		for (int i = 0; i < 1000; i++) {
			num = num.multiply(two);
		}
		
		String str = num.toString();
		long sum = 0;
		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i+1);
			sum += Integer.parseInt(s);
		}
		
		System.out.println(sum);
		
		System.out.println("Euler016 end");
	}
}
