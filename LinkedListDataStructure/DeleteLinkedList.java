package LinkedListDataStructure;

import LinkedListDataStructure.DeletingANode.Node;

public class DeleteLinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}
	}
	// First Inserting the elements in the LinkedList
	void push(int new_data) {

		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}
	
	
	void DeleteLinkList(){
		head = null;
		
		System.out.println(" linked list is deleted");
	}
	
	void printList() {
		Node pr = head;

		while (pr != null) {

			System.out.println(" This data is inserted in " + pr.data + " ");

			pr = pr.next;
		}
	
	
}
	
	public static void main(String args[]){
		
		DeleteLinkedList ele = new DeleteLinkedList();

		ele.push(4);
		
		ele.push(3);
		
		ele.push(1);
		
		ele.printList();
		
		ele.DeleteLinkList();
		
		ele.printList();
	}
	
}


