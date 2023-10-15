package org.katas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TribonacciSequence_37 {
    public static void main() {
        tribonacci(new double []{1,1,1},1);
        tribonacci(new double []{0,0,1},10);
        tribonacci(new double []{0,1,1},10);
    }

    public static double[] tribonacci(double[] s, int n) {
//        if(n==0){
//            return new double[0];
//        }
//        double[] doubles = new double[n];
//        int j=0;
//        while(j<s.length){
//            doubles[j] = s[j];
//            if(j==n-1){
//                return doubles;
//            }
//            j++;
//        }
//        for(int i=3; i<n;i++){
//            doubles[i] = doubles[i-3]+doubles[i-1]+doubles[i-2];
//        }
//        return doubles;
        double[] tritab=Arrays.copyOf(s, n);
        for(int i=3;i<n;i++){
            tritab[i]=tritab[i-1]+tritab[i-2]+tritab[i-3];
        }
        return tritab;
    }
}
