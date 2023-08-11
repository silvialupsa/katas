package org.katas;

public class Kata2 {
    public static void main() {
        int result1Kata2 = quarterOf(8);
        int result2Kata2 = quarterOf(3);
        int result3Kata2 = quarterOf(12);
        System.out.println(result1Kata2);
        System.out.println(result2Kata2);
        System.out.println(result3Kata2);
    }

    public static int quarterOf(int month) {
        double nume = (double) month/3;
        return (int) Math.ceil(nume);
    }
}
