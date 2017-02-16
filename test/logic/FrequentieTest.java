/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeroe
 */
public class FrequentieTest
{

    private LogicImplementation frequentie;

    public FrequentieTest()
    {
    }

    @Before
    public void setUp()
    {
        frequentie = new Frequentie();
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of Bewerk method, of class Frequentie.
     */
    @Test
    public void testBewerk()
    {
        System.out.println("Bewerk");
        String[] woorden = null;
        String expResult = "";
        String result = frequentie.Bewerk(woorden);
        assertEquals(expResult, result);
        String[] woorden1 =
        {
        };
        expResult = "Voorkomen van woorden";
        result = frequentie.Bewerk(woorden1);
        assertEquals(expResult, result);
        String[] woorden2 =
        {
            "hallo", "daar", "hallo", "hier"
        };
        expResult = "Voorkomen van woorden\n"
                + "daar             1\n"
                + "hallo             2\n"
                + "hier             1";
        result = frequentie.Bewerk(woorden2);
        assertEquals(expResult, result);
    }

}
