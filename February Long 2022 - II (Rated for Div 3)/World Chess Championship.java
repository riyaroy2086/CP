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
            
            int x =sc.nextInt();
            String str = sc.next();
            int countC = 0, countD = 0, countN =0;
            
                char arr[]= str.toCharArray();
                for(char ch:arr){
                    if (ch == 'C')
                        countC = countC +2;
                    else if (ch == 'N')
                        countN=  countN+2; 
                    else{
                        
                         countN++;
                         countC++;
                    }
                }
                
                if(countN < countC)
                    System.out.println(60*x);
                else if(countN > countC)
                    System.out.println(40*x);
                else if(countN == countC) 
                    System.out.println(55*x);
            
        }
        
       
	}
}
