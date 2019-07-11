package com.revature.prompts;

import java.util.Scanner;

public class HomePrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);

	@Override
	public Prompt run() {
		String input;

		while (true) {
			System.out.println("Enter 1 to view available cards.");
			System.out.println("Enter 2 to sell a card.");
			System.out.println("Enter 3 to purchase a card.");
			System.out.println("Enter 4 to appraise the total value of cards in the shop.");
			System.out.println("Enter 5 to do Fibonacci");
			input = scan.nextLine();
			switch (input) {
			case "1":
				return new ViewCardsPrompt();
			case "2":
				return new SellCardPrompt();
			case "3":
				System.out.println("you bought a card");
				break;
			case "4":
				System.out.println("we have no money");
				break;
			case "5":
				return new FibonacciPrompt();
			default:
				System.out.println("Did not understand that selection, try again");
				break;
			}
		}
	}

}
