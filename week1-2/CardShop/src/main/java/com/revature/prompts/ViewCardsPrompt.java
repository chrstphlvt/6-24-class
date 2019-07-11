package com.revature.prompts;

import java.util.List;
import java.util.Scanner;

import com.revature.daos.CardDao;
import com.revature.models.Card;

public class ViewCardsPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);
	private CardDao cardDao = CardDao.currentImplementation;

	@Override
	public Prompt run() {
		String input;
		do {
			System.out.println("Enter 1 to view all cards in the shop.");
			System.out.println("Enter 2 to search cards by game.");
			System.out.println("Enter 3 to search cards by value range.");
			System.out.println("Enter 4 to search cards by name.");
			System.out.println("Enter q to exit back to main menu.");
			input = scan.nextLine();
			switch (input) {
			case "1":
				// get all cards from the dao
				List<Card> cards = cardDao.findAll();
				for (Card c : cards) { // iterate through the set of cards and print each one
					System.out.println(c);
				}
				break;
			case "2":
				System.out.println("Enter the name of the game");
				String gameName = scan.nextLine();
				List<Card> cardsByGame = cardDao.findByGame(gameName);
				for (Card c : cardsByGame) { // iterate through the set of cards and print each one
					System.out.println(c);
				}
				break;
			case "3":
				System.out.println("here are all the most expensive cards");
				break;
			case "4":
				System.out.println("here is the card with that name");
				break;
			default:
				if (!input.equals("q")) {
					System.out.println("did not understand that selection, try again.");
				}
				break;
			}
		} while (!input.equals("q"));
		return new HomePrompt();
	}
}
