package org.katas;

public class ClosingInSum_19 {
    public static void main() {
        closingInSum(121L);
        closingInSum(1039L);
    }

    public static int closingInSum(long n) {
        String string = String.valueOf(n);
        int length = string.length();
        int sum = 0;
        if (length % 2 == 0) {
            for (int i = 0; i < length / 2; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string.charAt(i));
                stringBuilder.append(string.charAt(length - 1 - i));
                sum += Integer.parseInt(stringBuilder.toString());
            }
        } else {
            for (int i = 0; i < (length - 1) / 2; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string.charAt(i));
                stringBuilder.append(string.charAt(length - 1 - i));
                sum += Integer.parseInt(stringBuilder.toString());
            }
            sum += Integer.parseInt(String.valueOf(string.charAt((length - 1) / 2)));
        }
        return sum;
    }
}
