package org.katas;

public class DoesMyNumberLookBig_36 {
    public static void main() {

    }

    public static boolean isNarcissistic(int number) {
        String[] strings= String.valueOf(number).split("");
        int sum =0;
        for(String string: strings){
            sum+= (int) Math.pow(Integer.valueOf(string), strings.length);
        }
        return sum == number;
    }
}
