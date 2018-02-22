package LinkedListDataStructure;

public class Swap2Node {

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

	void Swap() {

		Node p = head;

		head = p.next;

		while (p != null) {

			Node q = p.next;

			Node temp = q.next;

			q.next = p;

			if (temp == null || temp.next == null) {
				p.next = temp;
				
				break;

			}

			p.next = temp.next;

			p = temp; // to do the iteration again and it will assign the new
						// values of q and temp

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

		Swap2Node sp = new Swap2Node();

		sp.push(1);
		sp.push(2);
		sp.push(3);
		sp.push(4);
		sp.push(5);
		sp.push(6);
		sp.push(7);
		sp.push(8);
		
		//sp.printll();
		
		sp.Swap();
		
		sp.printll();

	}
}
