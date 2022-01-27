// Searching-for-an-element-z-in-a-matrix-using-JAVA

import java.util.*;

public class Main{
     

	public static void main(String[] args) {
	     // 2D Array
	     Scanner sc = new Scanner(System.in);
	     int rows = sc.nextInt();
	     int columns = sc.nextInt();
	     
	     int[][] num = new int[rows][columns];
	     
	     for(int i = 0; i<rows;i++) {
	        for(int j = 0; j<columns ;j++) {
	              num[i][j] = sc.nextInt(); 
	           //input
	        }       
	     }
	     
	     int z = sc.nextInt();
	     for(int i = 0; i<rows;i++) {
	         for(int j = 0; j<columns ;j++) {
	              if(num[i][j] == x) {
	                   System.out.print("num found at ("+i+" , "+j+")") ;
	           
	              }
	         
	         }
	     }    
	     
	    
	}
}