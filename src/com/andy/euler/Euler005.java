package com.andy.euler;

public class Euler005 {
	public static void run() {
		System.out.println("Euler005 begin");
		
		int mLcm = 1;
		for (int i = 1; i <= 20; i++) {
			mLcm = lcm(mLcm, i);
			System.out.println(mLcm);
		}
		System.out.println(mLcm);
		
		System.out.println("Euler005 end");
	}
	
	private static int lcm(int m, int n) {
		if (m < n) {
			int c = m;
			m = n;
			n = c;
		}
		
		if (m % n == 0) 
			return m;
		else
			return m * n / gcd(m,n);
	}
	
	private static int gcd(int a, int b) {
		if (a < b) {
			int c = a;
			a = b;
			b = c;
		}
		
		for (int c = a%b; c > 0; c = a%b) {
			a = b;
			b = c;
		}
		
		return b;
	}
}
