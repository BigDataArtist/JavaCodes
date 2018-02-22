package interview.java.crack;

import java.util.Arrays;

public class MergeSort {


	public static void mergeSort(int[] mainArray){
		
	  int lenArray = mainArray.length;
	  
	  System.out.println(" length of main array " +lenArray);
	  
	  if( lenArray < 2 ){return;}; // if mainArray doesn't have anything to sort checking the condition
	  
	 int middle = lenArray/2;
	 
	 System.out.println("middle" + middle);
	 int[] leftArray = new int[middle];  
	 int[] rightArray = new int[lenArray-middle]; // this works in the case when we have odd mainArray length
	 
	 
	 //populate the left mainArray
	
	 for(int i = 0 ; i < middle ; i++){
		 leftArray[i] = mainArray[i];
		 System.out.println("leftArray "+leftArray[i]);
	 }
	 
	 
	 // populate the RightArray
	 for( int i = middle ; i < lenArray;i++){
		 rightArray[i-middle] = mainArray[i];
		 
		 System.out.println("right array "+rightArray[i-middle]);
	 }
	 
	 mergeSort(leftArray); // this is being called recursively the left side , divide it properly and then attach back as a sorted one
	 
	 System.out.println(" the left arrays "+Arrays.toString(leftArray));
	 mergeSort(rightArray);
	 
	 System.out.println(" the right array is "+ Arrays.toString(rightArray));
	 merge(leftArray,rightArray,mainArray);
	 
	 
	}
	 // This is for merging back into the bigger array as one both the left and the right array
 public static void merge(int[] L, int[] R , int[] mainArray){
	 
	 System.out.println(" the left array is "+  Arrays.toString(L));
	 int nl = L.length;
	 int nr = R.length;
	 
	 int i = 0;
	 int  j = 0;
	 int k = 0;
	 
	 while(i < nl && j <nr){  // This condition becomes wrong if any of the array runs out of the elements(One becomes false)
		 
		 
		 System.out.println(" compare left "+L[i]+" compare right " + R[j]);
		
		 if( L[i] <= R[j]){ // until element in the left array is less than the element in the right array
		 mainArray[k] = L[i];
		 
		 System.out.println(" main array is mainArray[k] in L[i] " + mainArray[k]);
		    i = i + 1;
		 }
		 
		 else{
			 mainArray[k] = R[j];
			 System.out.println(" main array is mainArray[k] in R[j]  " + mainArray[k]);
			 j = j + 1;
		 }
		 k = k + 1; // this for incrementing in the main array         main array |_|_|_|_| ==k   "https://www.youtube.com/watch?v=sSrmFnNm5lc"
		 }
	 
		// what if the left array ran out of the elements before it is still compared to the right element 
	 
	   while(i<nl){
		   mainArray[k] = L[i];
		   System.out.println(" main array in mainArray[k] in L[i] single " + mainArray[k]);
		   k++;i++;
	   }
	   
	   while(j<nr){
		   mainArray[k] = R[j];
		   
		   System.out.println(" main array in mainArray[k] in R[j] single " + mainArray[k]);
		   k++;j++;
	   }
	   
	}
 
   public static void main(String args[]){
	int[] mergearr = {1,3,5,7,11,42,4,8,9};
	        mergeSort(mergearr);
	        
	        System.out.println(Arrays.toString(mergearr));
	   
	   // mergeSort(new int[]{1,3,5,4,11,9,7,8});
		 
	 }
	 
 }
	 
	
	
	