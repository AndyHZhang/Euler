package com.andy.euler;

import java.util.Calendar;

public class Euler019 {
	public static void run() {
		System.out.println("Euler019 begin");

		int[] weeks = { 1, 4, 4, 7, 2, 5, 7, 3, 6, 1, 4, 6 };

		int sundayCount = 0;
		for (int i = 1901; i < 2001; i++) {
			String out = "";
			for (int j = 0; j < 12; j++) {
				weeks[j] += 1;
				if (j > 1) {
					if (i % 4 == 0)
						weeks[j] += 1;
				} else {
					if ((i - 1) != 1900 && (i - 1) % 4 == 0)
						weeks[j] += 1;
				}
				weeks[j] %= 7;
				out += weeks[j] + " ";
				if (weeks[j] == 0) {
					sundayCount++;
				}
			}
			
			System.out.println(out);
		}
		
		System.out.println(sundayCount);

		System.out.println("Euler019 end");
	}
}
