/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Jeroe
 */
public class Aantal implements LogicImplementation
{

    private final HashSet uniqueWords;
    private final ArrayList list;
    private String[] woorden;

    public Aantal()
    {
        uniqueWords = new HashSet();
        list = new ArrayList();
    }

    @Override
    public String Bewerk(String[] woorden)
    {
        this.woorden = woorden;
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Totaal aantal woorden: ");
        sBuilder.append(convertToList().size());
        sBuilder.append("\nAantal verschillende woorden: ");
        sBuilder.append(convetToUniqueWords().size());
        return sBuilder.toString();
    }

    public HashSet convetToUniqueWords()
    {
        uniqueWords.clear();
        for (String word : woorden)
        {
            uniqueWords.add(word);
        }
        return uniqueWords;
    }
    
    public ArrayList convertToList()
    {
        list.clear();
        for(String word : woorden)
        {
            list.add(word);
        }
        return list;
    }

}
