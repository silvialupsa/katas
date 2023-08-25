package org.katas;

import java.util.*;

public class EasyLogs_8 {

    public static void main() {
        System.out.println(logs(10, 2, 3));
    }

    public static double logs(double x, double a, double b) {
        // TODO add implementation
        return Math.log(a) / Math.log(x) + Math.log(b) / Math.log(x);
    }


}
