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
        System.out.println("CalcMultiplicationOperationTest running...");
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
        ICalcValue firstValue = new CalcValue(10);
        ICalcValue secondValue = new CalcValue(34);
        CalcMultiplicationOperation instance = new CalcMultiplicationOperation();
        ICalcValue expResult = new CalcValue(340);
        ICalcValue result = instance.performOperation(firstValue, secondValue);
        assertEquals(expResult.presentValue(), result.presentValue(),0);
    }
    
    @Test
    public void testPerformOperationSmallDoubleMultiplication(){
        System.out.println("small double multiplication");
        ICalcValue firstValue = new CalcValue(10.23);
        ICalcValue secondValue = new CalcValue(25.45);
        CalcMultiplicationOperation instance = new CalcMultiplicationOperation();
        ICalcValue expResult = new CalcValue(260.3535);
        ICalcValue result = instance.performOperation(firstValue, secondValue);
        assertEquals(expResult.presentValue(), result.presentValue(),0);  
    }
    
}
