package com.andy.euler;

public class Euler004 {
	public static void run() {
		System.out.println("Euler004 begin");
		
		int LIMIT = 900;
		int maxValue = 0;
		
		for (int i = 999; i > LIMIT; i--) {
			for (int j = 999; j > LIMIT; j--) {
				if (checkPalindromic(i*j)) {
					System.out.println(i + " * " + j + " = " + (i*j));
					maxValue = checkMax(maxValue, i*j);
					break;
				}
			}
		}
		
		System.out.println("Max is " + maxValue);
		
		System.out.println("Euler004 end");
	}
	
	private static int checkMax(int a, int b) {
		return (a > b) ? a : b;
	}
	
	private static boolean checkPalindromic(int d) {
		char[] str = Integer.toString(d).toCharArray();
		int len = str.length;
		
		for (int i = 0; i < len/2; i++) {
			if (str[i] != str[len-i-1])
				return false;
		}
		
		return true;
	}
}
