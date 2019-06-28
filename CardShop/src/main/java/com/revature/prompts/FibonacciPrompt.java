package com.revature.prompts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);

	@Override
	public Prompt run() {
		while (true) {
			System.out.println("Enter the number of fibonacci values you want to see, or q to quit");
			String input = scan.nextLine();
			try {
				
				int value = Integer.valueOf(input);
				System.out.println(getFibonacciValues(value));
				
				
			} catch (NumberFormatException e) {
				if (input.equalsIgnoreCase("q")) {
					return new HomePrompt();
				}
				System.out.println("that is not a valid number, try again");
			}
		}
	}

	private List<Integer> getFibonacciValues(int n) {
		List<Integer> fibonacci = new ArrayList<>();
		if (n <= 0) {
			return fibonacci;
		}
		fibonacci.add(0);
		if (n == 1) {
			return fibonacci;
		}
		fibonacci.add(1);
		if (n == 2) {
			return fibonacci;
		}

		for (int i = 3; i <= n; i++) {
			fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 3));
		}

		return fibonacci;
	}

}
