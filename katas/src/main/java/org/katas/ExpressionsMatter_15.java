package org.katas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpressionsMatter_15 {
    public static void main() {
        System.out.println(expressionsMatter(2, 1, 2));
        System.out.println(expressionsMatter(1, 1, 1));
        System.out.println(expressionsMatter(2, 1, 1));
        System.out.println(expressionsMatter(2, 10, 3));
    }

    public static int expressionsMatter(int a, int b, int c) {
        List<Integer> results = new ArrayList<>();
        results.add(a * (b + c));
        results.add((a + b) * c);
        results.add(a * b * c);
        results.add(a + b * c);
        results.add(a * b + c);
        results.add(a + b + c);
        return Collections.max(results);
    }
}
