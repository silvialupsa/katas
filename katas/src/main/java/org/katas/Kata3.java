package org.katas;


import java.util.Arrays;
import java.util.Comparator;

//todo:Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.

//        Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:
//
//        [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
//        7      6      5      4      3            2      1
//        If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.
//
//        Note: there will always be exactly one wolf in the array.
//
//        Examples
//        Input: ["sheep", "sheep", "sheep", "wolf", "sheep"]
//        Output: "Oi! Sheep number 1! You are about to be eaten by a wolf!"
//
//        Input: ["sheep", "sheep", "wolf"]
//        Output: "Pls go away and stop eating my sheep"
public class Kata3 {
    public static void main() {
        System.out.println("Kata 3");
        warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"});
        warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"});
        warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"});
        warnTheSheep(new String[]{"sheep", "sheep", "wolf"});
        System.out.println("----------------------");
    }


    public static String warnTheSheep(String[] array) {
        int index = array.length - Arrays.asList(array).indexOf("wolf");
        String string;
        switch (index) {
            case 1:
                string = "Pls go away and stop eating my sheep";
                break;
            default:
                string = "Oi! Sheep number " + (index - 1) + "! You are about to be eaten by a wolf!";
        }
        System.out.println(string);
        return string;
    }
}
