/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 *perform division operation on multiple value inputs
 * @author Calibash
 */
public class CalcDivisionOperation implements ICalcOperation{
    public CalcDivisionOperation(){}
    @Override
    public ICalcValue performOperation(
            ICalcValue firstValue, 
            ICalcValue secondValue) {
        if (checkValueNotZero(secondValue)){            
            return new CalcValue(
                firstValue.presentValue() / secondValue.presentValue());
        }
        throw new UnsupportedOperationException(
                    "Division by zero, Not supported yet.");
  }
    
    private boolean checkValueNotZero(ICalcValue value){
        boolean checkResult = false;
        if (value.presentValue() !=0)
            checkResult = true;
        return checkResult;
        
    }
}
