package LinkedListDataStructure;

public class MiddleOfLinkedList {

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
		
		head = new_node;
		
	}
	
	void Middle(){
		
      Node p = head;
      Node q = head;
      
      if( head != null){
      
      while( q != null && q.next != null){
    	  p = p.next;
    	  q = q.next.next;
      }
		System.out.println(" The middle is "+p.data+" ");
		
	}
	}
	
	 void print(){
		 
		 Node n = head;
		 
		 while( n != null){
			 
			 System.out.println(n.data+"");
			 n = n.next;
		 }
	 }
	 
	 public static void main(String args[]){
		 
		 MiddleOfLinkedList md = new  MiddleOfLinkedList();
		 
		for( int i = 8 ; i >0 ; i--){
		 
			md.push(i);
		    md.print();
		
		 System.out.println();
		   md.Middle();
		 
	 }
	 }
}
