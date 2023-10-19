package org.example;

public class Main {
    public static void main(String[] args) {

        Say sayConverter = new Say();

        long[] testCases = {0, 14, 50, 98, 100, 999, 456, 12345, 987654, 999999999, 1234567890};
        for (long num : testCases) {
                String words = sayConverter.say(num);
                System.out.println(num + " in words: " + words);

        }
    }
}