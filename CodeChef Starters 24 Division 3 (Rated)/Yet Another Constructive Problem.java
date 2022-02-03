/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in  = new Scanner(System.in);
        int t = in.nextInt();
       
        while(t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int p = in.nextInt();
            int q = in.nextInt();
            int r = in.nextInt();
            
            int half = (p+q+r)/2;
            if(p+b+c > half || a+q+c > half ||  a+b+r > half)
              System.out.println("YES");
            else
              System.out.println("NO");
        }       
    }
}