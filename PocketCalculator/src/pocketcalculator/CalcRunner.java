/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocketcalculator;

/**
 * this class exists because i was trying to do too much abstract shit too soon, 
 * and went enough different directions that I sort of lost track what i was 
 * initially doing, which was to create a running calculator. 
 * 
 * purpose; serve as a stopping point for GUI/mechanical operation
 * 
 * present; functioning interfaces needed to run GUI in whatever form GUI needs
 * (ie as a form of adaptor) 
 * 
 * utilize; existing and future interfaces to subcomponents
 * @author Calibash
 */
public class CalcRunner {
    private AbstractCalcQueue previousEntries;
    private AbstractCalcValue operatingValue;
    private AbstractCalcOperation currentOperation;
    public CalcRunner(){
        this.operatingValue = new CalcValue(0);
        this.previousEntries = new CalcQueue(this.operatingValue);
    }
    //note, the following operations should probably be abstracted, but for the 
    //sake of actually getting this project done...
    public void enterValue(AbstractCalcValue value){
        //add value to queue
        previousEntries.addToQueue(this.currentOperation, value);
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void callMultiplication(){
        //add a new multiplication operation instance onto the queue
        this.currentOperation = new CalcMultiplicationOperation();
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void callDivision(){
        //add a new division operation instance onto the queue
        this.currentOperation = new CalcDivisionOperation();
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void callAddition(){
        //add a new addition operation instance onto the queue
        this.currentOperation = new CalcAdditionOperation();
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void callSubtraction(){
        //add a new subtraction operation instance onto the queue
        this.currentOperation = new CalcSubtractionOperation();
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public AbstractCalcValue callEquals(){
        //output updated display value
        //clear active modification operations
        this.previousEntries.addToQueue(this.currentOperation, this.operatingValue);
        this.operatingValue =  this.previousEntries.executeQueue();
        //note that for this functionality to work in this case, there needs to be some form of null operation
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void displayQueueContents(){
        //use some format to present contents of queue, prefer internal method
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void clearQueue(){
        //call clear operation on queue
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
