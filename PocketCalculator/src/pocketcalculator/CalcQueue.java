/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 *A module specific implementation or facade for queue operations, specifically 
 * using module classes.
 * 
 * -should be able to handle calcValues.
 * -the function of the queue will be to (as of right now) input a series of
 * value/operation pairs, either short or long, and then execute them when the 
 * equals key is pushed. so something like 2*5+4 should be possible.
 * -the question is how this queue will use the order of operations? stopgap 
 * measure would be to not. one operation at a time, make use of functionality
 * but forgo any immediate messing about with that.
 * @author Calibash
 */
public class CalcQueue extends AbstractCalcQueue {
    //either implement own, or use java library
    //potential options interface, collection, list
    public CalcQueue(AbstractCalcValue defaultValue) {
        super(defaultValue);
    }
    
    //internal function for order of operations?
    
    //implementation of queue addition and execution
}
