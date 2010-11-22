package com.andy.euler;

import java.util.ArrayList;


public class Euler007 {
	public static void run() {
		System.out.println("Euler007 begin");
		
		final int N = 3000*1000;
		
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
		
		System.out.println("Got " + mPrime.size() + " prime number");
		System.out.println("The 10001th is " + mPrime.get(10000));
		
		System.out.println("Euler007 end");
	}
}

