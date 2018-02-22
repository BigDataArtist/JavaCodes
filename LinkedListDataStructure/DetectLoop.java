package LinkedListDataStructure;

import java.util.HashSet;

import LinkedListDataStructure.FindNthNode.Node;

public class DetectLoop {

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

	void insertNode(Node previous, int new_data) {

		if (previous == null) {
			System.out.println(" it cannot be null");
		}

		Node new_node = new Node(new_data);

		new_node.next = previous.next;

		previous.next = new_node;

	}

	boolean DetectLoop() {

		Node n = head;

		HashSet<Node> hs = new HashSet<Node>();
		while (n != null) {
			// System.out.println(n.data + " ");

			if (hs.contains(n)) {
				return true;
			}

			hs.add(n);

			n = n.next;

		}

		return false;
	}

	public static void main(String args[]) {

		DetectLoop fd = new DetectLoop();

		fd.push(20);
		fd.insertNode(fd.head, 4);
		fd.insertNode(fd.head.next, 25);
		fd.insertNode(fd.head.next.next, 12);
		fd.head.next.next.next.next = fd.head;

		if ((fd.DetectLoop() == true)) {
			System.out.println(" loop found");
		} else {
			System.out.println(" no loop found");
		}

	}
}
