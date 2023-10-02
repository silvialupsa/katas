package org.katas;

public class NotVerySecure_13 {
    public static void main() {
        System.out.println(alphanumeric("Across the rivers"));
        System.out.println(alphanumeric("Next to a lake"));
    }
        public static boolean alphanumeric(String s){

            return s.matches("^[a-zA-Z0-9]+$");
        }
}
