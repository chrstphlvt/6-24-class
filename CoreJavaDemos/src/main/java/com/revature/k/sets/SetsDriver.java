package com.revature.k.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDriver {
	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(10);
		numbers.add(9);
		numbers.add(40000);
		numbers.add(0);
		numbers.add(-20);
		numbers.add(64);
		numbers.add(64);

		System.out.println(numbers);

		System.out.println(numbers.contains(64));

		Set<String> names = new HashSet<>();
		names.add("Phong");
		names.add("Bre");
		names.add("Stefan");
		names.add("Edward");
		names.add("Matt");
		names.add("Michael");
		names.add("Mike");
		names.add("Chris");
		names.add("Chris");
		names.add("chris");
		names.add("Brenton");
		names.add("Joaquin");

		System.out.println(names);

		for (String name : names) {
			System.out.println(name);
		}
	}
}
