package com.java.src;

public class LinkedList {
	
	Node head;
		
	LinkedList(){
		this.head = null;
	}

	LinkedList(Node head){
		this.head = head;
	}
	
	public void addLast(int tailData) {
		Node tail = new Node(tailData);
		Node temp = this.head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = tail;
	}
	
	//head 갈아끼우기
	public void addFirst(int headData) {
		Node toBeHead = new Node(headData);
		toBeHead.next = this.head;
		this.head = toBeHead;
	}
	
	//마지막 삭제
	public void delLast() {
		Node temp;
		Node temp2 = new Node();
		
		temp = this.head;
		while (temp.next!=null) {

			
			temp2 = temp;
			
			temp = temp.next;
		}
		temp2.next=null;
		
	}
	
	//중간 노드 넣기
	public void addMiddle() {
		
	}
	
	//중간 노드 삭제
	public void delMiddle() {
		
	}
	
		
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		Node temp = this.head;
		sb.append("[");
		while(temp.next!=null) {
			sb.append(temp.data);
			sb.append(", ");
			temp = temp.next;
		}
		sb.append(temp.data);
		sb.append("]");
		
		return sb.toString();
		
	}
	
}

class Node{
	int data;
	Node next;

	Node() {
		this.next=null;
	}
	
	Node(int data) {
		this.data=data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
