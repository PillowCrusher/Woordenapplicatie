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
public class ConcordantieTest
{

    private LogicImplementation concordantie;

    public ConcordantieTest()
    {
    }

    @Before
    public void setUp()
    {
        concordantie = new Concordantie();
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of Bewerk method, of class Concordantie.
     */
    @Test
    public void testBewerk()
    {
        System.out.println("Bewerk");
        String[] lines = null;
        String expResult = "";
        String result = concordantie.Bewerk(lines);
        assertEquals(expResult, result);
        String[] lines1 =
        {
        };
        result = concordantie.Bewerk(lines1);
        assertEquals(expResult, result);
        String[] lines2 =
        {
            "asdf sdf fe", "sdf eee kkk  ", "fe"
        };

        expResult = "asdf         [1]\n"
                + "eee         [2]\n"
                + "fe         [1, 3]\n"
                + "kkk         [2]\n"
                + "sdf         [1, 2]\n";
        result = concordantie.Bewerk(lines2);
        assertEquals(expResult, result);

    }

}
