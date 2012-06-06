package com.andy.euler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Euler030 {
	public static void run() {
		System.out.println("Euler029 begin " + System.currentTimeMillis());

		ArrayList<Integer> mBuffer = new ArrayList<Integer> ();
		for (int a = 0; a <= 9; a++) {
			int A = a * a * a * a * a;
			for (int b = 0; b <= 9; b++) {
				int B = b * b * b * b * b;
				for (int c = 0; c <= 9; c++) {
					int C = c * c * c * c * c;
					for (int d = 0; d <= 9; d++) {
						int D = d * d * d * d * d;
						for (int e = 0; e <= 9; e++) {
							int E = e * e * e * e * e;
							for (int f = 0; f <=9; f++) {
								int F = f * f * f * f * f;
								
								int t = a * 100000 + b * 10000 + c * 1000 + d * 100 + e * 10 + f;
								
								if (t == A + B + C + D + E + F) {
									mBuffer.add(t);
								}
							}
						}
					}
				}
			}
		}
		System.out.println(mBuffer);
		
		int count = 0;
		for (Integer i : mBuffer) {
			count += i;
		}
		System.out.println(count-1);

		System.out.println("Euler029 end " + System.currentTimeMillis());
	}
}
