package org.katas;

import java.util.Arrays;

public class SplitStrings_24 {

    public static void main() {
        solution("abcdef");
        solution("abc");
    }
    public static String[] solution(String s) {
        String[] stringArray = new String[(int) Math.ceil((double) s.length() /2)];
        if(s.length()%2 != 0){
            s+="_";
        }
        int i=0;
        int j=0;
        while(j< stringArray.length){
            stringArray[j] = s.substring(i, i+2);
            i+=2;
            j+=1;
        }
        return stringArray;
    }
}
