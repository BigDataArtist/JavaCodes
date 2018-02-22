package CircularLL;

import java.io.IOException;

public class AppendNodeCLL {

	Node last;
	int length;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public AppendNodeCLL() {
		last = null;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	void NodeAppend(int new_data) {

		Node temp = new Node(new_data);

		if (last == null) {
			last = temp;

			last.next = last;
		}

		else {

			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}

	void printll() {

		Node n = last.next;

		while (n != last) {
			System.out.println(n.data + "");
			n = n.next;
		}

		System.out.println(n.data);

	}

	public static void main(String[] args) {

		AppendNodeCLL ap = new AppendNodeCLL();

		ap.NodeAppend(10);
		ap.NodeAppend(11);
		ap.NodeAppend(12);
		ap.NodeAppend(13);

		ap.printll();

	}
}
