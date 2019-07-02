package com.revature.o.palindrome;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeDriver {
	public static void main(String[] args) {
		List<String> words = new LinkedList<>();
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

		List<String> result = filterPalindromesRecursive(words);
		System.out.println(result);
		
//		System.out.println(words.parallelStream().filter(word -> isPalindrome(word)).collect(Collectors.toList()));
	}

	private static List<String> filterPalindromesRecursive(List<String> words) {
		List<String> l = new LinkedList<>();

		if (isPalindrome(words.get(0))) {
			l.add(words.get(0));
		}

		if (words.size() > 1) {
			words.remove(0);
			l.addAll(filterPalindromesRecursive(words));
		}

		return l;
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
