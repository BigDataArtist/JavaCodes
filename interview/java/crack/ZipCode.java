package interview.java.crack;
import java.util.*;

public class ZipCode {
	
	
	public static void main( String args[]){
		
		
		System.out.println(" Enter the number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		 
		 String parse = Integer.toString(num);
		 
		 if( parse.length() <=5 &&  parse.length() >0 ){
			 
			 System.out.println(" The zip code is "+ parse);	
		}
		 
		 else if(parse.length() >5 && parse.length()<=9){
			 
			 switch(parse.length()){
			 case 6:
				 System.out.println(" Zip is" + parse+"-"+"000");
			 break;
			 
			 case 7:
				 System.out.println(" Zip is" + parse+"-"+"00");
				 break;
			 case 8:
				 System.out.println(" Zip is" + parse+"-"+"0");
				 break;
			 case 9:
				 System.out.println(" Zip is" + parse);
				 break;			 
		 }
		 }
		 
		 else{
			 System.out.println(" what the fuck you are typing ma boiiii");
		 }
			
		}
	}


