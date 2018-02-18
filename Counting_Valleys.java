package Implementations;

import java.io.*;
import java.util.*;

public class Counting_Valleys {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int level = 0;
        int count = 0;
        boolean downFlag = false;
        boolean upFlag = false;
        
        int n = in.nextInt();
        
        String s = in.next();
        
        for(int i=0 ; i<n ; i++) {
        	if(level == -1)
        		downFlag = true;
        	
        	if(s.charAt(i) == 'U')
        		level++;
        	else 
        		level--;
        	
        	if(level == 0  &&  downFlag) {
        		downFlag = false;
        		count++;
        	}
        }
        System.out.println(count);
    }
}