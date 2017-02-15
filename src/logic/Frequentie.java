/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jeroe
 */
public class Frequentie implements LogicImplementation
{

    /*Waarom ArrayList.
    LinkedList is trager in zn get met O(n/4) vs O(1)
    De LinkedList is sneller in het toevoegen van objecten omdat de arraylist
    telkens de lijst moet uitbreiden en kopieeren (vooral bij veel objecten traag)
    maar wanneer van te voren al weet hoe groote de lijst moet worden kun je 
    simpelweg de initiele waarde hoog genoeg maken om dit te voorkomen.
     */

    private ArrayList<String> list;
    private Set<String> uniqeSet;
    private String[] woorden;

    public Frequentie()
    {
        uniqeSet = new TreeSet<>();
    }

    @Override
    public String Bewerk(String[] woorden)
    {
        this.woorden = woorden;
        list = new ArrayList(woorden.length);
        return getFrequencies();
    }

    private String getFrequencies()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Voorkomen van woorden");
        for (String woord : woorden)
        {
            if (!woord.equals(""))
            {
                list.add(woord);
                uniqeSet.add(woord);
            }
        }
        for (String voorkomendWoord : uniqeSet)
        {
            builder.append("\n").append(voorkomendWoord).append("             ").append(Collections.frequency(list, voorkomendWoord));
        }
        return builder.toString();
    }
}
