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
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- != 0){
		    int x = in.nextInt();
		    int sum = x*3;
		    int x1 = 0 , x2 = 0 , x3 = 0;
		    
		    if(sum % 2 == 0){
		        x1 = 1;
		        x2 = (sum/2);
		        x3 = (sum/2) - 1;
		    }
		    
		    else{
		        x1 = 1;
		        x2 = (sum/2) + 1;
		        x3 = (sum/2) - 1;
		    }
		    
		    System.out.println(x1 + " " + x2 + " " + x3);
		    
		    
		}	in.close();
		
	}
}