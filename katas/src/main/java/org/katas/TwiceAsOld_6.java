package org.katas;

//todo: Your function takes two arguments:
//
//current father's age (years)
//current age of his son (years)
//Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old). The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.
public class TwiceAsOld_6 {
    public static void main() {
        System.out.println("Kata 4");
        System.out.println(TwiceAsOld(30,0));
        System.out.println(TwiceAsOld(30,7));
        System.out.println(TwiceAsOld(45,30));
        System.out.println("----------------------");
    }
    public static int TwiceAsOld(int dadYears, int sonYears){
        return Math.abs(dadYears - 2*sonYears);
    }
}
