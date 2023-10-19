package org.example;

import java.util.NavigableMap;
import java.util.TreeMap;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

public class Say
{

    private static final String[] oneToNineteen = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    public String say(long number)
    {
        return number < 20 ? oneToNineteen[(int) number]
                : number < 100 ? tens[(int) number / 10] + " " + say(number % 10)
                : number < 1000 ? oneToNineteen[(int) number / 100] + " Hundred " + say(number % 100)
                : number < 1_000_000 ? say(number / 1_000) + " Thousand " + say(number % 1_000)
                : number < 1_000_000_000 ? say(number / 1_000_000) + " Million " + say(number % 1_000_000)
                : say(number / 1_000_000_000) + " Billion " + say(number % 1_000_000_000);

    }
}
