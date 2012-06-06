package com.andy.euler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Euler028 {
	public static void run() {
		System.out.println("Euler028 begin " + System.currentTimeMillis());

		ArrayList<BigInteger> mBuffer = new ArrayList<BigInteger> ();
		for (int a = 2; a <= 100; a++) {
			BigInteger A = new BigInteger(Integer.toString(a));
			BigInteger c = new BigInteger(Integer.toString(a));
			for (int b = 2; b <= 100; b++) {
				c = c.multiply(A);
				if (!mBuffer.contains(c)) {
					mBuffer.add(c);
				}
			}
		}
		System.out.println(mBuffer.size());

		System.out.println("Euler028 end " + System.currentTimeMillis());
	}
}
