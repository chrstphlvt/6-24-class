package com.revature.b.variables;

public class Variables {
	public static void main(String[] args) {
		boolean b = false;
		
		byte by = 2;
		char c = 'c';
		short s = 27;
		int i = 42;
		long l = 3000000000l; // l signifies the literal number should be of type long
		float f = 25.2f; // decimal literlas are assumed to be double by default
		double dub = 85.3;
		
		System.out.println("boolean b = " + b);
		System.out.println("byte by = " + by);
		System.out.println("char c = " + c);
		System.out.println("short s = " + s);
		System.out.println("int i = " + i);
		System.out.println("long l = " + l);
		System.out.println("float f = " + f);
		System.out.println("double dub = " + dub);
		
		c = 97;
		System.out.println("char c = 97 = " + c);
		
		
	}
}
