package com.revature.m.recursion;

public class RecursionDriver {
	public static void main(String[] args) {
		System.out.println(fibRecursive(6));
	}

	private static Long fibRecursive(int n) {
		if (n <= 1) {
			return 0l;
		} else if (n == 2) {
			return 1l;
		} else {
			return fibRecursive(n - 1) + fibRecursive(n - 2);
		}
	}
}
