package org.katas;

import java.util.Arrays;

public class CreatePhoneNumber_31 {
    public static void main() {
        createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
    }

    public static String createPhoneNumber(int[] numbers) {
       StringBuilder stringBuilder = new StringBuilder();
       for(int i=0; i<numbers.length; i++){
           stringBuilder.append(numbers[i]);
       }
       String result = stringBuilder.toString();
       String phoneNumber = "(" + result.substring(0,3) +") " + result.substring(3,6) +"-"+result.substring(6,10) ;
        System.out.println(phoneNumber);
        return phoneNumber;
    }
}
