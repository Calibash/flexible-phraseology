/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Calibash
 */
public class CalcInvertSignTest {
    
    public CalcInvertSignTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of updateValue method, of class CalcModifysign.
     */
    @Test
    public void testUpdateValuePositiveToNegative() {
        System.out.println("updateValue properly changes the sign"
                + "of an input value from positive to negative");
        ICalcValue current = new CalcValue(23.0);
        CalcInvertSign instance = new CalcInvertSign();
        ICalcValue expResult = new CalcValue(-23);
        ICalcValue result = instance.updateValue(current);
        assertEquals(expResult.presentValue(), result.presentValue(),0);       
    }
    
        /**
     * Test of updateValue method, of class CalcModifysign.
     */
    @Test
    public void testUpdateValueNegativeToPositive() {
        System.out.println("updateValue properly changes the sign"
                + "of an input value from negative to positive");
        ICalcValue current = new CalcValue(-23.0);
        CalcInvertSign instance = new CalcInvertSign();
        ICalcValue expResult = new CalcValue(23);
        ICalcValue result = instance.updateValue(current);
        assertEquals(expResult.presentValue(), result.presentValue(),0);       
    }
   
}
