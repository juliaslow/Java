package org.example;

public class Main {
    public static void main(String[] args) {

        MicroBlog microBlog = new MicroBlog();

        String longText = "This is a long text with some emojis 👍";
        String shortText = "Hello";

        String truncatedLongText = microBlog.truncate(longText);
        String truncatedShortText = microBlog.truncate(shortText);

        System.out.println("Original Long Text: " + longText);
        System.out.println("Truncated Long Text: " + truncatedLongText);

        System.out.println("Original Short Text: " + shortText);
        System.out.println("Truncated Short Text: " + truncatedShortText);
    }
}