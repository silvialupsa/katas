package org.katas;

public class PatternGenerator_35 {
    public static void main() {
        patternGenerator(1);
        patternGenerator(2);
        patternGenerator(3);
    }

    public static String patternGenerator(int c) {
        StringBuilder stringBuilder = new StringBuilder();
        if (c < 1) {
            return " ";
        }
        int k=c-1;
        for(int i=0; i<2*c-1; i++){
            if(c%3 == 0){
                stringBuilder.append("x o x ".repeat(c/3));
            }
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}
