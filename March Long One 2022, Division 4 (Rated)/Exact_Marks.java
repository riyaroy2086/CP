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
		      int n = sc.nextInt();
		      int x = sc.nextInt();
		      
		      int a = 0, b= 0,c = 0;
		      if(x % 3 == 0 )
		         a = x/3;
		         
		      else if(x % 3 == 1){
		         a = a +(x/3) + 1 ;
		         b = b+2;
		      }
		      
		      else if(x % 3 == 2){
		         a = a +(x/3) + 1 ;
		         b = b+1;
		      }
		      if(a+b <= n){
		           System.out.println("YES"); 
		           System.out.println(a + " " + b +" " + (n-(a+b))); 
		      }else
		            System.out.println("No");
		     
		        
		}
	}
}
