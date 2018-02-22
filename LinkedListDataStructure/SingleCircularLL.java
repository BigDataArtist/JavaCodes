package LinkedListDataStructure;

public class SingleCircularLL {

	Node last;
	int length;

	int count = 0;

	class Node {

		int data;

		Node next;

		Node(int d) {
			data = d;
		}
	}

	SingleCircularLL() {
		last = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	/* Creating 4 nodes for the linkedlist */

	void createSingleCircularLL() {
		Node first = new Node(1);

		Node second = new Node(4);

		Node third = new Node(7);

		Node fourth = new Node(10);

		Node fifth = new Node(11);

		first.next = second;

		second.next = third;

		third.next = fourth;

		fourth.next = fifth; // this makes it circular

		fifth.next = first;

		last = fifth; // this is to know when we are again traversing;

	}

	public void display() {
		if (last == null) {
			return;
		}

		Node first = last.next;

		while (first != last) { // means while not equals to fifth
			System.out.println(" the count is " + ++count);

			System.out.println(first.data + " ");

			first = first.next;
		}

		System.out.println(first.data + " "); // this is for the last node after
												// which we got our first node
	}

	public static void main(String args[]) {

		SingleCircularLL SL = new SingleCircularLL();

		SL.createSingleCircularLL();
		SL.display();
	}

}
