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
public class CalcSubtractionOperationTest {
    
    public CalcSubtractionOperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of performOperation method, of class CalcSubtractionOperation.
     */
    @Test
    public void testPerformSmallSubtractionOperation() {
        System.out.println("PerformSmallSubtractionOperation");
        ICalcValue firstValue = new CalcBaseValue(343);
        ICalcValue secondValue = new CalcBaseValue(23);
        CalcSubtractionOperation instance = new CalcSubtractionOperation();
        double expResult = 320;
        ICalcValue result = instance.performOperation(firstValue, secondValue);
        assertEquals(expResult, result.presentValue(), 0);
    }
    
}
