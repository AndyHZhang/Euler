package com.andy.euler;

import java.math.BigInteger;

public class Euler026 {
	public static void run() {
		System.out.println("Euler026 begin " + System.currentTimeMillis());

		int count = 0;
		int i = 2;
		for (; i < 1000; i++) {
			String targetStr = MAX.divide(new BigInteger(Integer.toString(i)))
					.toString();
			int c = getCycleCount(targetStr.substring(5));
			if (c >= count) {
				count = c;
				System.out.println("count=" + count + ", i=" + i);
			}
		}

		System.out.println(count);

		System.out.println("Euler026 end " + System.currentTimeMillis());
	}

	static BigInteger MAX = initTarget();

	private static int getCycleCount(String s) {
		StringBuilder mBuffer = new StringBuilder();

		String sub = null, newStr;
		for (int i = 2; i < 1500; i++) {
			sub = s.substring(0, i);
			newStr = s.replaceAll(sub, "a");

			if (newStr.startsWith("aaaa")) {
				//if (sub.length() > 200) {
				//	System.out.println(s);
				//	System.out.println(sub);
				//}
				return sub.length();
			}
		}

		return 0;
	}

	private static BigInteger initTarget() {
		StringBuilder sb = new StringBuilder();
		sb.append("1");
		for (int i = 0; i < 1111; i++) {
			sb.append("000000000000");
		}

		return new BigInteger(sb.toString());
	}
}
