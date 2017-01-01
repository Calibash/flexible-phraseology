/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapermutationobject;

import java.util.Date;

/**
 * Exists to output data which will be converted into a phrase
 * @author Calibash
 */
public class DataOutputTestObject {
    private final String firstName;
    private final String lastName;
    private final Date endDate;
    private final Date startDate;
    
    
    public DataOutputTestObject(
            String firstName, 
            String lastName,
            Date startDate,
            Date endDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
}
