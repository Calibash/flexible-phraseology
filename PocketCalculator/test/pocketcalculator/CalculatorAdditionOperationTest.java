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
public class CalculatorAdditionOperationTest {
    
    public CalculatorAdditionOperationTest() {
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
        CalculatorAdditionOperation instance = new CalculatorAdditionOperation();
        double expResult = 24;
        ICalcValue result = instance.performOperation(input1, input2);
        assertEquals(expResult, result.presentValue(), 0);
    }
    
}
