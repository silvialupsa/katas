package org.katas;

public class FindNearestSquareNumber_17 {
    public static void main() {
        nearestSq(9999);
        nearestSq(1);
        nearestSq(2);
        nearestSq(10);
        nearestSq(111);
    }
    public static int nearestSq(final int n){
        double result = Math.sqrt(n);
        if( ((double) ((int) result +1)) - result >0.5){
            return (int) Math.pow((int) result, 2);
        }
        return (int) Math.pow((int) result +1,2);
    }
}
