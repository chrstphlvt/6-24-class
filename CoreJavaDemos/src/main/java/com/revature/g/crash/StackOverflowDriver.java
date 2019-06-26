package com.revature.g.crash;

public class StackOverflowDriver {
	public static void main(String[] args) {
		crash();
	}
	
	private static void crash() {
		crash();
	}
}
