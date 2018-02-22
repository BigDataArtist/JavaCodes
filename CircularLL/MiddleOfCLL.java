package CircularLL;

public class MiddleOfCLL {

	static Node head, head1, head2;

	static class Node { // these classes have to be static so we an use it to
						// make new Node

		int data;

		Node next, prev;

		Node(int d) {
			data = d;
			next = prev = null;
		}
	}

	void spiltList() {
		Node slow_ptr = head;
		Node fast_ptr = head;

		if (head == null)
			return;

		while (fast_ptr.next != head && fast_ptr.next.next != head) {
			fast_ptr = fast_ptr.next.next;

			slow_ptr = slow_ptr.next;
		}

		if (fast_ptr.next.next == head) { // if there is only 2 nodes in the
											// linkedlist
			fast_ptr = fast_ptr.next;
		}

		head1 = head; // set the head pointer of first half

		if (head.next != head)
			head2 = slow_ptr.next; // to hold the address of the other half list

		fast_ptr.next = slow_ptr.next;

		slow_ptr.next = head;

	}


	void printll(Node node) {

		Node n = node; // when we pass argument we don't need this statement

		if (node != null) {
			do {
				System.out.println(n.data + " ");
				n = n.next;
			} while (n != node);
		}

	}

	public static void main(String[] args) {

		MiddleOfCLL MC = new MiddleOfCLL();

		MC.head = new Node(12);
		MC.head.next = new Node(56);
		MC.head.next.next = new Node(11);
		MC.head.next.next.next = new Node(13);
		MC.head.next.next.next.next = MC.head;

		MC.printll(head);

		MC.spiltList();
		System.out.println("");
		System.out.println("First Circular List ");
		MC.printll(head1);
		System.out.println("");
		System.out.println("Second Circular List ");
		MC.printll(head2);
	}
}
