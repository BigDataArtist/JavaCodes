package interview.java.crack;

import java.util.Arrays;
import java.util.HashMap;

//time complexity o(n2) 
public class SumOfArrays {

	public static void main(String args[]) {

		int[] arrys = { 1, 2, 3, 4, 5 };

		int target = 6;

		for (int i = 0; i < arrys.length - 1; i++) {
			for (int j = i + 1; j < arrys.length; j++) {

				if (arrys[i] + arrys[j] == target) {

					System.out.println(" the i is " + i + " and j is " + j);

				}

			}
		}

	}

}

class Twosums{  // try for both sorter and unsorted array
	
	public static void main(String args[]){
	
	int[] nums = {1,3,4,2,5,6};
	
	int target = 10;
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		for( int i = 0 ; i < nums.length; i++){
			if( hm.containsKey(target-nums[i])){ 				// It will keep on checking for that value from line 50
				System.out.println(hm.get(target-nums[i])+" the i is " + i );     // x + 1 = 9--> target , the value which is not found is then kept in haspmap.
			
			}														// Revise it , its tricky "https://www.youtube.com/watch?v=31duyrXaE_g"
			
			hm.put(nums[i], i);  // line 50
		}
	}
	}





class Minimum
{
	
	// this only works if the array is rotated and sorted
    static int findMin(int arr[], int low, int high)
    {
    	
    	
    	
   System.out.println(" los is"+ low +" high is " + high);
   
        // This condition is needed to handle the case when array
        // is not rotated at all
        if (high < low)  return arr[0];
        
        
 
        // If there is only one element left
        if (high == low) return arr[low];
 
        // Find mid
        
        
        int mid = (low+high)/2;
        
        System.out.println("mid1 is " + mid);
 
        // Check if element (mid+1) is minimum element. Consider
        // the cases like {3, 4, 5, 1, 2}
        
       System.out.println("arr[mid+1]" + arr[mid+1] +" and arr[mid" + arr[mid]);
        if (mid < high && arr[mid+1] < arr[mid])
            return arr[mid+1];
 
        // Check if mid itself is minimum element
        
       // System.out.println("arr[mid" + arr[mid]+" arr[mid-1]" + arr[mid-1]);
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];
 
        // Decide whether we need to go to left half or right half
        
        System.out.println(arr[high]+" " + arr[mid]);
        if (arr[high] > arr[mid])
            return findMin(arr, low, mid-1);
        return findMin(arr, mid+1, high);
    }
 
    // Driver Program
    public static void main (String[] args)
    {
        int arr1[] =  {5,4,1,2,3};
        int n1 = arr1.length; 
        System.out.println("The minimum element is "+ findMin(arr1, 0, n1-1));

    }
}
