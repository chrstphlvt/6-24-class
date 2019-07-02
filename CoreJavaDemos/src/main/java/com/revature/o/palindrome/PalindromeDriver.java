package com.revature.o.palindrome;

import java.util.ArrayList;
import java.util.List;

public class PalindromeDriver {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("Radar");
		words.add("Java");
		words.add("Racecar");
		words.add("Card");
		words.add("Anna");
		words.add("Bob");
		words.add("Kayak");
		words.add("Algorithm");
		words.add("Big O");
		words.add("I");

		List<String> result = filterPalindromes(words);
		System.out.println(result);
	}

	private static List<String> filterPalindromes(List<String> words) {
		List<String> filtered = new ArrayList<>();
		for (String word : words) {
			if (isPalindrome(word)) {
				filtered.add(word);
			}
		}
		return filtered;
	}

	private static boolean isPalindrome(String word) {
		word = word.toLowerCase();
		for (int i = 0; i < Math.floor(word.length() / 2); i++) {
			char front = word.charAt(i);
			char back = word.charAt(word.length() - i - 1);
			if (front != back) {
				return false;
			}
		}
		return true;
	}

}
