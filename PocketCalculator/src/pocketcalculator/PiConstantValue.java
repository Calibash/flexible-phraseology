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
public class PiConstantValue implements ICalculatorValue{
    private final double TruncatedPI = 3.14159265;
    public PiConstantValue(){
        //TODO - any needed cleanup
    }
    @Override
    public double presentValue() {
        return TruncatedPI;
    }
    
    
}
