
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefandLockoutDraws
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner in =  new Scanner(System.in);
	  
	  int t = in.nextInt();
	  while(t-- != 0){
	      int a = in.nextInt();
	      int b = in.nextInt();
	      int c = in.nextInt();
	      
	      if(a+b == c || b+c == a|| c+a == b)
	         System.out.println("YES");
	      else{
	          System.out.println("NO");
	      }      
	  }in.close();
	}
}
