package org.katas;

public class Pillars_5 {

    public static void main() {
        System.out.println("Kata 4");
        System.out.println(pillars(1,10,10));
        System.out.println(pillars(2,20,25));
        System.out.println(pillars(11,15,30));
        System.out.println("----------------------");
    }

    public static int pillars(int numPill, int dist, int width){
        return numPill > 1 ? (((numPill-2)*width)+((numPill-1)*dist*100)) : 0;
    }
}
