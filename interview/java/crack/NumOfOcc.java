package interview.java.crack;

public class NumOfOcc {

	
	public static int Count(int[] arr,int x,int n){
		
		int i; // to store the returning values of first and last occurance
		int j;
		
		i = first(arr,0,n-1,x,n);
		
		System.out.println(" i is " + i);
		
		if( i == -1){
			return i;
		}
		
		j = last(arr,i,n-1,x,n);
		
		return j-i+1;
	}
	
	
	
	
	public static int first(int[] arr, int low,int high, int x, int n){
		
		System.out.println(" high is" + high + " low is" + low);
		
		if( high >= low){
		
		int mid = (low+ high)/2;
		
		System.out.println(" mid is " + mid);
		System.out.println(" vakue of x " + x);
		
		System.out.println(" value of arr[mid -1] " + arr[mid-1]);
		System.out.println(" value of arr[mid] " + arr[mid]);
		
		if( (mid == 0 || x > arr[mid-1]) && arr[mid] == x ){
			return mid;
		}
			else if (x > arr[mid])
				return first(arr,(mid+1),high,x,n);
			else 
				return first( arr,low,(mid -1),x,n);

		}
		return -1;
	}
	
	
	public static int last(int[] arr, int low,int high, int x, int n){
		
		
		if( high >= low){
			
			System.out.println(" high is " + high + "low is  " + low);
			 
			int mid = (low+high)/2;
			System.out.println(" mid is " + mid);
			System.out.println(" vakue of x " + x);
			
			System.out.println(" value of arr[mid -1] " + arr[mid+1]);
			System.out.println(" value of arr[mid] " + arr[mid]);
			
			if(( mid == n-1 || x < arr[mid + 1]) && arr[mid] == x){
				return mid;
			}
			
			else if( x <  arr[mid]){
				return last(arr,low,(mid-1),x,n);
			}
			else{
				return last(arr,(mid+1),high,x,n);
			}
			
		}
		
		return -1;
	}
	
	
	
	
	public static void main(String args[]){
		
		int arr[] = { 1, 2, 2, 3, 3,4,5,6,7,8,9 };
		
		int n = arr.length;
		
		int x = 3; // Number to find
		
		int c = Count(arr,x,n);
		
		System.out.println(" The occurence of " + x + " is" + c + " times");
		
		
		
	}
}
