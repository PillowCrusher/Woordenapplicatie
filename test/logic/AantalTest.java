/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.HashSet;
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
public class AantalTest
{
    //Hallo
    public AantalTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
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
        Aantal instance = new Aantal();
        String expResult = "";
        String result = instance.Bewerk(woorden);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convetToUniqueWords method, of class Aantal.
     */
    @Test
    public void testConvetToUniqueWords()
    {
        System.out.println("convetToUniqueWords");
        Aantal instance = new Aantal();
        HashSet expResult = null;
        HashSet result = instance.convetToUniqueWords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToList method, of class Aantal.
     */
    @Test
    public void testConvertToList()
    {
        System.out.println("convertToList");
        Aantal instance = new Aantal();
        ArrayList expResult = null;
        ArrayList result = instance.convertToList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
