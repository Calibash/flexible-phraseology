/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 * this interface is intended to support changes made using key operations
 * which are intended to modify the user's input before an operation is 
 * performed.
 * @author Calibash
 */
public interface ICalcNumericModification {
    ICalcValue updateValue(ICalcValue current);
    
}
