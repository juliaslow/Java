package org.example;
import java.util.HashMap;
import java.util.Map;

public class FrequentNames
{

    private Map<String, Integer> nameCounts;

    public FrequentNames() //konstruktor bezargumentoey
    {
        this.nameCounts = new HashMap<>(); // nowa pusta map, aby umożliwić szybki dostęp do nich za pomocą klucza
    }

    public String choose()
    {
        if (nameCounts.isEmpty())
        {
            return null;
        }
        String mostFrequent = null;
        int maxCount = 0;

        for(String entry : nameCounts.keySet())//wyrażenie zwraca zestaw kluczy z mapy nameCounts.
        {
            int count = nameCounts.get(entry);
            if (maxCount < count) {
                mostFrequent = entry;
                maxCount = count;
            }
        }

            if(mostFrequent != null)
            {
                nameCounts.remove(mostFrequent);
            }


        return mostFrequent;

    }


    public void insert(String name)
    {
        nameCounts.put(name, nameCounts.getOrDefault(name,0) +1);
    }

    public boolean isEmpty()
    {
        return nameCounts.isEmpty();
    }
}
