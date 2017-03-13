/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 * store a series of operations and values to be computed later
 * @author Calibash
 */
public abstract class AbstractCalcQueue {
    private AbstractCalcValue initialValue;
    public AbstractCalcQueue(AbstractCalcValue initialValue){
        this.initialValue = initialValue;    
    }
    
    /**
     * add an operation to be performed onto the initial value with a new value
     * @param operation -a valid operation to be performed 
     * @param value - a value for the selected operation to be performed with
     */
    public void addToQueue(
            AbstractCalcOperation operation,
            AbstractCalcValue value
                    ){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * perform all stored operations and output the result
     * @return result of performing all queued operations on initial value
     */
    public AbstractCalcValue executeQueue(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
