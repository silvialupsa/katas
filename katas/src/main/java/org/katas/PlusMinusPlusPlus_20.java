package org.katas;

public class PlusMinusPlusPlus_20 {
    public static void main() {
        signChange(new int[] {1, 3, 4, 5});
        signChange(new int[] {1, -3, -4, 0, 5});
        signChange(new int[] {});
        signChange(new int[] {-47, 84, -30, -11, -5, 74, 77});
    }
    public static int signChange(int[] arr) {
        int count =0;
        for(int i=1; i< arr.length; i++){
            if(arr[i] < 0 && arr[i-1] >= 0 || arr[i] >= 0 && arr[i-1] < 0){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
