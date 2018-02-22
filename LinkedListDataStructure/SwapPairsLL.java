package LinkedListDataStructure;

class SwapPairsLL {

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

	void Swap() {

		// first we will assign three nodes

		Node p = head;
		head = p.next; // because the head will swipe so it will leave the first
						// element, so make sure that you set head back to
						// position one from where is started

		while (p != null) {

			Node q = p.next; // this is the starting node of the new linked list
								// after swap
			Node temp = q.next;
			q.next = p;
			// temp.next will be the condition for odd numbers to swipe
			if (temp == null || temp.next == null) {
				p.next = temp;
				break;
			}

			p.next = temp.next;

			// This is starting for the next iteration
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

		SwapPairsLL sw = new SwapPairsLL();

		sw.push(1);
		sw.push(2);
		sw.push(3);
		sw.push(4);
		sw.push(5);
		sw.push(6);

		// sw.printll();

		sw.Swap();
		sw.printll();
	}

}
