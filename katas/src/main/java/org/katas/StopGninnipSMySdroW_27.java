package org.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StopGninnipSMySdroW_27 {
    public static void main() {
        spinWords( "Hey fellow warriors" );
        spinWords( "This is a test");
        spinWords( "This is another test" );
        spinWords("Welcome");
    }

    public static String spinWords(String sentence) {
        List<String> myList = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        return myList.stream().map(el -> el.length() >= 5 ?  reverse(el) : el).collect(Collectors.joining(" "));
    }

    private static String reverse(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=string.split("").length-1; i>=0; i--){
            stringBuilder.append(string.split("")[i]);
        }
        return stringBuilder.toString();
    }
}
