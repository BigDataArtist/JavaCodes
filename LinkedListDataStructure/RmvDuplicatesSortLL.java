package LinkedListDataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import LinkedListDataStructure.DetectLoop.Node;

public class RmvDuplicatesSortLL {

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

	void insertAfter(Node previous, int new_data) {

		if (previous == null) {
			System.out.println(" this cant be null");
		}

		Node new_node = new Node(new_data);

		new_node.next = previous.next;

		previous.next = new_node;

	}

	void Dupis() {
		Node n = head;

		HashSet<Integer> hm = new HashSet<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		while (n != null) {

			// System.out.println(n.data + " ");

			if (!hm.contains(n.data)) {
				hm.add(n.data);
			}

			else {
				hs.add(n.data);
			}

			n = n.next;

		}

		Iterator<Integer> itr = hm.iterator();
		Iterator<Integer> itr1 = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(" these are the non duplicates" + itr.next());
		}

		System.out.println(" ");

		while (itr1.hasNext()) {
			System.out.println(" These are the duplicates one" + itr1.next());

		}

	}

	public static void main(String args[]) {

		RmvDuplicatesSortLL rm = new RmvDuplicatesSortLL();

		rm.push(1);
		rm.insertAfter(rm.head, 2);
		rm.insertAfter(rm.head.next, 3);
		rm.insertAfter(rm.head.next.next, 4);
		rm.insertAfter(rm.head.next.next.next, 5);
		rm.insertAfter(rm.head.next.next.next.next, 6);
		rm.insertAfter(rm.head.next.next.next.next.next, 3);
		rm.insertAfter(rm.head.next.next.next.next.next.next, 2);

		rm.Dupis();

	}

}
