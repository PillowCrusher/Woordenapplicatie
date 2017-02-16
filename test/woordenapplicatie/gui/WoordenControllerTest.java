/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woordenapplicatie.gui;

import java.net.URL;
import java.util.ResourceBundle;
import logic.Concordantie;
import logic.LogicImplementation;
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

    @Before
    public void setUp()
    {

    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of convertToWords method, of class WoordenController.
     */
    @Test
    public void testConvertToWords()
    {
        System.out.println("convertToWords");
        WoordenController instance = new WoordenController();
        String[] expResult =
        {
            "een", "twee", "drie", "vier", "hoedje", "van", "hoedje", "van", "een", "twee", "drie", "vier",
            "hoedje", "van", "papier"
        };
        String[] result = instance.convertToWords();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of convertToLines method, of class WoordenController.
     */
    @Test
    public void testConvertToLines()
    {
        System.out.println("convertToLines");
        WoordenController instance = new WoordenController();
        String[] expResult =
        {
            "een twee drie vier", "hoedje van hoedje van", "een twee drie vier", "hoedje van papier"
        };
        String[] result = instance.convertToLines();
        assertArrayEquals(expResult, result);
    }

}
