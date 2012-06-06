package com.andy.euler;

import java.util.ArrayList;

public class Euler032 {
	public static void run() {
		System.out.println("Euler032 begin " + System.currentTimeMillis());

		ArrayList<Integer> mBuffer = new ArrayList<Integer>();

		// aa x bb = cccc
		for (int i = 12; i <= 98; i++) {
			for (int j = 123; j <= 987; j++) {
				int t = i * j;

				if (isTargetNum(i, j, t) && !mBuffer.contains(t)) {
					mBuffer.add(t);
				}
			}
		}

		// a x bbbb = cccc
		for (int i = 1; i <= 9; i++) {
			for (int j = 1234; j <= 9876; j++) {
				int t = i * j;

				if (isTargetNum(i, j, t) && !mBuffer.contains(t)) {
					mBuffer.add(t);
				}
			}
		}

		System.out.println(mBuffer);

		int count = 0;
		for (Integer i : mBuffer) {
			count += i;
		}
		System.out.println(count);

		System.out.println("Euler032 end " + System.currentTimeMillis());
	}

	private static boolean isTargetNum(int i, int j, int t) {
		String s = "" + i + j + t;
		if (s.length() != 9)
			return false;

		for (int k = 1; k <= 9; k++) {
			if (!s.contains(Integer.toString(k))) {
				return false;
			}
		}

		System.out.println(i + " x " + j + " = " + t);

		return true;
	}
}
