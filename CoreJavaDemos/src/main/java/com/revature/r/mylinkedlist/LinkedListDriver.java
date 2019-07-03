package com.revature.r.mylinkedlist;

import com.revature.d.objects.Ball;

public class LinkedListDriver {
	public static void main(String[] args) {
		
	}
	
	private static void genericLinkedListTest2() {
		GenericLinkedList<Ball> li = new GenericLinkedList<>();
		li.add(new Ball("Red", 5, "Rubber", 8));
	}
	
	private static void genericLinkedListTest() {
		GenericLinkedList<String> li = new GenericLinkedList<>();
		li.add("Hello");
		li.add("World");
		li.add("Test");
		li.add("Another Test");
		li.add("Bubble Sort");
		
		li.add(6, "new node");
		
		for(int i = 0; i < li.size(); i++) {
			System.out.println("element at index: " + i + ", equals: " + li.get(i));
		}
	}
	
	private static void linkedListTest() {
		MyLinkedList li = new MyLinkedList();
		li.add("Hello");
		li.add("World");
		li.add("Test");
		li.add("Another Test");
		li.add("Bubble Sort");
		
		li.add(6, "new node");
		
		for(int i = 0; i < li.size(); i++) {
			System.out.println("element at index: " + i + ", equals: " + li.get(i));
		}
	}
}
