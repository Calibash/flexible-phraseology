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
public class CalculatorAdditionOperation implements ICalcOperation{
    public CalculatorAdditionOperation(){}
    @Override
    public ICalcValue performOperation(
            ICalcValue input1, 
            ICalcValue input2) {
        double operationResult = 
                input1.presentValue() + 
                input2.presentValue();
        return new CalcBaseValue(operationResult);
    }
    
}
