/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 *Abstract representation of a usable calculator value
 * @author Calibash
 */
public abstract class AbstractCalcValue implements ICalcValue {
    
    public AbstractCalcValue() {
    }

    @Override
    public double presentValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validDivisor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
