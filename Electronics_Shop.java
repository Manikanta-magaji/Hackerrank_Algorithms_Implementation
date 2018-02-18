package Implementations;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Electronics_Shop {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        //s-> amt monica has
        // order it in ascending order
        int temp;
        
        for(int i=0 ; i<keyboards.length-1 ; i++) {
            for(int j=0 ; j<keyboards.length-i-1 ; j++)
                if(keyboards[j] > keyboards[j+1]) {
                    temp = keyboards[j];
                    keyboards[j] = keyboards[j+1];
                    keyboards[j+1] = temp;
                }
        }
        for(int i=0 ; i<drives.length-1 ; i++) {
            for(int j=0 ; j<drives.length-i-1 ; j++)
                if(drives[j] > drives[j+1]) {
                    temp = drives[j];
                    drives[j] = drives[j+1];
                    drives[j+1] = temp;
                }
        }
        
        if(keyboards[0] + drives[0] > s)
            return -1;
        else {
            int max = 0;
            for(int i=0 ; i<keyboards.length ; i++) {
                for(int j=0 ; j<drives.length ; j++)
                    if(keyboards[i] + drives[j] > max  &&  keyboards[i] + drives[j] <= s)
                        max = keyboards[i] + drives[j];
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
