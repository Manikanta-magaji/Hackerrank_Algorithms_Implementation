package Implementations;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        String a="";
        if(v2 > v1)
            a = "NO";
        else {
            while(x1 < x2) {
                x1 = x1 = v1;
                x2 = x2 + v2;
                
                if(x1 == x2) {
                    a = "YES";
                }
                if(x1 > x2) {
                    a = "NO";
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
