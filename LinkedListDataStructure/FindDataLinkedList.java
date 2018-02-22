package LinkedListDataStructure;

public class FindDataLinkedList {

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

	int NthNode(int position) {

		Node n = head;

		int count = 0;

		while (n != null) {

			if (count == position) {
				return n.data;
			}
			count++;

			n = n.next;

		}

		if (n == null) {
			System.out.println(" No element is found in the linked list");
		}
		return 0;
	}

	void printlist() {

		Node n = head;

		while (n != null) {

			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String args[]) {

		FindDataLinkedList ll = new FindDataLinkedList();

		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);

		ll.printlist();

		System.out.println(" element at index " + ll.NthNode(2));

	}

}

