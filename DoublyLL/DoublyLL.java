package DoublyLL;

public class DoublyLL {

	static Node head;

	class Node {

		int data;

		Node prev;
		Node next;

		Node(int d) {
			data = d;

			next = null;
			prev = null;

		}

	}

	void push(int new_data) {

		Node new_node = new Node(new_data);

		new_node.next = head;
		new_node.prev = null;

		if (head != null) {
			head.prev = new_node;
		}

		head = new_node;
	}

	void insertAfert(Node previous_node, int new_data) {

		if (previous_node == null) {

			System.out.println(" this cannot be null plz fix this");
		}

		Node new_node = new Node(new_data);

		new_node.next = previous_node.next;

		previous_node.next = new_node;

		new_node.prev = previous_node;

		if (new_node.next != null) {

			new_node.next.prev = new_node;
		}

	}

	void InsertEnd(int new_data) {

		if (head == null) {
			head = new Node(new_data);
		}
		Node last_node = new Node(new_data);

		Node last = head;

		while (last.next != null) {
			last = last.next;
		}

		last.next = last_node;

		last_node.next = null;

		last_node.prev = last;

	}

	void printll(Node node) {

		Node last = null;

		Node n = node;

		System.out.println(" linked list in forward direction");

		while (n != null) {

			System.out.print(n.data + " ");

			last = n;
			n = n.next;

		}

		System.out.println(" ");
		System.out.println(" linked list in the reverse direction");

		while (last != null) { // this will go for previous direction

			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {

		DoublyLL Dl = new DoublyLL();

		Dl.push(1);

		Dl.insertAfert(Dl.head, 2);
		Dl.insertAfert(Dl.head.next, 3);
		Dl.insertAfert(Dl.head.next.next, 4);
		Dl.insertAfert(Dl.head.next.next.next, 5);

		Dl.InsertEnd(6);
		Dl.printll(head);

	}
}
