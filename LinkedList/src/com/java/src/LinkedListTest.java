package com.java.src;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(new Node(50));
		
		myLinkedList.addLast(60);
		myLinkedList.addLast(70);
		myLinkedList.addLast(80);
		
		System.out.println(myLinkedList.toString());
		
		myLinkedList.addFirst(40);
		myLinkedList.addFirst(30);
		myLinkedList.addFirst(20);
		
		System.out.println(myLinkedList.toString());
		
		myLinkedList.delLast();
		System.out.println(myLinkedList.toString());
		myLinkedList.delLast();
		System.out.println(myLinkedList.toString());
		myLinkedList.delLast();
		System.out.println(myLinkedList.toString());
		
	}

}
