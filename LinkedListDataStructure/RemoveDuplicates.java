package LinkedListDataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {

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

	void Duplicate() {

		Node n = head;

		HashSet<Integer> Dupli = new HashSet<Integer>();

		HashSet<Integer> original = new HashSet<Integer>();

		while (n != null) {

			if (!original.contains(n.data)) {
				original.add(n.data);
			}

			else {
				Dupli.add(n.data);
			}
			
			n = n.next;

		}

		Iterator<Integer> itr = original.iterator();

		System.out.println(" original data");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}


	public static void main(String[] args) {

		RemoveDuplicates RD = new RemoveDuplicates();

		RD.push(1);
		RD.insertAfter(RD.head, 2);
		RD.insertAfter(RD.head.next, 3);
		RD.insertAfter(RD.head.next.next, 4);
		RD.insertAfter(RD.head.next.next.next, 2);

		// RD.Printll();

		RD.Duplicate();
	}
}
