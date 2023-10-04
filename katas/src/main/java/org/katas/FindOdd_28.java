package org.katas;

import java.util.*;

public class FindOdd_28 {
    public static void main() {
        findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});
        findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5});
        findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5});
        findIt(new int[]{10});
        findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1});
        findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10});
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int j : a) {
            if (!integerIntegerMap.containsKey(j)) {
                integerIntegerMap.put(j, 1);
            } else {
                integerIntegerMap.put(j, integerIntegerMap.get(j) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : integerIntegerMap.entrySet()){
            if(entry.getValue() % 2 != 0){
                return entry.getKey();
            }
        }
        return 0;
    }
}
