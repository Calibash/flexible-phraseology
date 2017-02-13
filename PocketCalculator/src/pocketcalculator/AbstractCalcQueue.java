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
    
    public void addToQueue(AbstractCalcOperation operation){
        throw new UnsupportedOperationException("Not supported yet."); //TODO - implement method
    }
}
