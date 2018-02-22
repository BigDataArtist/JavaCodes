package LinkedListDataStructure;

// Delete a given key in the linked list at a particular position
public class DeleteKeyAtPos {

	Node head;

	class Node {
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

	void InsertAfter(Node previous_node, int new_data) {

		if (previous_node == null) {
			System.out.println(" node cannot be null");
			return;
		}

		Node new_node = new Node(new_data);

		new_node.next = previous_node.next;

		previous_node.next = new_node;
	}

	void insertPosition(int posi, int new_data) {

		Node previous_node = head;

		for (int i = 0; i < posi; i++) {
			previous_node = previous_node.next;
		}

		InsertAfter(previous_node, new_data);

	}

	void append(int new_data) {

		Node pointer = head;
		if (head == null) {
			head = new Node(new_data);
		}

		Node new_node_last = new Node(new_data);

		while (pointer.next != null) {

			pointer = pointer.next;
		}

		new_node_last.next = null; // this says that the next address of the
									// last node is null

		pointer.next = new_node_last; // stored last node address
	}

	void DeleteNode(int delete_Data) {

		Node n = head,prev = null; // traverse using pointer

		if (n != null && n.data == delete_Data) {
			head = n.next; // as the head will be the position so we have to
							// make a new head which holds the next of next node

			return;
		}
		
		while( n != null && n.data != delete_Data){
			prev = n ;
			
			 n = n.next;
		}
		
		if( n == null){
			
			System.out.println(" no data");
			return;
		}
		prev.next = n.next;
	}

	void printLinkedList() {

		Node n = head;

		while (n != null) {

			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	
	public static void main(String args[]){
		DeleteKeyAtPos dp = new DeleteKeyAtPos();

		dp.push(1);
		dp.append(2);
		dp.append(3);
		dp.push(7);
		dp.insertPosition(0, 5);
		dp.printLinkedList();

	}
}
