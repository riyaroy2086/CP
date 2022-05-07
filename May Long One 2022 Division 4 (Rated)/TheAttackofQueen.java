/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		
		while(t-- > 0){
		        int n = sc.nextInt();
		        int x = sc.nextInt();
	        	int y = sc.nextInt();
	        	
	        	int sum= n-x + n-y + x-1 + y-1 ;
	        	int topL = Math.min(x-1,y-1);
	        	int topR = Math.min(x-1,n-y);
	        	int BottomL = Math.min(n-x,y-1);
	        	int BottomR = Math.min(n-x,n-y);
	        	
	        	
	        	System.out.println(sum + topL + topR + BottomL + BottomR);
	       // 	if(n==1)
	       // 	System.out.println(0);
	        	
	       // 	else if(n % 2 != 0){
	       // 	        if(x == n/2 + 1 && y== n/2 + 1)
        //                         System.out.println(n*n-1);
	        	        
	       // 	        else
	       // 	        System.out.println((n*n)-3);
	        	        
	        	        
	        	        
	       // 	}
	       // 	else if(n % 2 == 0){
	       // 	       System.out.println((n*n)-1); 
	       // 	}
		      //        //  if (x==y && x >= 1 && y >= 1 ){
		                        
		      //        //          System.out.println("YES");
		      //        //  }
		      //        //  else
		      
		      
		                 
		}
	}
}
