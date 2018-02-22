package LinkedListDataStructure;

public class DeletingANode {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}
	}
	// First Inserting the elements in the LinkedList
	void push(int new_data) {

		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	void InsertAfter(Node previous_node, int new_data) {

		if (previous_node == null) {
			System.out.println("this node cannot be null");
			return;
		}

		Node new_node = new Node(new_data);

		new_node.next = previous_node.next;

		previous_node.next = new_node;

	}
	  // n = 2 new_data = 4
	void insertnextReplace(int n , int new_data){
		Node previous_node = head;
		
		for( int i = 0 ; i < n  ; i ++){
			previous_node = previous_node.next;
		}
		InsertAfter(previous_node,new_data);
	}

	void DeleteNode(int DataValue) {
		
		Node n = head, prev = null;

		if (n != null && n.data == DataValue) {
			head = n.next; // as the head will be the position so we have to
							// make a new head which holds the next of next node
			
			System.out.println("delete this");
			return;
		}

		while (n != null && n.data != DataValue) {

			prev = n; // the current position of the n node is in previous node
						// now
						// which is neither null nor doesn't have the key
						// and n moves to next node in the search of position

			n = n.next;
		}

		if (n == null){
			
			System.out.println(" no key is found");
			return; // means key not found in the list
		}
		prev.next = n.next; // prev.next holds the address of the node next to n
							// node thus freeing the N
	}

	void printList() {
		Node pr = head;

		while (pr != null) {

			System.out.println(" This data is inserted in" + pr.data + " ");

			pr = pr.next;
		}
	}

	public static void main(String args[]) {

		DeletingANode insertt = new DeletingANode();

	    insertt.push(1); //--> creating head
		insertt.insertnextReplace(0,4); // bcz the insertt.head, as 1 is
												// the head so cant be next
		insertt.insertnextReplace(1, 3);
		insertt.insertnextReplace(2, 6);
		insertt.insertnextReplace(3, 5);
		
		insertt.DeleteNode(6);
		insertt.printList();
	}
}