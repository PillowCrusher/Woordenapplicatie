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
public class SorteerTest
{
    private LogicImplementation sorteer;
    
    public SorteerTest()
    {
    }
    
 
    @Before
    public void setUp()
    {
        sorteer = new Sorteer();
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of Bewerk method, of class Sorteer.
     */
    @Test
    public void testBewerk()
    {
        System.out.println("Bewerk");
        String[] woorden = null;
        String expResult = "";
        String result = sorteer.Bewerk(woorden);
        assertEquals(expResult, result);
        String[] woorden1 = {};
        expResult = "In geordende volgorde:\n\nIn omgekeerde volgorde";
        result = sorteer.Bewerk(woorden1);
        assertEquals(expResult, result);
        String[] woorden2 = {"a","z","k","zd","qu","q"};
        expResult = "In geordende volgorde:\na\nk\nq\nqu\nz\nzd\n\nIn omgekeerde volgorde\nzd\nz\nqu\nq\nk\na";
        result = sorteer.Bewerk(woorden2);
        assertEquals(expResult, result);
    }
    
}
