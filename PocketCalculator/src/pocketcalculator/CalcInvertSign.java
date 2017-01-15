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
public class CalcInvertSign implements ICalcNumericModification{

    @Override
    public ICalcValue updateValue(ICalcValue current) {
        return new CalcValue(current.presentValue() * -1);
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
