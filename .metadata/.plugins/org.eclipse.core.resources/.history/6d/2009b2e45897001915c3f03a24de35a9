package com.revature.c.flow;

import java.util.Scanner;

public class FlowOfControl {
	public static void main(String[] args) {
//		ifDemo(5);
//		switchDemo(3);

//		System.out.println(average(8, 2, 23));
//		System.out.println(average(17, 97, 500));
//		double result = average(17, 25, 3002);
//		System.out.println(result);

//		forDemo(10);
//		whileDemo();
		doWhileDemo();
	}

	/**
	 * Do-While is similar to while but it checks the condition at the end of the loop instead
	 * of the start.  
	 * 
	 * It means the loop will always execute at least 1 time
	 */
	public static void doWhileDemo() {
		Scanner scan = new Scanner(System.in);
		String input;
		do {
			System.out.println("enter input: ");
			input = scan.nextLine();
		} while(!input.equals("done"));
	}

	public static void whileDemo() {
		Scanner scan = new Scanner(System.in); // used to collect user input
		System.out.println("enter something: ");
		String input = scan.nextLine(); // get user input and store it in a variable

		// loop while user input does not equal done
		while (!input.equals("done")) {
			System.out.println("please try again: ");
			input = scan.nextLine();
		}

		System.out.println("congrats you figured it out");
	}

	/**
	 * This is a for loop example, it will iterate a number of times equal to the
	 * num provided.
	 * 
	 * For loops should be used when you know exactly how many times to iterate
	 * 
	 * @param num times the loop will execute
	 */
	public static void forDemo(int num) {
		for (int i = 0; i < num; i++) {
			// the code contained inside of the for will be repeated until the condition
			// evaluates to false
			System.out.println("iteration i = " + i);
		}
	}

	/**
	 * A method to compute the average of 3 arguments
	 * 
	 * @param one
	 * @param two
	 * @param three
	 * @return the average
	 */
	public static double average(int one, int two, int three) {
		int sum = one + two + three;
		double avg = sum / 3;
		return avg;
	}

	public static void switchDemo(int i) {
		switch (i) {
		case 1:
			System.out.println("case 1 do something");
			break;
		case 2:
			System.out.println("case 2 do something else");
			break;
		case 3:
			System.out.println("case 3 do another thing");
			break;
		default:
			System.out.println("idk what you are asking for");
			break;
		}
	}

	public static void ifDemo(int i) {
		if (i == 5 || i == 3) {
			System.out.println("i is 5 or 3");
		} else if (i > 100) {
			System.out.println(" i is over 100");
		} else {
			System.out.println("i is not 5 or 3 and less than 100");
		}
	}
}
