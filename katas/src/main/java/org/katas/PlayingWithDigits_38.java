package org.katas;

import java.util.Arrays;
import java.util.List;

public class PlayingWithDigits_38 {
    public static void main() {
        digPow(89, 1);
        digPow(92, 1);
        digPow(46288, 3);
    }

    public static long digPow(int n, int p) {
        List<Integer> integerList = Arrays.asList(String.valueOf(n).split("")).stream()
                .map(Integer::valueOf).toList();
        final int[] k = {0};
        System.out.println("integer list: " + integerList);
        long sum = integerList.stream().mapToLong(el -> {long result =  (long) Math.pow(el, k[0] +p);
        k[0]++;
        return result;})
                .peek(System.out::println)
                .sum();
        System.out.println("sum: "+sum);
        System.out.println(sum%n == 0);
        System.out.println(sum/n);
        return sum%n == 0 ? sum/n : -1;
    }
}
