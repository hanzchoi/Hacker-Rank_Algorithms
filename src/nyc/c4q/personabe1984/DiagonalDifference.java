package nyc.c4q.personabe1984;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        int primDiag = 0, secondDiag = 0;
        //Scanner in = new Scanner(System.in);
        int n = 3;
        //int a[][] = new int[n][n];
        int[][] a = {
                {11,2,4},
                {4,5,6},
                {10,8,-12},
        };

        int length = n-1;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                if(a_i == a_j){
                    primDiag += a[a_i][a_j];
                    System.out.println("prim "+ a[a_i][a_j]);
                }else if(length - a_i == a_j){
                    secondDiag += a[a_i][a_j];
                    System.out.println("second " + a[a_i][a_j]);
                }
            }
        }
        System.out.print(Math.abs(primDiag - secondDiag));

    }
}

