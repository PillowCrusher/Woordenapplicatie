/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Jeroe
 */
public class Concordantie implements LogicImplementation
{

    private final HashMap<String, TreeSet> index;

    public Concordantie()
    {
        index = new HashMap<>();
    }

    @Override
    public String Bewerk(String[] lines)
    {
        if (lines != null)
        {
            StringBuilder builder = new StringBuilder();
            int count = 0;
            for (String line : lines)
            {
                count++;
                for (String woord : line.split(" "))
                {
                    if (!woord.equals(""))
                    {
                        addConcordantie(woord, count);
                    }
                }
            }
            // return index.toString(); Voor de luie onder ons
            for (Map.Entry<String, TreeSet> entry : index.entrySet())
            {
                builder.append(entry.getKey()).append("         ").append(entry.getValue().toString()).append("\n");
            }
            return builder.toString();
        }
        return "";
    }

    private void addConcordantie(String woord, int line)
    {
        TreeSet uniqueWoord;
        uniqueWoord = (TreeSet) index.get(woord);
        if (uniqueWoord == null)
        {
            //Als er ipv simpelweg de line toe te voegen er een nieuwe integer wordt
            //aangemaakt, dan kunnen er wel dubbele cijfer voorkomen. Denk ik.
            TreeSet newWord = new TreeSet();
            newWord.add(line);
            index.put(woord, newWord);
        } else
        {
            uniqueWoord.add(line);
        }
    }

}
