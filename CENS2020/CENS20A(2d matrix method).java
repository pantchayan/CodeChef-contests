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
	    
	    int[][] arr = new int[N][M];
	    
	    for(int i=0;i<N;i++){
	       String str = sc.next();  
	       sc.nextLine();
	       
	       for(int j=0;j<M;j++){
	           char c = str.charAt(j);
	           if(j=='1'){
	               arr[i][j] = 1;
	           }
	           else{
	               arr[i][j] = 0;
	           }
	       }
	    }
	    
	    int Q = sc.nextInt();
	    
	    
	    while(Q -- > 0){
	        int x1 = sc.nextInt()-1;
	        int y1 = sc.nextInt()-1;
	        
	        int x2 = sc.nextInt()-1;
	        int y2 = sc.nextInt()-1;
	        
	        for(int i=x1;i<=x2;i++){
	            
	            for(int j=y1;j<=y2;j++){
	                
	                    if(arr[i][j]==1){
	                        arr[i][j] = 0;
	                    }
	                    else{
	                        arr[i][j] = 1;
	                    }
	                }
	            }
	        }
	        for(int i=0;i<N;i++){
	      for(int x:arr[i]){
	          System.out.print(x);
	      }  
	      System.out.println();
	    }
	    
	    }
}

