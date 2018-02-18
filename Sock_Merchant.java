package Implementations;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sock_Merchant {

    static int sockMerchant(int n, int[] ar) {
        // n->number of socks
        int pair[] = new int[n];
        int result = 0;
        
        for(int i=0 ; i<n ; i++) {
            for(int j=i+1 ; j<n ; j++) {
                if(ar[i] == ar[j]  &&  pair[i] != 1  &&  pair[j] != 1) {
                    pair[i] = pair[j] = 1;
                    result++;
                }
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
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
