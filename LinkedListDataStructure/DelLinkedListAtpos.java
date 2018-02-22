package LinkedListDataStructure;

public class DelLinkedListAtpos {

	
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
	
	
	void Delete(int position){
		
		
		if( head == null){
			System.out.println(" There is no head");
			
			return;
		}
		
		
		Node temp = head;
		
		// if head needs to be removed
		if( position == 0){
			
			head = temp.next; // move head
			return;
			
		}
		
		// finding the previous node of the node to be deleted
		for( int i = 0 ; temp != null && i< position-1;i++){
			temp = temp.next;
		}
		
		// if position more than number of nodes
		
		if( temp == null || temp.next == null){
			return;
		}
		
		// we have to delete the node next to temp
		
		Node next = temp.next.next; // here next is null
		
		
		temp.next = next;
		
	}
	
	void printLinList(){
		
		Node n = head; //for traversing and printing
		
		while( n != null){
			
			System.out.println(n.data+" ");
			
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		DelLinkedListAtpos dl = new DelLinkedListAtpos();
		
		for( int i = 0 ; i <6;i++){
			dl.push(i);
		}
	
		 dl.Delete(3);
		dl.printLinList();   
	   
	}
	
}
