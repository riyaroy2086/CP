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
		      int x = sc.nextInt();
		      int y = sc.nextInt();
		      
		      int count = 0;
		      if(y < x ){
		         if(2*y <= x)
		            System.out.println(x/(2*y));
		         else 
		            System.out.println(0);
		          
		      }
		      else if(y >= x)
		         System.out.println(0);
		         
		}
	}
}
