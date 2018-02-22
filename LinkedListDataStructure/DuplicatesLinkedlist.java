package LinkedListDataStructure;

import LinkedListDataStructure.DelLinkedListAtpos.Node;

public class DuplicatesLinkedlist {

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

	int Duplicates(int Dupnum) {

		Node n = head;
		int count = 0;

		if (n == null) {
			System.out.println(" There is no Node in the LinkedList");
		}

		while (n != null) {

			if (n.data == Dupnum) {
				count++;

			}
			n = n.next;
			// System.out.println(" The Number is" + Dupnum+" "+ count++);

		}
		return count;

	}

	void printLinkedList() {

		Node n = head;

		while (n != null) {

			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String args[]) {

		DuplicatesLinkedlist ele = new DuplicatesLinkedlist();

		ele.push(1);

		ele.push(2);

		ele.push(1);

		ele.push(3);

		ele.push(1);

		ele.printLinkedList();

		System.out.println(" The repition " + ele.Duplicates(1));

	}
}

class FindDupli {

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

	int findDupli(int data) {

		Node n = head;

		if( n == null){
			System.out.println(" there is no Node ");
		}
		
		int count = 0;
		while (n != null) {
			

			if (n.data == data) {
				count++;
			}
			
			
			n = n.next;

		}
		
		return count;

	}

	void printll() {

		Node n = head;

		while (n != null) {

			System.out.println(n.data + " ");

			n = n.next;
		}
	}

	public static void main(String args[]) {

		FindDupli fd = new FindDupli();

		fd.push(1);
		fd.push(3);
		fd.push(2);
		fd.push(5);
		fd.push(1);


		//fd.printll();		
		
		System.out.println(" This data has occured  "+fd.findDupli(1) + " times");
		

		}
	
}
