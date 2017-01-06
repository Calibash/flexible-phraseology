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
public class CalcAdditionOperation implements ICalcOperation{
    public CalcAdditionOperation(){}
    @Override
    public ICalcValue performOperation(
            ICalcValue input1, 
            ICalcValue input2) {
        //TODO - make sure that this is up to snuff in terms of coding best 
        //practices. does this need more checking?
        return new CalcBaseValue(
                input1.presentValue() + 
                input2.presentValue());
    }
    
}
