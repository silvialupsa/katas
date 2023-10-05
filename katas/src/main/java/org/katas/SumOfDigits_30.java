package org.katas;

public class SumOfDigits_30 {
    public static void main() {
        digital_root(16);
        digital_root(456);

    }

    public static int digital_root(int n) {
        int sum=getSum(n);
        while(sum>=10){
            sum=getSum(sum);
        }
        System.out.println(sum);
        return sum;
    }

    private static int getSum(int n){
        int sum=0;
        String nString = String.valueOf(n);
        String[] stringArray= nString.split("");
        for(int i=0; i<stringArray.length; i++){
            sum+=Integer.parseInt(stringArray[i]);
        }
        return sum;
    }


}
