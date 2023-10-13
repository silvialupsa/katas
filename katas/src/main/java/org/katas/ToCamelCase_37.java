package org.katas;

public class ToCamelCase_37 {
    public static void main() {

    }

    static String toCamelCase(String s){
        String[] strings=s.split("[_-]");
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(strings[0]);
        for(int i=1; i<strings.length; i++){
            stringBuilder.append(strings[i].substring(0, 1).toUpperCase()).append(strings[i].substring(1));
        }
        return stringBuilder.toString();
    }
}
