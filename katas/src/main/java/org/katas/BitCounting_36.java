package org.katas;

public class BitCounting_36 {
    public static void main() {

    }

    public static int countBits(int n){
        int sum=0;
        while(n>1){
            if (n % 2 == 1) {
                sum++;
            }
            n=n/2;
        }
        return sum;
    }

}
