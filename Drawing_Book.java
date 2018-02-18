package Implementations;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Drawing_Book {

    static int solve(int n, int p){
        if((p/2) < (n/2 - p/2)) 
            return (p/2);
        else 
            return (n/2 - p/2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
