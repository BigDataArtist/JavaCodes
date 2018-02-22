package LinkedListDataStructure;

import LinkedListDataStructure.Swap2Nodes.Node;

public class Swap3Nodes {

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

	void Swap3Nodes() {

		Node p = head;
		head = p.next.next;

		while (p != null) {

			Node q = p.next;

			Node r = q.next;

			Node temp = r.next;

			r.next = q;

			q.next = p;

			if (temp == null || temp.next == null) {
				p.next = temp;
				break;
			}

			p.next = temp.next.next;

			p = temp;

		}

	}

	void printll() {

		Node n = head;

		while (n != null) {

			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String args[]) {

		Swap3Nodes sn = new Swap3Nodes();

		for (int i = 12; i > 0; i--) {
			sn.push(i);
		}

		System.out.println(" before swapping ");
		sn.printll();

		System.out.println(" after swapping");

		sn.Swap3Nodes();

		sn.printll();

	}
}

class SwapThreeNodes {

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

	void Swap3() {

		Node p = head;

		head = p.next.next;

		while (p != null) {

			Node q = p.next;

			Node c = q.next;

			Node temp = c.next;

			c.next = q;

			q.next = p;

			if (temp == null || temp.next != null) {
				p.next = temp;
				break;
			}

			p.next = temp.next.next;

			p = temp;

		}
	}

	void printll() {
		Node n = head;

		while (n != null) {

			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String args[]) {

		SwapThreeNodes s3 = new SwapThreeNodes();

		s3.push(1);
		s3.push(2);
		s3.push(3);
		s3.push(4);
		s3.push(5);
		s3.push(6);
		s3.push(7);
		s3.push(8);
		s3.push(9);

		// s3.printll();

		s3.Swap3();

		s3.printll();
	}
}
