/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 * perform addition of multiple math value containers
 * @author Calibash
 */
public class CalcAdditionOperation extends AbstractCalcOperation{
    public CalcAdditionOperation(){}
    @Override
    /**
     * Add the contents of the firstValue to the secondValue in a non-integer 
     * specific operation. 
     * @firstValue
     * @secondValue
     */
    public ICalcValue performOperation(
            ICalcValue firstValue, 
            ICalcValue secondValue) {
        return new CalcValue(
                firstValue.presentValue() + secondValue.presentValue());
    }
    
}
