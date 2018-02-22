package LinkedListDataStructure;

public class FindElementLinkedList {

	Node head;
	int count=0;
	int found=0;
	
	class Node{
		int data ;
		Node next;
		
		Node( int d){
			data = d;
		}
		
	}
	void push(int new_data){
		
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;	
	}
	
	void ElementSearch( int element){
		
		Node n = head;
		
		if( n != null && n.data == element){
			
			System.out.println(" element found at first place");
			
			//head = n.next;
			return;
		}
		
		
		// while( n != null && n.data != element);
		while( n != null ){  // can we improve this
			
			count++;
			found++;
			if( n.data == element)
				System.out.println("element found at " + found++ +" "+"place");
			n= n.next;
			
		
			System.out.println(" Still looking in tries  " + count++);
		}
	}
	
	void print(){
		Node n = head;
		
		while( n != null){
			
			System.out.println(n.data+" ");
			n = n.next;
		}
	}

	public static void main(String args[]){
		
		FindElementLinkedList ele = new FindElementLinkedList();
		
		ele.push(4);
		
		ele.push(3);
		
		ele.push(1);
		
		
		
		ele.print();
		
		ele.ElementSearch(3);
			
		
	}
}
