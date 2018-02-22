package CircularLL;

public class insertSortedCLL {

	static Node head;
	static int insertNum = 7;

	static class Node {
		int data;

		Node next;

		Node(int d) {

			data = d;

		}

	}

	static void insertInBetween(Node previous_node,int insertData) {

		
		
	}

	void printll(Node node) {

		Node n = node;

		if (node != null) {

			do {

				System.out.println(n.data + " ");

				if (insertNum < n.data) {
                     insertInBetween(insertNum);
				}
				n = n.next;

			}

			while (n != node);

		}

	}

	public static void main(String[] args) {
		insertSortedCLL ll = new insertSortedCLL();

		ll.head = new Node(4);
		ll.head.next = new Node(5);
		ll.head.next.next = new Node(7);
		ll.head.next.next.next = new Node(8);
		ll.head.next.next.next.next = ll.head;

		ll.printll(head);

	}
}
