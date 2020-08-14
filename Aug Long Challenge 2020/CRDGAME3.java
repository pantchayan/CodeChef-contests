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
	        double C = sc.nextDouble();
	        double R = sc.nextDouble();
	        
	        int Cd = 0;
	        int Rd = 0;
	        
	        double tC = C/9.0; 
	        
	        double tR = R/9.0;
	        
	        if((C%9.0)==0.00){
	            Cd = (int)tC;
	        }
	        else{
	            Cd = (int)tC+1;
	        }
	        
	        
	        if((R%9.0)==0.00){
	            Rd = (int)tR;
	        }
	        else{
	            Rd = (int)tR+1;
	        }
	        
	        if(Rd<Cd){
	            System.out.println("1"+" "+Rd);
	        }
	        else if(Rd > Cd){
	            
	            System.out.println("0"+" "+Cd);
	        }
	        else{
	            
	            System.out.println("1"+" "+Rd);
	        }
	        
	    }
	    
	    
	    
		// your code goes here
	}
}
