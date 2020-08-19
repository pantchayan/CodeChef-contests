/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    String[] arr = new String[N];
	    
	    for(int i=0;i<N;i++){
	       arr[i] = sc.next();  
	       sc.nextLine();
	    }
	    
	   // for(int i=0;i<N;i++){
	   //    System.out.println(arr[i]);    
	   // }
	    
	  
	    
	    
	    int Q = sc.nextInt();
	    
	    
	    while(Q -- > 0){
	        int x1 = sc.nextInt()-1;
	        int y1 = sc.nextInt()-1;
	        
	        int x2 = sc.nextInt()-1;
	        int y2 = sc.nextInt()-1;
	        
	        for(int i=x1;i<=x2;i++){
	            for(int j=y1;j<=y2;j++){
	                char p = arr[i].charAt(j);
	                char zero = '0';
	                if(p==zero){
	                    arr[i] = arr[i].substring(0, j) 
              + "1"
              + arr[i].substring(j + 1);
	                    
	                    
	                }
	                else{
	                   arr[i] = arr[i].substring(0, j) 
              + "0"
              + arr[i].substring(j + 1);
	                }
	            }
	        }
	        
	    }
	    
	    for(int i=0;i<N;i++){
	       System.out.println(arr[i]);    
	    }
	    
		// your code goes here
	}
}
