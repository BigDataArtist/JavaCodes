package CircularLL;

public class DeleteDataCLL {

	Node last;

	int length;

	class Node {
		int data;

		Node next;

		Node(int d) {
			data = d;
		}
	}

	DeleteDataCLL() {
		last = null;
		length = 0;

	}

	int length() {
		return length;
	}

	boolean isEmpty() {
		return length == 0;
	}

	void appendData(int new_data) {

		Node new_node = new Node(new_data);
		if (last == null) {

			last = new_node;

			last.next = last;
		}

		else {

			new_node.next = last.next;
			last.next = new_node;
			last = new_node;

		}

		length++;

	}

	void DeleteData(int Delete_Data) {

		System.out.println(" last.next is " + last.data);
		Node n = last.next;
		Node prev = null;

		if (n != last && n.data == Delete_Data) {

			System.out.println(" last.data at 63 " + last.data);
			last.next = n.next; // replaced 4 ka next with 1 ka next

			return;

		}

		while (n != last && n.data != Delete_Data) {

			// System.out.println(" prev.data 83 " + prev.data);

			prev = n; //2

			n = n.next;
		}

		if (n == last) {
			
			System.out.println(" previous.data "  + prev.data);
			last = prev;
		}

		prev.next = n.next;

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
		DeleteDataCLL dl = new DeleteDataCLL();

		dl.appendData(1);
		dl.appendData(2);
		dl.appendData(3);
		dl.appendData(4);

		dl.printll();

		System.out.println(" After deletion");

		dl.DeleteData(4);

		dl.printll();
	}

}
