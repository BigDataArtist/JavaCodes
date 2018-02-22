package LinkedListDataStructure;

// Learn recursion as well
// This is iterative method 

public class ReverseLInkedList {

	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			
			next = null;
		}
	}
	
	void push(int new_data){
		
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;
	}
	
	void Reverse(){
		
		Node current = head;
		
		Node prev = null;
		
		Node temp;
		
		while ( current != null){
		
			temp = current.next;
			
			current.next = prev;
			
			prev = current;
			
			current = temp;		
		}
		
		head = prev;
		
	}
	
	void printll(){
		
		Node n = head;
		
		while( n != null){
			
			System.out.println(n.data+" ");
			n = n.next;
		}
	}
	
	
	public static void main(String args[]){
		
		ReverseLInkedList Rv = new ReverseLInkedList();
		
		Rv.push(8);
		Rv.push(7);
		Rv.push(6);
		Rv.push(5);
		Rv.push(4);
		Rv.push(3);
		Rv.push(2);
		Rv.push(1);
		
		Rv.printll();
		
		Rv.Reverse();
		
		System.out.println(" ");
		
		Rv.printll();
		

	}
	
	
}