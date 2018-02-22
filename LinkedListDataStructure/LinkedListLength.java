package LinkedListDataStructure;

public class LinkedListLength {

	
	Node head;
	int count =0;
	
	
	
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
	
	 int printData(){
		
		
		Node n = head;
		
		while( n != null){
			
			//System.out.println(n.data+" ");	
			  count++;
			n = n.next;
					
		}	
		
		return count;
	}
	
	public static void main(String args[]){
		
		LinkedListLength ll = new LinkedListLength();
		
		ll.push(1);
		ll.push(3);
		ll.push(1);
		ll.push(2);
		ll.push(1);
		
		System.out.println(ll.printData());
	}
}





class getCountRecursive{
	
	
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
	
	int getCountRec( Node node){
		
		if( node == null)
		{
			return 0;
			}
		
		else{
			  
			return 1 + getCountRec(node.next);
		}
		
	}
	
		public int getCount(){
			
			return getCountRec(head);
		}
				
		
		
		void print(){
			Node n = head;
			
			while(n != null){
				System.out.println(n.data+" ");
				n = n.next;
			}
		}
	public static void main(String args[]){
		
		getCountRecursive count = new getCountRecursive();
		
		count.push(1);
		count.push(2);
		count.push(3);
		count.push(4);
		
    	System.out.println(" get the count" + count.getCount());
		
		count.print();
	}
	
}
