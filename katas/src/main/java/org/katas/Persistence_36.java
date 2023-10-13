package org.katas;

public class Persistence_36 {
    public static void main() {
        persistence( 39);
        persistence(  4);
    }

    public static int persistence(long n) {
        int multiplyResult = 1;
        int count =1;
        boolean check = true;
        while(check){
            String string = String.valueOf(n);
            String[] strings = string.split("");
            if(strings.length == 0){
                return count;
            }
            multiplyResult=1;
            for (String s : strings) {
                multiplyResult *= Integer.parseInt(s);
            }
            if(multiplyResult < 9){
                check=false;
            }
            System.out.println("multiplyResult: "+multiplyResult);
            System.out.println("count: "+ count);
            n=multiplyResult;
            count++;
        }
        return count; // your code
    }
}
