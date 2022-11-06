package com.SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		SinglyLinkedList sll = new SinglyLinkedList(); // creating the instance of SSL class
		
		sll.creatingSinglyLinkedList(4);
//		System.out.println(sll.head.value+" and "+ sll.tail.next); // 4 and null
		
//		sll.insertingValueInLinkedList(7, 1);  
//		System.out.println(sll.head.value); // output-->>4, because value at zero-th index is not change we only add value at first index
											//if we want to print 7 then we have to do this (sll.head.next.value) it give the next value of that index
		sll.insertingValueInLinkedList(7, 1);
		sll.insertingValueInLinkedList(6, 2);
		sll.insertingValueInLinkedList(34, 3);
		sll.insertingValueInLinkedList(89, 4);
		sll.insertingValueInLinkedList(9, 5);
		sll.TraversalInSinglyLinkedList();
//		sll.SearchElementInSSL(3);
		
		sll.deletingNodeInSLL(4); //4 -> 7 -> 6 -> 34 -> 89 -> 9 after 4 -> 7 -> 6 -> 34 -> 9
		
		sll.deletingEntireSLL();
		
		sll.TraversalInSinglyLinkedList();
//		System.out.println(sll.head.next.next.value); // 5
		

	}

}
