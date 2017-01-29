/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

import java.util.List;


/**
 * A queue of inputted values and operations, to be output to the calculator 
 * display on command
 * @author Calibash
 */
public class CalcEquation {
    //take input of some series of values and operations. new values go into the
    //stored queue, to be displayed on the screen until cleared
    private final ICalcOperation originOperation;
    private final ICalcValue originValue;
    public CalcEquation(final ICalcOperation operation, final ICalcValue value){
        this.originOperation = operation;
        this.originValue = value;
    }
    //output the current value of the existing equation
    
    //delete the most recent operation or value
    
    //add a new value or operation to the equation   
    
}
