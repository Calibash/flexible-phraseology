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
        System.out.println("CalcSubtractionOperationTest running...");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of performOperation method, of class CalcSubtractionOperation.
     */
    @Test
    public void testPerformSmallSubtractionOperation() {
        System.out.println("Small integer subtraction");
        ICalcValue firstValue = new CalcValue(343);
        ICalcValue secondValue = new CalcValue(23);
        CalcSubtractionOperation instance = new CalcSubtractionOperation();
        ICalcValue expResult = new CalcValue(320);
        ICalcValue result = instance.performOperation(firstValue, secondValue);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
    
    @Test 
        public void testPerformSmallDoubleSubtraction(){
        System.out.println("Small double subtraction");
        ICalcValue firstValue = new CalcValue(734.234);
        ICalcValue secondValue = new CalcValue(2553.23);
        CalcSubtractionOperation instance = new CalcSubtractionOperation();
        ICalcValue expResult = new CalcValue(-1818.996);
        ICalcValue result = instance.performOperation(firstValue, secondValue);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
    
    @Test
    public void testPerformSubtractionOnNegativeNumbers(){
        System.out.println("subtracting a negative from a negative number");
        ICalcValue firstValue = new CalcValue(-30);
        ICalcValue secondValue = new CalcValue(-23);
        CalcSubtractionOperation instance = new CalcSubtractionOperation();
        ICalcValue expResult = new CalcValue(-7);
        ICalcValue result = instance.performOperation(firstValue, secondValue);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
    
}
