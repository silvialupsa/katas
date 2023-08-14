package org.katas;

import java.util.Arrays;

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
