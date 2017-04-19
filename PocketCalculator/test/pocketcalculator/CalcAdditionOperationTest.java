/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Calibash
 */
public class CalcAdditionOperationTest {
    
    public CalcAdditionOperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("CalcAdditionOperationTest running...");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of performOperation method, of class CalculatorAdditionOperation.
     */
    @Test
    public void testAddSmallInteger() {
        System.out.println("perform small integer addition");
        ICalcValue input1 = new CalcValue(10);
        ICalcValue input2 = new CalcValue(14);
        CalcAdditionOperation instance = new CalcAdditionOperation();
        ICalcValue expResult = new CalcValue(24);
        ICalcValue result = instance.performOperation(input1, input2);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
    
    @Test
    public void testAddSmallDouble(){
        System.out.println("perform small double addition");
        ICalcValue input1 = new CalcValue(330.23423);
        ICalcValue input2 = new CalcValue(14.7978);
        CalcAdditionOperation instance = new CalcAdditionOperation();
        ICalcValue expResult = new CalcValue(345.03203);
        ICalcValue result = instance.performOperation(input1, input2);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
    
    @Test
    public void testAddLargeInteger() {
        System.out.println("perform large addition Operation");
        ICalcValue input1 = new CalcValue(1023434);
        ICalcValue input2 = new CalcValue(1403432);
        CalcAdditionOperation instance = new CalcAdditionOperation();
        ICalcValue expResult = new CalcValue(2426866);
        ICalcValue result = instance.performOperation(input1, input2);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
}
