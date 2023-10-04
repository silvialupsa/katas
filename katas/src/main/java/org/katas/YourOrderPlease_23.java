package org.katas;
import java.util.*;
public class YourOrderPlease_23 {
    public static void main() {
        order("is2 Thi1s T4est 3a");
        order("4of Fo1r pe6ople g3ood th5e the2");
    }
    public static String order(String words) {
        String[] strings = words.split(" ");
        String[] newString = new String[strings.length];
        for(int i=0; i<strings.length; i++){
            int index = Integer.parseInt(strings[i].replaceAll("[^0-9]", ""))-1;
            newString[index] = strings[i];
        }
        System.out.println(Arrays.toString(newString));
        return String.join(" ", newString);
    }
}
