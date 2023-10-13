package org.katas;

public class FindTheParityOutlier_34 {
    public static void main() {
        find(new int[] {2, 6, 8, -10, 3});
        find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781});
        find(new int[] {Integer.MAX_VALUE, 0, 1});
    }

    static int find(int[] integers) {
        int countOdd = 0;
        int countEven = 0;
        for(int i=0; i< integers.length; i++){
            if(integers[i]%2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        if(countEven == 1){

        }
        return 0;
    }

}
