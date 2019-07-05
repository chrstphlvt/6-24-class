package com.revature.t.tree;

public class TreeDriver {
	public static void main(String[] args) {
		Tree<String> revature = new Tree<>();
		revature.add(null, "Ashwin");
		revature.add("Ashwin", "Ravi");
		revature.add("Ravi", "Steve");
		revature.add("Ravi", "Karan");
		revature.add("Steve", "Blake");
		revature.add("Blake", "Matt");
		revature.add("Blake", "Mike");
		
		revature.add("Steve", "Alex");
		revature.add("Karan", "Dylan");
		revature.add("lsdfjksdl", "lsdkfjsdlk");
		
	}
}
