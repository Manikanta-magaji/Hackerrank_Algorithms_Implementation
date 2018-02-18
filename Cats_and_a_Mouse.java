package Implementations;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cats_and_a_Mouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int matrix[][] = new int[q][3];
        
        for(int a = 0; a < q; a++){
            matrix[a][0] = in.nextInt();//cat A
            matrix[a][1] = in.nextInt();//cat B
            matrix[a][2] = in.nextInt();//mouse C
        }
        
        for(int a = 0; a < q; a++) {
            if(Math.abs(matrix[a][0]-matrix[a][2]) == Math.abs(matrix[a][1]-matrix[a][2]))
            	System.out.println("Mouse C");
            else if(Math.abs(matrix[a][0]-matrix[a][2]) < Math.abs(matrix[a][1]-matrix[a][2]))
            	System.out.println("Cat A");
            else
            	System.out.println("Cat B");
        }
    }
}
