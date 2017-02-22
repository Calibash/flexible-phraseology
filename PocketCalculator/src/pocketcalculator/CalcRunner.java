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
    public CalcRunner(){
        this.operatingValue = new CalcValue(0);
    }
    //note, the following operations should probably be abstracted, but for the 
    //sake of actually getting this project done...
    public void callMultiplication(){}
    public void callDivision(){}
    public void callAddition(){}
    public void callSubtraction(){}
    public AbstractCalcValue callEquals(){
        //output updated display value
        //clear active modification operations
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
