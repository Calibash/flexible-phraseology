/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 * purpose; make use of the data stored by two calculator values to perform an 
 * operation to be specified during runtime.
 * @author Calibash
 */
public interface ICalculatorOperation {
    double performOperation(
            ICalculatorValue firstValue, 
            ICalculatorValue secondValue);
}
