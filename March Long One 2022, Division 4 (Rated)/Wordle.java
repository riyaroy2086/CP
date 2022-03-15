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
		     String S = sc.next();
		     String T = sc.next();
		     
		     String str = "";
		     
		     for(int i = 0 ;i < 5; i++){
		          if(S.charAt(i) == T.charAt(i))
		             str += "G";
		             
		          else
		             str += "B";
		     }
		    
		     System.out.println(str);
		     
		         //System.out.println(0);
		         
		}
	}
}
