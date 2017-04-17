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
public class CalcDivisionOperationTest {
    
    public CalcDivisionOperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("CalcDivisionOperationTest running...");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of performOperation method, of class CalcDivisionOperation.
     */
    @Test
    public void testPerformOperation() {
        System.out.println("small integer division");
        ICalcValue firstValue = new CalcValue(320);
        ICalcValue secondValue = new CalcValue(10);
        CalcDivisionOperation instance = new CalcDivisionOperation();
        ICalcValue expResult = new CalcValue(32);
        ICalcValue result = instance.performOperation(firstValue, secondValue);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
    
    @Test
    public void testDivideSmallDouble(){
        System.out.println("Small double division");
        ICalcValue firstValue = new CalcValue(55.4);
        ICalcValue secondValue = new CalcValue(3.2);
        CalcDivisionOperation instance = new CalcDivisionOperation();
        ICalcValue expResult = new CalcValue(17.3125);
        ICalcValue result = instance.performOperation(firstValue, secondValue);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
    
    @Test
    public void testDivideLargeDouble(){
        System.out.println("Large double division");
        ICalcValue firstValue = new CalcValue(5500.4);
        ICalcValue secondValue = new CalcValue(100);
        CalcDivisionOperation instance = new CalcDivisionOperation();
        ICalcValue expResult = new CalcValue(55.004);
        ICalcValue result = instance.performOperation(firstValue, secondValue);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
    
    @Test
        public void testDividesByZeroDoesntCrashEverything() {
        System.out.println("Divides By Zero Doesnt Crash Everything");
        ICalcValue firstValue = new CalcValue(320);
        ICalcValue secondValue = new CalcValue(0);
        CalcDivisionOperation instance = new CalcDivisionOperation();
        Boolean exceptionThrown = false;
        UnsupportedOperationException thrownException = null;
        try{
            instance.performOperation(firstValue, secondValue);
        } catch (UnsupportedOperationException e){
            exceptionThrown = true;
            thrownException = e;
        }
        assertTrue(exceptionThrown);
        assertNotNull(thrownException);
    }
}
