package org.katas;

public class WhoLikesIt_26 {
    public static void main() {
        whoLikesIt();
        whoLikesIt("Peter");
        whoLikesIt("Jacob", "Alex");
        whoLikesIt("Max", "John", "Mark");
        whoLikesIt("Alex", "Jacob", "Mark", "Max");
    }

    public static String whoLikesIt(String... names) {
        String string;
        if(names.length == 0){
            string= "no one likes this";
        } else if(names.length == 1){
            string= names[0] + " likes this";
        } else if(names.length == 2){
            string= names[0]+ " and " + names[1]+" like this";
        } else if(names.length == 3){
            string = names[0]+", "+names[1]+" and "+ names[2]+" like this";
        } else{
            String diff = Integer.toString(names.length -2);
            string=names[0] + ", " + names[1] + " and " + diff + " others like this";
        }
        System.out.println(string);
        return string;
    }
}
