package com.revature.p.substring;

public class SubStringDriver {

	public static void main(String[] args) {
		System.out.println(subString("This is my input string", 3, 3));
	}

	private static String subString(String input, int start, int end) {
		String result = "";
		for (int i = start; i < end; i++) {
			result += getCharacter(input, i);
		}
		for (int i = start; i > end; i--) {
			result += getCharacter(input, i);
		}
		return result;
	}

	private static String getCharacter(String input, int index) {
		if (index > input.length() - 1 || index < 0) {
			return "";
		} else {
			return "" + input.charAt(index);
		}
	}

}
