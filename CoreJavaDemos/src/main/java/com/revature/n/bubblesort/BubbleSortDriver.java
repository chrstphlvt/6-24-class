package com.revature.n.bubblesort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortDriver {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(7);
		li.add(3);
		li.add(4);
		li.add(65);
		li.add(0);
		li.add(65);
		li.add(7);
		bubbleSortRec(li, 1);
		System.out.println(li);
	}

	private static void bubbleSort(List<Integer> li) {
		boolean done = false;
		int count = 0;
		while (!done) {
			done = true;
			count++;
			for (int i = 0; i < li.size() - count; i++) {
				if (li.get(i) > li.get(i + 1)) {
					// swap values
					int second = li.get(i + 1);
					li.set(i + 1, li.get(i));
					li.set(i, second);
					done = false;
				}
			}
		}
	}

	private static boolean bubbleSortRec(List<Integer> li, int count) {
		boolean swap = bubbleSortRecInner(count, 0, li);
		if (!swap) {
			return true;
		} else {
			return bubbleSortRec(li, count + 1);
		}
	}

	private static boolean bubbleSortRecInner(int count, int index, List<Integer> li) {
		boolean swap = false;
		if (li.get(index) > li.get(index + 1)) {
			// swap values
			int second = li.get(index + 1);
			li.set(index + 1, li.get(index));
			li.set(index, second);
			swap = true;
		}

		if (index == li.size() - count - 1) {
			return swap;
		} else {
			return bubbleSortRecInner(count, index + 1, li) || swap;
		}
	}
}
