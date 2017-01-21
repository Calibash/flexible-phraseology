/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 * This interface encompasses the needs of a numeric, operable value used by the
 * pocketCalculator system. this serves as a wrapping for the numeric value 
 * itself, as well as any required checks which need to be exposed to components
 * @author Calibash
 */
public interface ICalcValue {
    double presentValue();
    boolean validDivisor();
}
