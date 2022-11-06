package com.SinglyLinkedList;

public class SinglyLinkedList {
	
	public Node head;  //because both(head and tail) are referring to a NODE
	public Node tail;
	
	public int size; //It give the size of the linkedList
	
	//Creating a SLL 
	public Node creatingSinglyLinkedList(int nodeValue) { // The return type is NODE because it return the head and head is a Node-Type
		
		head = new Node(); //here we are initialize head as a Node
		
		Node node = new Node(); // creating a instance of a Node-Class
		
		node.value = nodeValue;//set value in Node 
		node.next = null; // set node ke next block m null 
		
		head = node;// adding node to head 
		tail = node;// adding node to tail
		
		size = 1;
		
		return head; // return head value 
		
	}
	
	
	// Creating Inserting value in SLL
	public void insertingValueInLinkedList(int nodeValue, int location) { // return type is void because it's not return any value.Now set value and location in Node.
		Node node = new Node(); // Creating s instance of Node class 
		
		node.value = nodeValue; // set value in Node
		
		if(head == null) { // In this case, we don't have a singlyLinkedList , then we call a "creatingSinglyLinkedList"
			creatingSinglyLinkedList(nodeValue); // here we are creating a linkedList
			return; // out from this method;
		}
		else if(location == 0) { 	//set Node at starting point in linkedList
			head = node; // set node with head 
			node.next = head; // here, new created Node ke last block m head(previous value)
		}
		else if(location >= size) {  // set Node a last in linkedList
			
			node.next = null; // here we set Null to the new created node at last
			tail.next = node;  // here we set tail(last node we have) to new created node reference
			tail = node; // here we are changing the tail in linkedList ( assigning new node to last created tail )
		}
		else {
			Node tempNode = head; // here we created a tempNode as TYPE-NODE because head is a node
			
			int index = 0; // creating a index for looping 
			while(index < location - 1) { // here we check if index less than location 
				tempNode = tempNode.next; // then we are changing node next to next until we don't find location of inserting a Node
				index++; 
			}

			Node nextNode = tempNode.next; // here we are creating a new NextNode instance of Node-type for holding tempnext.node ka address
			tempNode.next = node; // here we are set our new "Node"-reference to last linkedlistNode ke reference block m
			node.next = nextNode; // here we are set our new "Node" uske reference block m jo last node bachi hai wo set kr rahe hai
		}
		
		size++; // here we increase the size of the LinkeList by one because we add only one node in it
		
				
	}
	
	// Traversal In singlyLinkedList 
	public void TraversalInSinglyLinkedList () { // it's not return anything 
		
		 if(head == null) {
			 System.out.println("SLL is not exist");
		 }
		 else {
			 Node tempNode = head;
			 for(int i=0; i<size; i++) {
				 System.out.print(tempNode.value);
				 if( i !=size-1 ) {
					 System.out.print(" -> ");
				 }
				 tempNode = tempNode.next;
			 }
		 }
		 System.out.println("\n");
	}

	// Searching element in SSL
	public void SearchElementInSSL(int value) {
			
		if(head != null) {
			Node tempNode = head;
			for(int i=0; i<size; i++) {
				if(tempNode.value == value) {
					System.out.println("Found Node at location at " + i+"\n");
					return;
				}
				tempNode = tempNode.next; //Changing Node 
			}
			System.out.println("Node Not Found");
		}
	}
	
	//Deleting a NOde from a SLL
	
	public void deletingNodeInSLL(int location) {
		
		if(head == null) {
			System.out.println("The SLL is not exist");
			return;
		}
		else if(location == 0) {
			
			head = head.next; //here we are changing the head reference for this node is deleted first Node to it
			size--; // after deleting decrease the size of linked list
			
			if(size == 0) { // here we are check if size is zero it means we had only one Node in it and we already delete this
				tail = null; // and here assigning tail to null means we don't have any another Node
			}
		}
		else if(location >= size ) {
			Node tempNode = head;
			for(int i =0; i<size-1; i++) { // size-1 because we have to deleted last Node from the linked list
				tempNode = tempNode.next;
			}
			if(tempNode == head) { // here we are check if head == tempNode mean's that we had only Node in SLL
				tail=head=null; // and assigning head and tail to null means we have not SLL
				size--; // decrease the size to SLL
				return;
			}
				// here we have More then one element is this list then,
					tempNode.next = null; // then assigning that Node to null means it last block is fill with null 
					tail = tempNode; // and that Node is assign to tail means that Node become last Node
					size--;
		}
		else { // delete Node at a give location
			Node tempNode = head; // create tempNode and assign to null
			for(int i=0; i<location-1; i++) { // looping location se ak phale kyu ke ussse Node ko link krne hai Give node ke next se
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next; // here have get the Node and assigning reference deleted node ka next node ka reference 
			size--;
		}
		
		
	}
	
	
	
	// Deleting Entire SinglyLinkedList
	
	public void deletingEntireSLL() {
		
		head = null;
		tail = null;
		System.out.println("Entire SLL is Deleted");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}


