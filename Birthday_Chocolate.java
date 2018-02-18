package Implementations;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Birthday_Chocolate {

    static int solve(int n, int[] s, int d, int m){
        /*  n-> number of squares
            s-> array of values in each square
            d-> date
            m-> month
            m consecutive squares whose integers sum to d
        */
        int result = 0;
    	
        for(int i=0 ; i<s.length-(m-1) ; i++) {
            int sum = 0;
        	for(int j=0 ; j<m ; j++) {
            	sum = sum + s[i+j];
            }
            if(sum == d) 
            	result++;
        }
        return result;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int s[] = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        
        int d = in.nextInt();
        int m = in.nextInt();
        
        int result = solve(n, s, d, m);
        
        System.out.println(result);
    }
}
