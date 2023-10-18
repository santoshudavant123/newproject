package day2;
//wap to ask 5 names from user and store them in an array
import java.util.*;
public class StringArray3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		 
		String h[]= new String[5]; // h is declared as array of size 5
		
		System.out.println("enter five names");
		for(int i=0;i<=4;i++)
		{  
			h[i]= s.next();
		}
		
		for(String f: h)
			System.out.print("   "+ f);
		 

}}

