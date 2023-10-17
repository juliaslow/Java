package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString
{

    public String revere(String word)
    {
        /*String outString = "";
        for(char c : word.toCharArray()) {
            outString = c + outString;
        }
        return outString;*/
        return new StringBuilder(word).reverse().toString();
    }// StringBuilder, który jest używany do manipulacji łańcuchami znaków.
}
