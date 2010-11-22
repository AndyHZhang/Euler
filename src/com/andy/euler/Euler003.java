package com.andy.euler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Euler003 {
	public static void run() {
		final int N = 3000*1000;
		
		System.out.println("Euler003 begin");
		
		// get all prime number less then N
		int[] mPrimeBuffer = new int[N];
		for (int i = 0; i < N; i++) {
			mPrimeBuffer[i] = i;
		}
		mPrimeBuffer[0] = mPrimeBuffer[1] = 0;
		
		ArrayList<Integer> mPrime = new ArrayList<Integer>();
		
		boolean bFinish = false;
		int prime = 0, i;
		while (!bFinish) {
			for (i = prime; i < N; i++) {
				if (mPrimeBuffer[i] != 0) {
					prime = i;
					mPrime.add(prime);
					break;
				}
			}
			
			if (i == N) bFinish = true;
			
			for (i = prime; i < N; i += prime) {
				mPrimeBuffer[i] = 0;
			}
		}
		
		// find the largest prime factor of the number 600851475143
		final BigInteger M = new BigInteger("600851475143");
		final BigInteger ZERO = new BigInteger("0");
		BigInteger mLargetPrime;
		for (i = mPrime.size()-1; i >= 0; i--) {
			mLargetPrime = new BigInteger(mPrime.get(i).toString());
			if (M.mod(mLargetPrime).equals(ZERO)) break;
		}
		
		System.out.println(mPrime.get(i));
		
		System.out.println("Euler003 end");
	}
}
