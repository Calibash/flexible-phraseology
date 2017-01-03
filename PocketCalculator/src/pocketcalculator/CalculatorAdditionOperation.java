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
    public ICalculatorValue performOperation(
            ICalculatorValue firstValue, 
            ICalculatorValue secondValue) {
        double operationResult;
        operationResult = 
                firstValue.presentValue() + 
                secondValue.presentValue();
        return new InputValue(operationResult);
    }
    
}
