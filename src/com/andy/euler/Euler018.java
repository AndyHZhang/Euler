package com.andy.euler;

public class Euler018 {
	public static void run() {
		System.out.println("Euler018 begin");
		String test = "75 95 64 17 47 82 18 35 87 10 20 04 82 47 65 19 01 23 75 03 34 88 02 77 73 07 63 67 99 65 04 28 06 16 70 92 41 41 26 56 83 40 80 70 33 41 48 72 33 47 32 37 16 94 29 53 71 44 65 25 43 91 52 97 51 14 70 11 33 28 77 73 17 78 39 68 17 57 91 71 52 38 17 14 91 43 58 50 27 29 48 63 66 04 68 89 53 67 30 73 16 69 87 40 31 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

		final int ROW = 15;

		String[] numStr = test.split(" ");
		int[] num = new int[numStr.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(numStr[i]);
		}
		
		for (int i = 1, j = 1; i < ROW; i++) {
			String output = "";
			
			num[j] += num[j-i];
			output += num[j] + " ";
			j++;
			
			for (int k = 0; k < i - 1; k++) {
				num[j] += ((num[j-i-1] > num[j-i]) ? num[j-i-1] : num[j-i]);
				output += num[j] + " ";
				j++;
			}
			
			num[j] += num[j-i-1];
			output += num[j] + " ";
			j++;
			
			//System.out.println(output);
		}

		// find max in last row
		int max = 0;
		for (int i = ROW * (ROW - 1) / 2; i < num.length; i++) {
			if (max < num[i])
				max = num[i];
		}
		System.out.println(max);

		System.out.println("Euler018 end");
	}
}
