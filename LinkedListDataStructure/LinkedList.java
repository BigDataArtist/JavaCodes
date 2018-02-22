package LinkedListDataStructure;

public class LinkedList {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	// Insert the node at the starting of the LinkedList
	void push(int new_data) {
		
		// Creating a node and putting the data
		Node new_node = new Node(new_data);

		new_node.next = head; // Making the next of the new node to the head

		head = new_node; // because head is always first
	}

	// Adding the node at the given point after the node
	void insertAfterNode(Node previous_node, int new_data) {

		if (previous_node == null) {
			System.out.println("This should not ne null");
			return;
		}

		Node new_Node = new Node(new_data);

		// As previous node holds the next node address so we have to
		// interchange the addresses
		new_Node.next = previous_node.next;

		// now here next of previous node points to the new address of the
		// inserted node
		previous_node.next = new_Node;

	}

	// Adding a node at the end of the linkedlist
	void append(int new_data) {

		
		if (head == null) { // checking that if list is empty
			head = new Node(new_data);// if list is empty then it returns the
										// new created node as there are no
										// elements in the list and the newly
										// created node at line 52 is the head
										// of the list
			return;
		}
		Node new_last_node = new Node(new_data);

		Node last = head; // here we created a variable pointing towards the head for traversing
		
		while( last.next!=null ){
			last = last.next; // keeps on traversing and assigning the next address until its null
		}
		last.next = new_last_node;
		
		new_last_node.next = null;
		
	}
	void printList() {

		// Created a variable n  always starts traversing from the head till last pointer
		Node n = head;

		while (n != null) {

			System.out.println(n.data + "");
			n = n.next; // keeps on traversing and assigning until its next
		}

	}

	public static void main(String args[]) {

		LinkedList linked = new LinkedList();

		
	//	linked.append(6);

		
		linked.push(7);
		
		
		//linked.push(1);
		
		linked.append(4);
		// This inserts the at the point at the value after 7 
		//1->7->8->6->4
		linked.insertAfterNode(linked.head.next,8);

		linked.printList();
		
	
	}
}



























