package com.andy.euler;

import java.math.BigInteger;
import java.util.HashMap;

public class Euler025 {
	public static void run() {
		System.out.println("Euler025 begin " + System.currentTimeMillis());

		initFibonacci();
		BigInteger target = initTarget();
		int i;
		for (i = 100; F(i).compareTo(target) == -1; i += 100);
		for (i -= 100; F(i).compareTo(target) == -1; i++);
		
		System.out.println(i);
		
		System.out.println("Euler025 end " + System.currentTimeMillis());
	}
	
	private static HashMap<Integer, BigInteger> mFibonacci;
	
	private static void initFibonacci() {
		mFibonacci = new HashMap<Integer, BigInteger>();
		mFibonacci.put(1, new BigInteger("1"));
		mFibonacci.put(2, new BigInteger("1"));
		mFibonacci.put(3, new BigInteger("2"));
		mFibonacci.put(4, new BigInteger("3"));
		mFibonacci.put(5, new BigInteger("5"));
		mFibonacci.put(6, new BigInteger("8"));
		mFibonacci.put(7, new BigInteger("13"));
		mFibonacci.put(8, new BigInteger("21"));
		mFibonacci.put(9, new BigInteger("34"));
	}
	
	private static BigInteger initTarget() {
		StringBuilder sb = new StringBuilder();
		sb.append("1");
		for (int i = 0; i < 111; i++) {
			sb.append("000000000");
		}
		
		return new BigInteger(sb.toString());
	}
	
	private static BigInteger F(int n) {		
		BigInteger result = mFibonacci.get(n);
		if (result == null) {
			if (n%2 == 0) {
				result = F(n/2).multiply(F(n/2+1).add(F(n/2-1)));
			} else {
				BigInteger first = F((n+3)/2).multiply(F((n-1)/2));
				BigInteger second = F((n+1)/2).multiply(F((n-3)/2));
				result = first.add(second);
			}
			mFibonacci.put(n, result);
		}
		return result;
	}
}
