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
	    
	    int T = 0;
	    if(sc.hasNextInt()){
	        T = sc.nextInt();
	    }
	    
	    while(T-->0){
	      int H = sc.nextInt();
	      int P = sc.nextInt();
	      
	      while(H>0 && P>0){
	          H = H-P;
	          P = P/2;
	          
	          //System.out.print(H +" "+ P + "\n");
	      }
	      if(H<=0){
	          System.out.println("1");
	      }
	      else{
	          System.out.println("0");
	      }
	    
	        
	    }
	    
	    
	    
		// your code goes here
	}
}
