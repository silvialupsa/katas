package org.katas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfDifferencesArray_7 {
    public static void main() {
        sumOfDifferences(new int[]{1, 2, 10});
        sumOfDifferences(new int[]{-3, -2, -1});
    }

    private static int sumOfDifferences(int[] arr) {
        List<Integer> sorted = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .boxed()
                .toList();
        int result = 0;
        for(int i=0; i<sorted.size()-1; i++){
            result += sorted.get(i) - sorted.get(i+1);
        }
        System.out.println(result);
        return result;
    }


}
