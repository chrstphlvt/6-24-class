package com.revature.q.matrix;

import java.util.Scanner;


public class MatrixDriver {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		double[][] matrix = new double[4][4];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = Math.round(Math.random() * 100);
				System.out.print(matrix[row][col] + "   ");
			}
			System.out.println();
		}
		while (true) {
			System.out.println("Enter the row number:");
			int row;
			while (true) {
				try {
					row = Integer.valueOf(scan.nextLine());
					break; // exit while loop
				} catch (NumberFormatException e) {
					System.out.println("that is not a valid number, try again");
				}
			}

			System.out.println("Enter the col number:");
			int col;
			while (true) {
				try {
					col = Integer.valueOf(scan.nextLine());
					break; // exit while loop
				} catch (NumberFormatException e) {
					System.out.println("that is not a valid number, try again");
				}
			}

			System.out.printf("value at: (%d,%d) = %f \n", row, col,matrix[row][col]);
		}
	}
}
