/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();
		
		while(t-- >0){
		      long n = sc.nextInt();
		
		      if(n >= 6){
		         System.out.println((n+1)/7);    
		      }
		      else 
		         System.out.println(0);
		         
		}
	}
}
