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
		// your code goes here
		
		int T = 0;
		if(sc.hasNextInt()){
		    T = sc.nextInt();
		}
		
		
		
		while(T-->0){
		    int N = sc.nextInt();
		    
		    int count = 0;
		    int[] arr = new int[N];
		    
		    for(int i=0;i<N;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    for(int j=0;j<N;j++){
		        for(int i=0;i<j;i++){
		            int B = (arr[i] & arr[j]);
		            if(B==arr[i]){
		                count++;
		            }
		        }
		    }
		    
		    System.out.println(count);
		    
		    
		}
	}
}
