/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woordenapplicatie.gui;

import java.net.URL;
import java.util.ResourceBundle;
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
public class WoordenControllerTest
{
    
    public WoordenControllerTest()
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
     * Test of initialize method, of class WoordenController.
     */
    @Test
    public void testInitialize()
    {
        System.out.println("initialize");
        URL location = null;
        ResourceBundle resources = null;
        WoordenController instance = new WoordenController();
        instance.initialize(location, resources);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToWords method, of class WoordenController.
     */
    @Test
    public void testConvertToWords()
    {
        System.out.println("convertToWords");
        WoordenController instance = new WoordenController();
        String[] expResult = null;
        String[] result = instance.convertToWords();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToLines method, of class WoordenController.
     */
    @Test
    public void testConvertToLines()
    {
        System.out.println("convertToLines");
        WoordenController instance = new WoordenController();
        String[] expResult = null;
        String[] result = instance.convertToLines();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
