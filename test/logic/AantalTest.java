/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeroe
 */
public class AantalTest
{

    private LogicImplementation aantal;

    public AantalTest()
    {
    }

    @Before
    public void setUp()
    {
        aantal = new Aantal();
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of Bewerk method, of class Aantal.
     */
    @Test
    public void testBewerk()
    {
        System.out.println("Bewerk");
        String[] woorden = null;
        String expResult = "";
        String result = aantal.Bewerk(woorden);
        assertEquals(expResult, result);
        String[] woorden1 =
        {
            "a", "s",""
        };
        expResult = "Totaal aantal woorden: 2\nAantal verschillende woorden: 2";
        result = aantal.Bewerk(woorden1);
        assertEquals(expResult, result);
        String[] woorden2 =
        {
            "ab", "abc", "ab", "fd",""
        };
        expResult = "Totaal aantal woorden: 4\nAantal verschillende woorden: 3";
        result = aantal.Bewerk(woorden2);
        assertEquals(expResult, result);
    }
}
