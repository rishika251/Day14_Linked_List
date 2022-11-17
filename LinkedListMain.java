package com.bridgelabz.day14;

public class LinkedListMain {
	public static void main(String[] args) {

		LinkedList linkedlist = new LinkedList();

		System.out.println("LINKED LIST");

		linkedlist.addLast(56);
		linkedlist.display();
		linkedlist.addLast(70);
		linkedlist.display();
		linkedlist.insertAtSpecificIndex(1, 30);
		linkedlist.display();
		System.out.println("Searched Element");
		linkedlist.search(30);
		System.out.println("Inserting Element");
		linkedlist.insertAtSpecificIndex(2, 40);
		linkedlist.display();
		linkedlist.deleteAtSpecificIndex(2);
		System.out.println("The Size of the LinkedList is :" +linkedlist.size());
		linkedlist.display();
	}
	
}

