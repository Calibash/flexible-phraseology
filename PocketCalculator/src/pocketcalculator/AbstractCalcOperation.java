/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 *Abstract of passable calculation operations. encapsulates logic specific to 
 * what operation is being performed, and how for use in pocket calculator
 * @author Calibash
 */
public abstract class AbstractCalcOperation implements ICalcOperation{
    
    /**
     * Abstract version of operation. Performs implemented operation on the two
     * inputs
     * @param firstValue
     * @param secondValue
     * @return 
     */
    @Override
    public ICalcValue performOperation(ICalcValue firstValue, ICalcValue secondValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
