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
public class CalcMultiplicationOperationTest {
    
    public CalcMultiplicationOperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of performOperation method, of class CalcMultiplicationOperation.
     */
    @Test
    public void testPerformOperation() {
        System.out.println("small integer multiplication");
        ICalcValue firstValue = new CalcBaseValue(10);
        ICalcValue secondValue = new CalcBaseValue(34);
        CalcMultiplicationOperation instance = new CalcMultiplicationOperation();
        ICalcValue expResult = new CalcBaseValue(340);
        ICalcValue result = instance.performOperation(firstValue, secondValue);
        assertEquals(expResult.presentValue(), result.presentValue(),0);
    }
    
}
