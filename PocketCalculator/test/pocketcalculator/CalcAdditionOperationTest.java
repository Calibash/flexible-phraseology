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
    public void testPerformSmallAdditionOperation() {
        System.out.println("perform small addition Operation");
        ICalcValue input1 = new CalcBaseValue(10);
        ICalcValue input2 = new CalcBaseValue(14);
        CalcAdditionOperation instance = new CalcAdditionOperation();
        ICalcValue expResult = new CalcBaseValue(24);
        ICalcValue result = instance.performOperation(input1, input2);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
    
    @Test
    public void testPerformLargeAdditionOperation() {
        System.out.println("perform large addition Operation");
        ICalcValue input1 = new CalcBaseValue(1023434);
        ICalcValue input2 = new CalcBaseValue(1403432);
        CalcAdditionOperation instance = new CalcAdditionOperation();
        ICalcValue expResult = new CalcBaseValue(2426866);
        ICalcValue result = instance.performOperation(input1, input2);
        assertEquals(expResult.presentValue(), result.presentValue(), 0);
    }
}
