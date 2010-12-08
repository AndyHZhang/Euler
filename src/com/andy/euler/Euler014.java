package com.andy.euler;

import java.util.ArrayList;

public class Euler014 {
	
	public static void run() {
		System.out.println("Euler014 begin");
		
		final int MAX = 1000*1000;
		
		int maxDeep = 0;
		int maxValue = 0;
		
		int[] deeps = new int[MAX];
		for (int i = 0; i < MAX; i++) {
			deeps[i] = 0;
		}
		deeps[1] = 1;
		
		for (int i = 1; i < MAX; i++) {
			long value = i;
			int deep = 0;
			ArrayList<Long> array = new ArrayList<Long>();
			while (true) {
				deep++;
				array.add(value);
				
				if (value % 2 == 0) {
					value = value / 2;
				} else {
					value = 3 * value + 1;
				}
				
				if (value < MAX && deeps[(int)value] != 0) break;
			}
			
			deep += deeps[(int)value];
			
			if (deep > maxDeep) {
				maxValue = i;
				maxDeep = deep;
			}
			
			for (long temp : array) {
				if (temp < MAX) deeps[(int)temp] = deep;
				deep--;
			}
		}
		
		System.out.println(maxValue);
		
		System.out.println("Euler014 end");
	}
	
	private static int getDeep(int value) {
		int deep = 1;
		while (value != 1) {
			if (value % 2 == 0) {
				value /= 2;
			} else {
				value = 3 * value + 1;
			}
			deep++;
		}
		
		return deep;
	}
	
	static class Node {
		private int mValue;
		private int mDeep;
		
		public Node(int value, int deep) {
			mValue = value;
			mDeep = deep;
		}
		
		public int getValue() { return mValue; }
		
		public int getDeep() { return mDeep; }
	}
}
