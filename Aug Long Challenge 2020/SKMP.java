
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
		// your code goes here
		
		while(T-->0){
		    String S = sc.next();
		    String P = sc.next();
		    
		    if(S.length()==P.length()){
		        System.out.println(P);
		    }
		    else{
		    int[] count = new int[26];
		    
		    for(int i=0;i<S.length();i++){
		        int char1 = S.charAt(i);
		        count[char1-97]++;
		    }
		    
		     for(int i=0;i<P.length();i++){
		        int char1 = P.charAt(i);
		        count[char1-97]--;
		    }
		    
		    int AsciiF = P.charAt(0);
		    
		    int startIdx = AsciiF - 97;
		    
		    
		    int AsciiF2 = -1;
		    
		    for(int i=1;i<P.length();i++){
		        int char1 = P.charAt(i);
		        if(AsciiF!=char1){
		            AsciiF2 = char1;
		            break;
		        }
		    }
		    
		    
		    
		    
		    int secondIdx = AsciiF2-97;
		    
		    
		    
		    if(secondIdx < startIdx && (P.length()!=1)){
		        
		    String ans = "";
		    
		    for(int i=0;i<startIdx;i++){
		        int num = count[i];
		        char t = (char)(i+97);
		        String temp = "" + t;
		        if(num>0){
		         String repeat =new String(new char[num]).replace("\0", temp);
		            ans = ans +repeat;  
		        }
		   }
		    
		    
		    
		    
		    ans = ans + P;
		    
		    for(int i=startIdx;i<=25;i++){
		        int num = count[i];
		        
		        char t = (char)(i+97);
		        String temp = "" + t; 
		        if(num>0){
		            
		            String repeat = new String(new char[num]).replace("\0", temp);
		            ans = ans +repeat; 
		        }
		    }
		    System.out.println(ans);
		    
		    }
		    else{
		    
		    String ans = "";
		    
		    for(int i=0;i<=startIdx;i++){
		        int num = count[i];
		        char t = (char)(i+97);
		        String temp = "" + t;
		        if(num>0){
		         String repeat =new String(new char[num]).replace("\0", temp);
		            ans = ans +repeat;  
		        }
		   }
		    
		    
		    
		    
		    ans = ans + P;
		    
		    for(int i=startIdx+1;i<=25;i++){
		        int num = count[i];
		        
		        char t = (char)(i+97);
		        String temp = "" + t; 
		        if(num>0){
		            
		            String repeat = new String(new char[num]).replace("\0", temp);
		            ans = ans +repeat; 
		        }
		    }
		    System.out.println(ans);
		    
		    } 
		        
		        
		    }
		}
	}
}
