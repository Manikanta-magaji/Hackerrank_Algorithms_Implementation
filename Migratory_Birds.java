package Implementations;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Migratory_Birds {

    static int migratoryBirds(int n, int[] ar) {
        int result=0;
		int count[] = new int[6];
		
		for(int i=0 ; i<n ; i++) {
			switch(ar[i]) {
			case 1:	count[1]++;
					break;
					
			case 2:	count[2]++;
					break;
			
			case 3:	count[3]++;
					break;
					
			case 4:	count[4]++;
					break;
					
			case 5:	count[5]++;
					break;
					
			}
		}
		
		int max = count[1];
		for(int i=2 ; i<=5 ; i++) {
			if(max < count[i]) {
				max = count[i];
				result = i;
			}
		}
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
