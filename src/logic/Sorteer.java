/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jeroe
 */
public class Sorteer implements LogicImplementation
{

    private final Set<String> set;
    private final Set<String> reverseSet;
    private String[] woorden;

    public Sorteer()
    {
        set = new TreeSet<>();
        reverseSet = new TreeSet<>(Collections.reverseOrder());
    }

    @Override
    public String Bewerk(String[] woorden)
    {
        if (woorden != null)
        {
            StringBuilder builder = new StringBuilder();
            this.woorden = woorden;
            builder.append("In geordende volgorde:");
            for (String woord : orderdWords())
            {
                if (!woord.equals(""))
                {
                    builder.append("\n").append(woord);
                }
            }
            builder.append("\n\nIn omgekeerde volgorde");
            for (String woord : reverseOrderd())
            {
                if (!woord.equals(""))
                {
                    builder.append("\n").append(woord);
                }
            }
            return builder.toString();
        }
        return "";
    }

    private Set<String> orderdWords()
    {
        set.clear();
        for (String woord : woorden)
        {
            set.add(woord);
        }
        return set;
    }

    private Set<String> reverseOrderd()
    {
        reverseSet.clear();
        for (String woord : woorden)
        {
            reverseSet.add(woord);
        }
        return reverseSet;
    }
}
