package org.katas;

public class TakeATenMinutesWalk_25 {
    public static void main() {
//        isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'});
//        isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'});
//        isValid(new char[] {'w'});
//        isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'});
        isValid(new char[] {'n','s','n','s','n','s','n','s','n','n'});
    }

    public static boolean isValid(char[] walk) {
        int sumWE = 0;
        int sumNS = 0;
        for (char c : walk) {
            if (c == 'n') {
                sumNS += 1;
            } else if (c == 's') {
                sumNS -= 1;
            } else if (c == 'w') {
                sumWE += 1;
            } else if (c == 'e') {
                sumWE -= 1;
            }
        }

        return walk.length == 10 && sumNS == 0 && sumWE==0 ;
    }
}
