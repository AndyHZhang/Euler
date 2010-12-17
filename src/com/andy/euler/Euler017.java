package com.andy.euler;

public class Euler017 {
	public static void run() {
		System.out.println("Euler017 begin");
		
		int length = 0;
		for (int i = 1; i < 1000; i++) {
			System.out.println(getNumber(i));
			length += getNumber(i).length();
		}
		
		System.out.println(length);

		System.out.println("Euler017 end");
	}

	private static String getNumber(int i) {
		String output = "";

		if (i > 99) {
			output += getSingleNumber(i / 100) + "hundred";
			i %= 100;
			if (i == 0)
				return output;

			//output += " and ";
			output += "and";
		}

		if (i > 19) {
			output += getEntireTenNumber(i / 10 * 10);

			i %= 10;
			if (i == 0)
				return output;
			//output += "-";
			output += "";
		}

		output += getSingleNumber(i);

		return output;
	}

	private static String getSingleNumber(int i) {
		switch (i) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		}

		return null;
	}

	private static String getEntireTenNumber(int i) {
		switch (i) {
		case 20:
			return "twenty";
		case 30:
			return "thirty";
		case 40:
			return "forty";
		case 50:
			return "fifty";
		case 60:
			return "sixty";
		case 70:
			return "seventy";
		case 80:
			return "eighty";
		case 90:
			return "ninety";
		}
		return null;
	}
}
