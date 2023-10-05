package org.katas;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfDuplicates_32 {
    public static void main() {
        duplicateCount("abcde");
        duplicateCount("abcdea");
    }
    public static int duplicateCount(String text) {
        String[] strings = text.toLowerCase().split("");
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        int count=0;
        for(int i=0; i<strings.length; i++){
            if(stringIntegerMap.containsKey(strings[i])){
                stringIntegerMap.put(strings[i], stringIntegerMap.get(strings[i])+1);
            } else {
                stringIntegerMap.put(strings[i], 1);
            }
        }
        for(Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()){
            if(entry.getValue() >=2){
                count ++;
            }
        }
        System.out.println(count);
        return count;
    }
}
