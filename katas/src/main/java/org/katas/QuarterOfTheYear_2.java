package org.katas;

//todo: Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
//
//For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.
//
//Constraint:
//
//1 <= month <= 12
public class QuarterOfTheYear_2 {
    public static void main() {
        System.out.println("Kata 2");
        int result1Kata2 = quarterOf(8);
        int result2Kata2 = quarterOf(3);
        int result3Kata2 = quarterOf(12);
        System.out.println(result1Kata2);
        System.out.println(result2Kata2);
        System.out.println(result3Kata2);
        System.out.println("----------------------");
    }

    public static int quarterOf(int month) {
        return (int) Math.ceil((double) month/3);
    }
}
