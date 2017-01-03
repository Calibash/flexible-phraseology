/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

import java.util.LinkedList;

/**
 *
 * @author Calibash
 */
public class StoredValue implements ICalculatorValue{
    private LinkedList<ICalculatorValue> previousValueList;
    private ICalculatorValue currentValue;
    public StoredValue(ICalculatorValue input){
        this.previousValueList.add(input);
        this.currentValue = input;
    }
    @Override
    public double presentValue() {
        return this.currentValue.presentValue();
    }
    
}
