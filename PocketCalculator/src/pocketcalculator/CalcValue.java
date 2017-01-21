/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 * purpose; abstract storage of values, constants, etc stored internally by
 * the calculator. primary use is to create a value structure that will enable 
 * the user to enter in only valid inputs, and produce an easier to manage 
 * output. 
 * 
 * an example would be the need to prevent a user from entering in multiple
 * decimal points, inputting a zero value as the denominator for division, etc.
 * @author Calibash
 */
public class CalcValue implements ICalcValue{
    private final double storedUserInput;
    public CalcValue(double userInput){
        this.storedUserInput = userInput;
    }
    /**
     * Express the contents of this object as a double
     * @return the contents of the CalcValue object as a single double value
     */
    @Override
    public double presentValue() {
        return this.storedUserInput;
    }
    
    /**
     * Checks the stored value governed by the CalcValue object for various 
     * potentially unsafe operations.
     * @return whether this value can be used as the denominator in division 
     */
    @Override
    public boolean validDivisor() {
        boolean validDivisor = false;
        if (storedUserInput !=0) {
            validDivisor = true;
        }
        return validDivisor;
    }
    
}
