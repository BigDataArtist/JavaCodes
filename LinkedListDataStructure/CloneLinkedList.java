package LinkedListDataStructure;

import LinkedListDataStructure.ReviseLinkedList.Node;

public class CloneLinkedList {

	Node head;

	static class Node {

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

	void insertNode(Node Previous_node, int new_data) {

		if (Previous_node == null) {
			System.out.println(" It cannot be null please crearte a head");
		}

		Node new_node = new Node(new_data);

		new_node.next = Previous_node.next;

		Previous_node.next = new_node;

	}

	void printll() {

		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}

	}

	public static void main(String[] args) {

		CloneLinkedList Rll = new CloneLinkedList();

		Rll.push(5);
		Rll.push(4);
		Rll.push(3);
		Rll.push(2);
		Rll.push(1);

		Rll.printll();
	}

}
