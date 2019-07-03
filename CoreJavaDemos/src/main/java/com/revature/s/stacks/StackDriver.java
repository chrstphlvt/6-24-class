package com.revature.s.stacks;

import java.util.Scanner;

public class StackDriver {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		MyStack<String> stringStrack = new MyStack<>();

		while (true) {
			System.out.println("Enter 1 to add an element");
			System.out.println("Enter 2 to peek");
			System.out.println("Enter 3 to pop");
			System.out.println("Enter 4 to print the state of the stack");
			
			String input = scan.nextLine();
			
			switch (input) {
			case "1":
				System.out.println("Enter info to push:");
				String element = scan.nextLine();
				stringStrack.push(element);
				break;
			case "2":
				System.out.println(stringStrack.peek());
				break;
			case "3": 
				System.out.println(stringStrack.pop());
				break;
			case "4":
				System.out.println(stringStrack);
				break;
			default:
				System.out.println("Invalid selection");
				break;
			}
		}
	}
}
