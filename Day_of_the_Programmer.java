package Implementations;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_of_the_Programmer {

    static String solve(int year){
        int year1918[] = {31, 15, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int nonLeap[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int leap[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0, i;
        String date="";
        
        if(year == 1918) {
        	date = "26.09.1918";
        }
        else if( (year % 400 == 0)  ||  (year % 4 == 0  &&  year % 100 != 0) ) {	//leap year??
        	for( i=0 ; i<12 ; i++) {
        		if(sum < 256) {
        			sum = sum + leap[i];
        		}
        		else break;
        	}
        	sum = sum - leap[i-1];
        	sum = 256 - sum;	// sum has date in integer
        	if(i > 9) {
        		date = Integer.toString(sum)+"."+Integer.toString(i)+"."+Integer.toString(year);
        	}
        	else
        		date = Integer.toString(sum)+".0"+Integer.toString(i)+"."+Integer.toString(year);
        	
        }
        else {		// not a leap year
        	for( i=0 ; i<12 ; i++) {
        		if(sum < 256) {
        			sum = sum + nonLeap[i];
        		}
        		else break;
        	}
        	sum = sum - nonLeap[i-1];
        	sum = 256 - sum;	// sum has date in integer
        	
        	if(i > 9) {
        		date = Integer.toString(sum)+"."+Integer.toString(i)+"."+Integer.toString(year);
        	}
        	else
        		date = Integer.toString(sum)+".0"+Integer.toString(i)+"."+Integer.toString(year);
        }
        
        return date;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
