package org.katas;

public class FromAtoZ_18 {
    public static void main() {
        gimmeTheLetters("a-z");
        gimmeTheLetters("h-o");
    }
    public static String gimmeTheLetters(String s){
        char firstChar = s.charAt(0);
        char secondChar = s.charAt(2);
        char[] lowerCaseAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] upperCaseAlphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        StringBuilder stringBuilder = new StringBuilder();
        int j =0, k=0;
        if(s.toUpperCase().equals(s)){
            getString(firstChar, secondChar, upperCaseAlphabet, stringBuilder, j, k);
        } else{
            getString(firstChar, secondChar, lowerCaseAlphabet, stringBuilder, j, k);
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    private static void getString(char firstChar, char secondChar, char[] upperOrLowerCaseAlphabet, StringBuilder stringBuilder, int j, int k) {
        for(int i=0; i<upperOrLowerCaseAlphabet.length; i++){
            if(upperOrLowerCaseAlphabet[i] == firstChar){
                j = i;
            }
            if(upperOrLowerCaseAlphabet[i] == secondChar){
                k=i;
            }
        }
        for(int i=0; i<upperOrLowerCaseAlphabet.length; i++) {
            if (j <= i && i <= k) {
                System.out.println(upperOrLowerCaseAlphabet[i]);
                stringBuilder.append(upperOrLowerCaseAlphabet[i]);
            }
        }
    }
}
