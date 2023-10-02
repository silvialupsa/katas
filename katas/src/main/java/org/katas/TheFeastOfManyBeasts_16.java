package org.katas;

public class TheFeastOfManyBeasts_16 {
    public static void main() {
        feast("great blue heron", "garlic nann");
        feast("chickadee", "chocolate cake");
        feast("brown bear", "bear claw");
    }

    public static boolean feast(String beast, String dish) {
        char firstLetterBeast = beast.charAt(0);
        char lastLetterBeast = beast.charAt(beast.length()-1);
        char firstLetterDish = dish.charAt(0);
        char lastLetterDish = dish.charAt(dish.length()-1);
        return firstLetterBeast == firstLetterDish && lastLetterDish == lastLetterBeast;
    }
}
