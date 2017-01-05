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
public class CalcBaseValue implements ICalcValue{
    private final double storedUserInput;
    public CalcBaseValue(double userInput){
        this.storedUserInput = userInput;
    }
    @Override
    public double presentValue() {
        return this.storedUserInput;
    }
    
}
