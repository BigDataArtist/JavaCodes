package LinkedListDataStructure;

import LinkedListDataStructure.DuplicatesLinkedlist.Node;

public class SwapNodes {

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

	void SwapNodes(int x, int y) {

		if (x == y) {
			return;
		}

		Node prevX = null;
		Node CurrX = head;

		Node PrevY = null;
		Node CurrY = head;

		while (CurrX != null && CurrX.data != x) {

			System.out.println(" CurrX.data " + CurrX.data);

			prevX = CurrX;

			System.out.println(" PrevX.data after " + prevX.data);

			CurrX = CurrX.next;
			System.out.println(" CurrX.data after " + CurrX.data);

		}

		while (CurrY != null && CurrY.data != y) {

			System.out.println(" CurrY.data " + CurrY.data);

			PrevY = CurrY;

			System.out.println(" PrevY.data after " + PrevY.data);
			CurrY = CurrY.next;

			System.out.println(" CurrX.data after " + CurrY.data);
		}

		if (prevX != null) {

			System.out.println(" Curry Is  " + CurrY.data);
			System.out.println(" prevX.next.data before" + prevX.next.data);
			prevX.next = CurrY;

			System.out.println(" prevX.next.data " + prevX.next.data);
		} else {
			head = CurrY;
		}

		if (PrevY != null) {

			System.out.println(" Curry Is  " + CurrX.data);
			System.out.println(" prevX.next.data before " + PrevY.next.data);
			PrevY.next = CurrX;

			System.out.println(" prevX.next.data " + PrevY.next.data);
		}

		else {
			head = CurrX;
		}

		
		

		System.out.println(" CurrX.next.data " + CurrX.next.data);

		Node temp = CurrX.next;

		System.out.println(" temp.data " + temp.data);

		System.out.println(" CurrY.next.data " + CurrY.next.data);
		CurrX.next = CurrY.next;

		CurrY.next = temp;
	}

	void printLinkedList() {

		Node n = head;

		while (n != null) {

			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String args[]) {

		SwapNodes sn = new SwapNodes();

		sn.push(6);
		sn.push(5);
		sn.push(4);
		sn.push(3);
		sn.push(2);
		sn.push(1);

		// sn.printLinkedList();

		sn.SwapNodes(4, 5);

		sn.printLinkedList();

	}
}
