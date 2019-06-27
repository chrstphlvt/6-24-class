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
			input = scan.nextLine();
			switch (input) {
			case "1":
				return new ViewCardsPrompt();
			case "2":
				System.out.println("you sold a card");
				break;
			case "3":
				System.out.println("you bought a card");
				break;
			case "4":
				System.out.println("we have no money");
				break;
			default:
				System.out.println("Did not understand that selection, try again");
				break;
			}
		}
	}

}
