package org.katas;

public class CamelCaseToUnderscore {

    public static void main() {
        toUnderScore("ThisShouldBeSplittedCorrectIntoUnderscore");
        toUnderScore("ThisIsAUnitTest");
        toUnderScore("Calculating1Plus1Equals2");
        toUnderScore("Calculating5Plus5Equals10");
        toUnderScore("Calculate500DividedBy5Equals100");
        toUnderScore("This_Is_Already_Splitted_Correct");
    }
    public static String toUnderScore(String name){
        String name1 = name
                .replaceAll("([a-zA-Z])([0-9])", "$1_$2");
        System.out.println("name1: " + name1);
        String name2 = name1.replaceAll("([^_])([A-Z])", "$1_$2");
        System.out.println("name2: " + name2);
        String result = name2.replaceAll("([^_])([A-Z])", "$1_$2");
        System.out.println("result: " + result);
        return result;
    }
}
