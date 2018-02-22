package LinkedListDataStructure;

public class AddDataLinkedlIst {

	Node head;
	Node head1;

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

	void pushNew(int new_data) {

		Node new_node1 = new Node(new_data);

		new_node1.next = head1;

		head1 = new_node1;

	}

	// Node printll(Node head, Node head1) {
	void printll() {
		Node n = head;
		Node n1 = head1;
		int add1 = 0;
		int add = 0;
		while (n != null || n1 != null) {
			// System.out.print(n.data + " ");

			add = add * 10 + n.data;

			System.out.println(" add is " + add);

			n = n.next;

			if (n1 != null) {

				// System.out.print(n1.data + " ");

				add1 = add1 * 10 + n1.data;

				System.out.println(" add1 is " + add1);

				n1 = n1.next;
			}

		}

		System.out.println(" total sun is " + (add + add1));

	}

	/*
	 * void Call(){
	 * 
	 * Node n = printll(head,head1);
	 * 
	 * 
	 * }
	 */

	public static void main(String args[]) {

		AddDataLinkedlIst AD = new AddDataLinkedlIst();

		AD.push(2);
		AD.push(4);
		AD.push(3);
		AD.pushNew(5);
		AD.pushNew(6);
		AD.pushNew(4);

		AD.printll();

	}
}
