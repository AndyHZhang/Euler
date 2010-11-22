package com.andy.euler;

import java.math.BigInteger;

public class Euler010 {
	public static void run() {		
		System.out.println("Euler010 begin");
		
		final int N = 2*1000*1000;
		BigInteger sum = new BigInteger("0");
		
		// get all prime number less then N
		int[] mPrimeBuffer = new int[N];
		for (int i = 0; i < N; i++) {
			mPrimeBuffer[i] = i;
		}
		mPrimeBuffer[0] = mPrimeBuffer[1] = 0;
		
		boolean bFinish = false;
		int prime = 0, i;
		while (!bFinish) {
			for (i = prime; i < N; i++) {
				if (mPrimeBuffer[i] != 0) {
					prime = i;
					//if (sum < N && sum + prime > N)
						//System.out.println(sum + " " + prime);
					sum = sum.add(new BigInteger(Integer.toString(prime)));
					break;
				}
			}
			
			if (i == N) bFinish = true;
			
			for (i = prime; i < N; i += prime) {
				mPrimeBuffer[i] = 0;
			}
		}
		
		System.out.println(sum);
		
		System.out.println("Euler010 end");
	}
}
