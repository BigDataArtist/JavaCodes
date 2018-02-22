package LinkedListDataStructure;

public class MergeTwoSortedLL {

	static Node head;
	static Node head1;

	class Node {

		int data;
		int data1;
		Node next;

		public Node(int d) {

			data = d;
			next = null;

		}
	}

	void push(int new_data) {

		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;

	}

	void push1(int new_data1) {

		Node new_node1 = new Node(new_data1);

		new_node1.next = head1;

		head1 = new_node1;

	}

	Node Merge(Node p, Node q) {

		Node new_start;

		Node Sort = null;

		if (p == null)
			return q; // Means if there is not data in the linkedlist in either
						// one of them
		if (q == null)
			return p;

		if (p != null && q != null) {

			if (p.data <= q.data) {
				Sort = p;
				p = Sort.next;
			}

			else {
				Sort = q;
				q = Sort.next;
			}

		}

		new_start = Sort;

		while (p != null && q != null) {

			// System.out.println(" P data"+ p.data +" q data" + q.data);
			if (p.data <= q.data) {

				Sort.next = p;

				Sort = p;
				// System.out.println(" SOrt data" + Sort);
				p = Sort.next;
				// System.out.println(" SOrt p" + p);

			} else {

				Sort.next = q;
				Sort = q;
				q = Sort.next;
			}

		}
		if (p == null)
			Sort.next = q;

		if (q == null)
			Sort.next = p;

		return Sort;
	}

	void printll() {

		Node n = Merge(head, head1);
		while (n != null) {
			System.out.println(n.data + " ");

			n = n.next;
		}
	}

	public static void main(String args[]) {
		MergeTwoSortedLL ML = new MergeTwoSortedLL();
		
		Node p = null;Node q = null; 
		
		
		p = head;
		
		q = head1;
		
		ML.Merge(p, q);

		ML.push(100);
		ML.push(80);
		ML.push(60);
		ML.push(50);
		ML.push(30);
		ML.push(10);

		ML.push1(90);
		ML.push1(70);
		ML.push1(65);
		ML.push1(45);
		ML.push1(40);
		ML.push1(20);

		ML.printll();

	}
}
