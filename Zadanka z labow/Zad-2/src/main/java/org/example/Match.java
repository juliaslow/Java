package org.example;

import java.util.LinkedList;
import java.util.Queue;

// Queue
public class Match
{
    private String firstName;
    private String lastName;

    public Match(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }


}
