package LinkedListDataStructure;

public class ReviseLinkedList {

	Node head;

	static class Node {

		int data;

		Node next;

		Node(int d) {
			data = d;
			next = null;

		}

	}

	void push(int new_data) {

		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	void insertNode(Node Previous_node, int new_data) {

		if (Previous_node == null) {
			System.out.println(" It cannot be null please crearte a head");
		}

		Node new_node = new Node(new_data);

		new_node.next = Previous_node.next;

		Previous_node.next = new_node;

	}

	void insertAfter(int n, int new_data) {
		Node Previous_Node = head;

		for (int i = 0; i < n; i++) {
			Previous_Node = Previous_Node.next;
		}

		insertNode(Previous_Node, new_data);
	}

	// insert the Node at the end of the LinkedList
	void append(int new_data) {

		Node last_node = new Node(new_data);

		// if there is nothing in the linked list then make new node as head
		if (head == null) {
			head = new Node(new_data);
			return;
		}

		last_node.next = null;

		// Else traverse to the last node

		Node current = head;

		while (current.next != null) {
			current = current.next;
		}

		current.next = last_node;

		return;

	}
	
	int FindDataPos(int dataPos){
		
		Node n = head;
		
		int count=0;
		
		while( n != null){
			
			if( count == dataPos){
				return n.data;
			}
			
			count++;
			
			n = n.next;
		}
		
		if( n == null){
			System.out.println(" No element was found in the linke list");
		
		}
		
		return 0;
		
	}


	void DeleteNode(int DataToDelete) {

		Node n = head, prev = null;

		if (n != null && n.data == DataToDelete) {
			head = n.next;

			System.out.println(" The first node was the node to delete");

			return;
		}

		while (n != null && n.data != DataToDelete) {
			prev = n;

			n = n.next;
		}

		if (n == null) {
			System.out.println(" Data was not found in the linked list");
		}

		prev.next = n.next; // so here of prev is 100 and n = 101 and n.next =
							// 102 then prev.next will point to n.next holding
							// the value of node next to n , thus freeing N.
	}

	
	int lengthLl(){
		
		Node n = head;
		int count = 0 ;
		
		while( n != null){
			count++;
			n = n.next;
		}
		
		return count;
		
	}
	
	
	
	
	void printll() {

		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}

	}

	public static void main(String args[]) {

		ReviseLinkedList Rll = new ReviseLinkedList();

		Rll.push(5);
		Rll.push(4);
		Rll.push(3);
		Rll.push(2);
		Rll.push(1);
		
		
		Rll.insertAfter(4, 6); // it will only work if there is a head

	//	Rll.printll();
		
		//Rll.DeleteNode(2);
		
		Rll.printll();
		
		System.out.println(" The length of the linkedlist is "+Rll.lengthLl());
	}
}
