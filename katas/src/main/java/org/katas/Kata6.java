package org.katas;

public class Kata6 {
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
