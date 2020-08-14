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
	        int N = sc.nextInt();
	        double K = sc.nextDouble();
	        
	        //Long[] P = new Long[N];
	        
	         //System.out.println(N);
	        double minStep = K+1;
	        Boolean flag = false;
	        double finalP = 0.00;
	        for(int i=0;i<N;i++){
	            
	            double P = sc.nextDouble();
	            
	            double steps = K/P;
	            
	            double diff = K%P;
	            
	            if(diff == 0.0000000){
	                if(steps<minStep){
	                    finalP = P;
	                    minStep = steps;
	                }
	                flag = true;
	               // System.out.println(steps);
	            }
	             
	            
	        }
	        
	        if(flag){
	            System.out.println(Math.abs((int)finalP));
	        }
	        else{
	             System.out.println("-1");
	        }
	        
	    }
	    
	    
	    
		// your code goes here
	}
}
