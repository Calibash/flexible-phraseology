/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 * perform subtraction of second input from the first
 * @author Calibash
 */
public class CalcSubtractionOperation extends AbstractCalcOperation{
    public CalcSubtractionOperation(){}
    @Override
    public ICalcValue performOperation(
            ICalcValue firstValue, 
            ICalcValue secondValue) {
        return new CalcValue(
                firstValue.presentValue() - secondValue.presentValue());
    }
    
}
