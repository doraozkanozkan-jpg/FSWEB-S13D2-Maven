package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        int abs = Math.abs(number);
        int original = abs;
        int reversed = 0;
        while (abs > 0) {
            reversed = reversed * 10 + (abs % 10);
            abs /= 10;
        }
        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String[] words = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };
        String str = String.valueOf(number);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(words[str.charAt(i) - '0']);
        }
        return sb.toString();
    }
}