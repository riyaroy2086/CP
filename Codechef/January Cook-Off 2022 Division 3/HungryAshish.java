/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner in = new Scanner(System.in);
	    int t= in.nextInt();
	    
	    while(t-- !=0){
	         int x= in.nextInt();
	         int y= in.nextInt();
	         int z= in.nextInt();
	         
	         if(x >= y && x >= z){
	             System.out.println("PIZZA");
	         }
	         else if( x < y && x >= z){
	             System.out.println("BURGER");
	         }
	         else if( x >= y && x < z){
	             System.out.println("PIZZA");
	         }
	         else{
	              System.out.println("NOTHING");
	         }
	         
	         
	    }in.close();
	}
}
