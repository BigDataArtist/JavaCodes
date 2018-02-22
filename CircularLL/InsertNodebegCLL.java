package CircularLL;

public class InsertNodebegCLL {

	Node last;
	int length;

	class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;

		}

	}

	InsertNodebegCLL() {
		last = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	void insertFirst(int new_data){

		Node temp = new Node(new_data);
		if (last == null) {

			last = temp;

		}

		else {
			temp.next = last.next; // This is only when we already have a node
									// and we are making a new node temp
		}

		last.next = temp; // this is when there is one node so its last will
							// point to itself
		length++;
	}

	void printll() {

		Node n = last.next;

		while (n != last) {
			System.out.println(n.data + " ");
			n = n.next;
		}

		System.out.println(n.data + " ");

	}

	public static void main(String[] args) {
		InsertNodebegCLL In = new InsertNodebegCLL();

		In.insertFirst(1);
		In.insertFirst(2);
		In.insertFirst(10);
		In.insertFirst(15);
		In.insertFirst(16);
		In.insertFirst(22);

		In.printll();

	}
}
