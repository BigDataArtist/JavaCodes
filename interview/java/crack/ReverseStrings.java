package interview.java.crack;

public class ReverseStrings {

	public static void main(String args[]){
		

		String str = "Reverse this string";
		
		String str1 = str;
		
		for(int i = 0 ; i < str.length();i++){
			System.out.print(str.charAt(str.length() -1 -i) + " ");
		}
		
		System.out.println();
		
		String[] breakdown = str1.split(" ");
	
		System.out.println("This is different type Reversing");
		
		int len = breakdown.length;
		for( int i = len-1 ; i >=0;i--){
			System.out.println(breakdown[i]);
			
		}	
		//for(int i = 0 ; i < breakdown.length;i++){
		//	System.out.println(breakdown-1-i);
	//	}
		
	}
}


class MaxArrays{
	
	public static void main(String args[]){
		
		int[] arrays = {9,2,6,8,5,3,7};
		double max = arrays[0]; // first value of the array
		
		for( int i = 0 ; i < arrays.length;i++){
			if(arrays[i]>max){
				max = arrays[i];
			}
		}
		
		System.out.println(max);
	}
	
	
}



