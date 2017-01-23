/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 * perform multiplication operation on multiple inputs
 * @author Calibash
 */
public class CalcMultiplicationOperation extends AbstractCalcOperation{
    public CalcMultiplicationOperation(){}
    @Override
    public ICalcValue performOperation(
            ICalcValue firstValue, 
            ICalcValue secondValue) {
        return new CalcValue(
                firstValue.presentValue() * secondValue.presentValue());
    }
    
}
