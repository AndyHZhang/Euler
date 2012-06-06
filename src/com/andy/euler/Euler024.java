package com.andy.euler;

import java.util.ArrayList;

public class Euler024 {
	public static void run() {
		System.out.println("Euler024 begin " + System.currentTimeMillis());

		int M = 1000 * 1000 - 1;
		int n1 = 1;
		int n2 = 2;
		int n3 = n2 * 3;
		int n4 = n3 * 4;
		int n5 = n4 * 5;
		int n6 = n5 * 6;
		int n7 = n6 * 7;
		int n8 = n7 * 8;
		int n9 = n8 * 9;

		M = checkStep(M, n9);
		M = checkStep(M, n8);
		M = checkStep(M, n7);
		M = checkStep(M, n6);
		M = checkStep(M, n5);
		M = checkStep(M, n4);
		M = checkStep(M, n3);
		M = checkStep(M, n2);
		M = checkStep(M, n1);
		
		System.out.println(mResult.get(0));
		System.out.println("M=" + M);
		
		System.out.println("Euler024 end " + System.currentTimeMillis());
	}

	private static int checkStep(int currentValue, int step) {
		printResult(currentValue/step);

		return currentValue%step;
	}
	
	private static ArrayList<Integer> mResult;
	private static void printResult(int index) {
		if (mResult == null) {
			mResult = new ArrayList<Integer>();
			for (int i = 0; i < 10; i++) {
				mResult.add(i);
			}
		}
		
		System.out.print(mResult.get(index));
		mResult.remove(index);
	}
}
