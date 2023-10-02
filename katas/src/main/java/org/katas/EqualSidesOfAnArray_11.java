package org.katas;
import java.util.*;
import java.util.Arrays;

public class EqualSidesOfAnArray_11 {

        public static void main() {
            System.out.println(findEvenIndex(new int[] {1,2,3,4,3,2,1}));
            System.out.println(findEvenIndex(new int[] {1,100,50,-51,1,1}));
        }

        public static int findEvenIndex(int[] arr) {
            int leftSum = 0;
            int rightSum = 0;
            for(int i=0; i<arr.length; i++){
                System.out.println("arr[i]" +arr[i]);
                for(int j=0; j<i; j++){
                    rightSum+=arr[j];
                    System.out.println("rightSum" +rightSum);
                }
                for(int k= arr.length-1; k> i; k--){
                    leftSum+=arr[k];
                    System.out.println("leftSum" +leftSum);
                }
                if(rightSum == leftSum){
                    System.out.println(rightSum);
                    System.out.println(leftSum);
                    System.out.println(i);
                    return i;
                }
                rightSum =0 ;
                leftSum = 0;
            }
            return -1;
        }
}
