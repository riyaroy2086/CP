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
		
		while(t-- >0){
		      String str = sc.next();
		      int n  = str.length();
		      int count = 0 , ans = 0;
		      
		      for(int i = 0 ; i< n; i++){
		              if(str.charAt(i) != str.charAt(0) && str.charAt(i) != str.charAt(n-1) )
		               count++;
		               
		              else
		                count = 0;
		                ans = Math.max(ans ,count);
		      }
		      if(ans  == 0)
		        System.out.println(-1);
		      else
		         System.out.println(ans);
		         
		}
	}
}
