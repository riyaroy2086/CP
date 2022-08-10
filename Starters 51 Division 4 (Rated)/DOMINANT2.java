// /* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		int t = sc.nextInt();
// 		for(int k=0;k<t;k++){
// 		    int n = sc.nextInt();
// 		    int a[] = new int[n];
// 		    for(int j=0;j<n;j++){
// 		        a[j]=sc.nextInt();
// 		    }
// 		    int max_count = 0,max_freq=0;
// 		    for(int i=0;i<n;i++){
// 		        int c=0;
// 		        for(int j=0;j<n;j++){
// 		            if(a[i]==a[j]) c++;
// 		        }
// 		        if(c>max_count){
// 		        max_count = c;
// 		        System.out.println("YES");
// 		        }else
// 		        System.out.println("NO");
// 		    }
// 		}
// 	}
// }

import java.util.*;
class Codechef
{

  public static void main (String[] args) throws java.lang.Exception{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while(t-->0){
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();

        for(int i: a){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        ArrayList<int[]> al = new ArrayList<>();

        for(int j : map.keySet()){
            int k = map.get(j);
            al.add(new int[]{j,k});
        }
        Collections.sort(al, (b,d)->d[1]-b[1]);

        if(al.size()==1 || al.get(0)[1] > al.get(1)[1])
             System.out.println("YES");
        else
             System.out.println("NO");
    }

  }

}
