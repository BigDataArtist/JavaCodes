package LinkedListDataStructure;

public class RotateLL {

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

	void insertAfter(Node previous_node, int new_data) {

		if (previous_node == null) {

			System.out.println(" we need previous Node");
		}

		Node new_node = new Node(new_data);

		new_node.next = previous_node.next;

		previous_node.next = new_node;

	}

	void Rotate(int k) {

		{
			if (k == 0)
				return;

			// Let us understand the below code for example k = 4
			// and list = 1->2->3->4
			Node current = head;

			// current will either point to kth or NULL after this
			// loop. current will point to node 2 in the above example
			int count = 1;
			while (count < k && current != null) {

				current = current.next;

				System.out.println(current.data);
				count++;
			}

			// If current is NULL, k is greater than or equal to count
			// of nodes in linked list. Don't change the list in this case
			if (current == null)
				return;

			// current points to kth node. Store it in a variable.
			// kthNode points to node 2 in the above example

			System.out.println(" current.data " + current.data);
			Node kthNode = current;

			// current will point to last node after this loop
			// current will point to node 60 in the above example
			while (current.next != null) {
				System.out.println(" current.data before " + current.data);
				current = current.next;

				System.out.println(" current.data after" + current.data);
			}
			// Change next of last node to previous head
			// Next of 60 is now changed to node 10

			System.out.println("head.data " + head.data);
			current.next = head;
			System.out.println("current.next.data after " + current.next.data);

			// Change head to (k+1)th node
			// head is now changed to node 50
			System.out.println(" Kth Node data  " + kthNode.next.data);
			head = kthNode.next;

			// change next of kth node to null
			kthNode.next = null;

		}
	}

	void Printll() {

		Node n = head;

		while (n != null) {
			System.out.println(n.data + " ");

			n = n.next;
		}

	}

	public static void main(String[] args) {
		RotateLL rl = new RotateLL();

		rl.push(1);
		rl.insertAfter(rl.head, 2);
		rl.insertAfter(rl.head.next, 3);
		rl.insertAfter(rl.head.next.next, 4);

		rl.Rotate(2);

		rl.Printll();
	}
}

class MYrotateLL {

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

	void insertAfter(Node previous_node, int new_data) {

		if (previous_node == null) {

			System.out.println(" we need previous Node");
		}

		Node new_node = new Node(new_data);

		new_node.next = previous_node.next;

		previous_node.next = new_node;

	}

	void rotate(int k) {

		if (k == 0)
			return;

		int count = 1; // to keep the track till where to rotate

		Node current = head;

		while (count < k && current != null) {

			current = current.next;
			count++;
		}
		
		
		Node KthNode = current; // this will be the end
		
		while( current.next != null){
			current = current.next;
		}
		
		current.next = head;
		
		head = KthNode.next;
		
		KthNode.next = null;

	}

	void Printll() {

		Node n = head;

		while (n != null) {
			System.out.println(n.data + " ");

			n = n.next;
		}

	}

	public static void main(String[] args) {
		MYrotateLL rls = new MYrotateLL();

		rls.push(1);
		rls.insertAfter(rls.head, 2);
		rls.insertAfter(rls.head.next, 3);
		rls.insertAfter(rls.head.next.next, 4);
		rls.insertAfter(rls.head.next.next.next, 5);
		rls.insertAfter(rls.head.next.next.next.next, 6);

		rls.rotate(2);

		rls.Printll();
	}
}







