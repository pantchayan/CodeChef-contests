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
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int[] arr = new int[n+1];
	        
	        for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	        }
	        
	        int res = 5000;
	        int top = 100;
	        
	        int[][] wed = new int[n+1][n+1];
	        
	        HashMap<Integer, Integer> map = new HashMap<>(); 
	        
	        for(int i=0;i<n;i++){
	            map.clear();
	            for(int j=i;j<n;j++){
	                if(j==0){
	                    wed[i][j] = 0;
	                }
	                else{
	                    wed[i][j] = wed[i][j-1];
	                }
	                if(map.containsKey(arr[j])){
	                    if(map.get(arr[j]) == 1){
	                        wed[i][j] ++ ;
	                    }
	                    wed[i][j]++ ;
	                }
	               if(map.containsKey(arr[j])){
	                 map.replace(arr[j],map.get(arr[j])+1); 
	               }
	               else{
	                   map.put(arr[j],1);
	               }
	            }
	            
	        }
	        
	        int dp[][] = new int[101][1001];
	        for(int i = 1; i < n + 1; i++) {
                dp[1][i] = wed[0][i - 1];
            }
            for(int i = 2; i <= top; i++) {
                dp[i][1] = 0;
            }
            
            for(int i = 2; i <= top; i++) {
            for(int j = 2; j <= n; j++) {
                int effi = 5000;
                for(int x = 1; x < j; x++) {
                    effi = Math.min(effi, dp[i - 1][x] + wed[x][j - 1]);
                }
                dp[i][j] = effi;
            }
        }
        
        for(top = 1; top <= 100; top++) {
            res = Math.min(dp[top][n]+(top*k), res);
        }
            System.out.println(res);
	           
	    }
	}
}
