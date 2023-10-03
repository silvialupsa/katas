package org.katas;

import java.util.Arrays;

public class BuyingACar_21 {
    public static void main() {
        nbMonths(2000, 8000, 1000, 1.5);
        nbMonths(12000, 8000, 1000, 1.5);
    }

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        if(startPriceOld - startPriceNew >= 0){
            return new int[] {0, startPriceOld - startPriceNew};
        }
        double priceNew = startPriceNew;
        double priceOld  = startPriceOld;
        double savings = 0;
        int month = 1;
        double result;
        while (true) {
            if (month >= 2 && month % 2 == 0) {
                percentLossByMonth += 0.5;
            }
            priceOld = (100-percentLossByMonth)/100*priceOld;
            priceNew = (100-percentLossByMonth)/100*priceNew;
            savings+=savingperMonth;
            result = priceOld - priceNew + savings;
            System.out.println("month " + month + " percentage loss " + percentLossByMonth + " price " + result);
            if (result > 0) {
                break;
            }
            month++;
        }
        int[] r = new int[] {month, (int) Math.round(result)};
        System.out.println(Arrays.toString(r));
        return r;
    }
}
