package org.katas;


import java.util.Arrays;
import java.util.Comparator;

//todo:If you've completed this kata already and want a bigger challenge, here's the 3D version
//
//Bob is bored during his physics lessons so he's built himself a toy box to help pass the time. The box is special because it has the ability to change gravity.
//
//There are some columns of toy cubes in the box arranged in a line. The i-th column contains a_i cubes. At first, the gravity in the box is pulling the cubes downwards. When Bob switches the gravity, it begins to pull all the cubes to a certain side of the box, d, which can be either 'L' or 'R' (left or right). Below is an example of what a box of cubes might look like before and after switching gravity.
//
//+---+                                       +---+
//|   |                                       |   |
//+---+                                       +---+
//+---++---+     +---+              +---++---++---+
//|   ||   |     |   |   -->        |   ||   ||   |
//+---++---+     +---+              +---++---++---+
//+---++---++---++---+         +---++---++---++---+
//|   ||   ||   ||   |         |   ||   ||   ||   |
//+---++---++---++---+         +---++---++---++---+
//Given the initial configuration of the cubes in the box, find out how many cubes are in each of the n columns after Bob switches the gravity.
//
//Examples (input -> output:
//* 'R', [3, 2, 1, 2]      ->  [1, 2, 2, 3]
//* 'L', [1, 4, 5, 3, 5 ]  ->  [5, 5, 4, 3, 1]
public class GravityFlip_1 {
    public static void main() {
        System.out.println("Kata 1");
        int[] result1 = GravityFlip_1.flip('R', new int[]{ 3,2,1,2 });
        int[] result2 =  GravityFlip_1.flip('L', new int[]{ 1,4,5,3,5 });

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println("----------------------");
    }
    public static int[] flip(char dir, int[] arr) {
        switch (dir) {
            case 'R' -> Arrays.sort(arr);
            case 'L' -> arr = Arrays.stream(arr)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();

        }
        return arr;
    }

}
