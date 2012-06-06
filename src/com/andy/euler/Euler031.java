package com.andy.euler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Euler031 {
	public static void run() {
		System.out.println("Euler031 begin " + System.currentTimeMillis());

		int count = 0;
		for (int a = 0; a <= 2; a++) {
			int A = 100 * a;
			for (int b = 0; b <= 4; b++) {
				int B = 50 * b;
				for (int c = 0; c <= 10; c++) {
					int C = 20 * c;
					for (int d = 0; d <= 20; d++) {
						int D = 10 * d;
						for (int e = 0; e <= 40; e++) {
							int E = 5 * e;
							for (int f = 0; f <= 100; f++) {
								int F = 2 * f;
								if (A + B + C + D + E + F <= 200) {
									count++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count+1);

		System.out.println("Euler031 end " + System.currentTimeMillis());
	}
}
