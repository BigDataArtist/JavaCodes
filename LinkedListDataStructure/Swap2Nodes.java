package LinkedListDataStructure;

public class Swap2Nodes {

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
	
	void inssertNode(Node previous,int new_data){
		
		if( previous == null){
			System.out.println(" this cant be possible");
		}
		
		Node new_node = new Node(new_data);
		
		new_node.next = previous.next;
		
		previous.next = new_node;	
	}

	Node Swap(Node head) {
		Node p = head;
		
	    head = p.next;
		
		while (p != null) {
			
			Node q = p.next;
			Node temp = q.next; // this is the starting node of the new linked
								// list after swap

			q.next=p;

			if (temp == null || temp.next == null) {
				p.next = temp;

				break;
			}

			p.next = temp.next;

			p = temp;
		}
		return head;

	}

	void printll(Node n) {

		//Node  = head;

		while (n != null) {

			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	void CallSwap(){
	Node n = Swap(head);
	
	printll(n);
	}
	public static void main(String args[]) {

		Swap2Nodes sw = new Swap2Nodes();

		sw.push(1);
		sw.inssertNode(sw.head, 2);
		sw.inssertNode(sw.head.next, 3);
		sw.inssertNode(sw.head.next.next, 4);
		// sw.printll();

		sw.CallSwap();
		//sw.printll();
	}

}

class ReviseSwap {

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

	void swapNodes() {

		Node p = head;
		head = p.next;
		
		while (p != null){

		Node q = p.next;
		Node temp = q.next;
		
		q.next=p;
		
		if(temp == null || temp.next == null){
			p.next = temp;
			break;
		}
		
		p.next = temp.next;
		
		p = temp;
		
	
	}
	}

	void print() {

		Node n = head;
		while (n != null) {

			System.out.println(n.data + " ");

			n = n.next;
		}
	}

	public static void main(String args[]) {

		ReviseSwap rs = new ReviseSwap();

		for (int i = 8; i > 0; i--) {
			rs.push(i);

		}

	
		rs.swapNodes();
		
		rs.print();
		

	}

}


class SwapNodes3{
	
	Node head;
	
	class Node{
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
		head  = new_node;
		
	}
	
	void Swap(){
		
		Node p = head;
		head = p.next.next;
		
		while( p !=null){
			Node q = p.next;
			Node c = q.next;
			Node temp = c.next;
			
			c.next = q;
			q.next = p;
			
			if( temp == null || temp.next == null){
				p.next = temp;
				break;
			}
			
			p.next=temp.next.next;
			
			p = temp;

		}
		
	}

	void print(){
		
		Node n = head;
		
		while(n != null){
			System.out.println(n.data+" ");
			
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		
		
		SwapNodes3 sn = new SwapNodes3();
		
		
		for( int i = 7 ;i > 0 ; i-- ){
			
			sn.push(i);
		}
		//sn.print();
		sn.Swap();
		
		System.out.println();
		
		sn.print();
	}
	
}









