package org.katas;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder_33 {
    public static void main() {
        encode("din");
        encode("recede");
        encode("   ()(   ");
        encode("Prespecialized");
    }

    static String encode(String word){
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        String[] strings =word.toLowerCase().split("");
        for(int i=0; i<strings.length; i++){
            if(stringIntegerMap.containsKey(strings[i])){
                stringIntegerMap.put(strings[i], stringIntegerMap.get(strings[i])+1);
            } else {
                stringIntegerMap.put(strings[i], 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<strings.length; i++){
            if(stringIntegerMap.get(strings[i]) >1 ){
                stringBuilder.append(")");
            } else {
                stringBuilder.append("(");
            }
        }
        String result = stringBuilder.toString();
        System.out.println(result);
        return result;
    }
}
