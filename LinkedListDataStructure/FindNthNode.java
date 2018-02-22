package LinkedListDataStructure;

import LinkedListDataStructure.FindNthNode.Node;

class FindNthNode {

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

	void NthNode(int n) {

		int len = 0;

		Node trav = head;

		while (trav != null) {
			len++;

			trav = trav.next;
		}

		System.out.println(" length is " + len);

		if (len < n) {
			return;
		}

		trav = head;

		System.out.println(" the (len -n +1) is"  + (len-n +1));
		for (int i = 1; i < len - n + 1; i++) {
			
			System.out.println(" the i value is upto "  + i);
			System.out.println(" trav.data " + trav.data);
			trav = trav.next;
			
			System.out.println(" trav.data after " + trav.data);
		
		}

		System.out.println(trav.data);

	}

	void printll() {
		Node n = head;

		while (n != null) {
			System.out.println(n.data + " ");

			n = n.next;
		}
	}

	public static void main(String args[]) {

		FindNthNode fn = new FindNthNode();

		fn.push(1);
		fn.push(3);
		fn.push(5);
		fn.push(6);
		fn.push(2);
		fn.push(4);

		fn.printll();

		fn.NthNode(5);
	}
}
