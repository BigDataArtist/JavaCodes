package interview.java.crack;

import java.util.HashMap;

public class FindSumInRotated {
	
	public static void main(String args[]){
		
		int[] arrs = {11, 15, 6, 8, 9, 10};
		
		int target = 16;
		
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	
	for( int i = 0 ; i < arrs.length;i++){
	
		hm.put(arrs[i], 0);
	
	}
	for( int i = 0 ; i < arrs.length;i++){
		
		if(hm.containsKey(target - arrs[i])){
			
			System.out.println(hm.get(target-arrs[i]));
		}
	}

	}
}
