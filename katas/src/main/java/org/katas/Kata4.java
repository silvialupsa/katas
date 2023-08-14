package org.katas;

import java.util.Arrays;
//todo:
//There are pillars near the road. The distance between the pillars is the same and the width of the pillars is the same. Your function accepts three arguments:
//
//        number of pillars (≥ 1);
//        distance between pillars (10 - 30 meters);
//        width of the pillar (10 - 50 centimeters).
//        Calculate the distance between the first and the last pillar in centimeters (without the width of the first and last pillar).

public class Kata4 {
    public static void main() {
        System.out.println("Kata 4");
        System.out.println(points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
        System.out.println(points(new String[]
                {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));

        System.out.println("----------------------");
    }

    public static int points(String[] games) {
        return Arrays.stream(games).mapToInt(el -> {
            int score1 = Integer.parseInt(el.split(":")[0]);
            int score2 = Integer.parseInt(el.split(":")[1]);
            return score1 > score2 ? 3 : score1 == score2 ? 1 : 0;
        }).sum();
    }
}
