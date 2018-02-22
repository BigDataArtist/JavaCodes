package interview.java.crack;

public class SeearchAelement {

	
	public static void BinarySearch(int[] arr){
		
	int numToSearch = 4;
   int len = arr.length;
		 
   	int low = 0;
   	int high = len-1;
   	
   	
   	while( low <= high){
   		
   		System.out.println("low is " + low+ " high is" + high);
   		
   		int middle = (low+high)/2;
   		System.out.println(" Middle is " + middle);
   		
   		if( numToSearch == arr[middle]){
   			System.out.println(" The item was found"+ middle);
   			return;

   		}
   		
   		if( numToSearch < arr[middle]){
   			high = middle -1;
   		}
   		
   		if( numToSearch > arr[middle]){
   			low = middle+1;
   		}
   	}
   	System.out.println(" Nothing is found in the search");
	}
	public static void main(String args[]){
		
	int[] arr = {1,2,3,4,5,6,7,8};
	
	        BinarySearch(arr);
	 
	  
	
	
	}
}
