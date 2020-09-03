package com.java.src;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(new Node(10));
		
		myLinkedList.addLast(20);
		myLinkedList.addLast(30);
		myLinkedList.addLast(40);
		
		System.out.println(myLinkedList.toString());
		
	}

}
