package com.andy.euler;

public class Euler009 {
	
	public static void run() {
		System.out.println("Euler009 begin");
		
		int a, b=0;
		for (a = 3; a < 500; a++) {
			if ((500000 - a*1000) % (1000 - a) == 0) {
				b = (500000 - a*1000) / (1000 - a);
				break;
			}
		}
		
		System.out.println(a * b * (1000 - a - b));
		
		System.out.println("Euler009 end");
	}

}
