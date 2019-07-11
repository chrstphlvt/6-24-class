package com.revature.i.reverse;

import java.util.Arrays;

public class ArrayReversal {
	
	public int[] reverse(int[] original) {
		int length = original.length;
		int[] results = new int[length];
		
		for(int i = 0; i < length; i++) {
			results[length - i - 1] = original[i];
		}
		
		return results;
	}
	
	public static void main(String[] args) {
		ArrayReversal ar = new ArrayReversal();
		int[] solved = ar.reverse(new int[] {5,2,3,8,24,1,99});
		System.out.println(Arrays.toString(solved));
	}
	
}
