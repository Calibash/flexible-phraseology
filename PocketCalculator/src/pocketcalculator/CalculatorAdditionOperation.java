/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 *
 * @author Calibash
 */
public class CalculatorAdditionOperation implements ICalculatorOperation{
    public CalculatorAdditionOperation(){}
    @Override
    public ICalcValue performOperation(
            ICalcValue firstValue, 
            ICalcValue secondValue) {
        double operationResult;
        operationResult = 
                firstValue.presentValue() + 
                secondValue.presentValue();
        return new CalcBaseValue(operationResult);
    }
    
}
