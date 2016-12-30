/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapermutationobject;

/**
 *Context for data permutation object structure
 *key elements;
 * 
 * Data transformation object/interface (DTO/DTI);hold the logic for 
 * transforming output  from an existing class into particular phrase elements. 
 * can be anything from 
 * a simple passing through to a complex decorator. possibly incorporating 
 * previous phrases? should give some thought into this. the need i perceive for 
 * this is related to the ever growing expansion of getter type methods for 
 * large classes that exist 'because the object needs to know how to express 
 * that information.' 
 * I would argue that it is in fact the opposite. the object itself needs to 
 * know what it is encapsulating, what it is doing and why it exists inside that
 * encapsulation, and what it is exposing to the rest of the system. 
 * the final bit is what we're concerned about here, and modifying this exposure
 * past the point of "i am an object, i know J, and i am deliberately exposing 
 * X, Y and Z to the world because they best express what needs to be known 
 * about J and how i use it" is rolling in logic that isn't in scope.
 * 
 * Phrase Composition object(PCO); an output 'phrase' consisting of multiple 
 * types of known input which need to be arranged in a specific way to meet a 
 * given structural or GUI need. 
 * an example of this might be the need to say, output 
 *  "[target individual][situation description][imperative command]" in a video 
 * game, where each of the components of that phrase vary situationally. while
 * the traditional response is to control each situation, and have each 
 * permutation stored and then recalled, having individual objects 'know' 
 * enough indicators of their state ( in the DTO, through the DTI) to pass it 
 * into a PEO, an appropriately compatible PCO should be able to 
 * compose it into dynamically appropriate phrases
 * 
 * Phrase element object/interface (PEO/PEI); i am tentatively considering this 
 * as a conversational or elemental component which fits the needs of a 
 * particular task or objective. the interface should define the purpose of the 
 * phrase, while the concrete implementations should form individually duck-type
 * compatible components which ought to be usable interchangeably - if they are 
 * not, then the phrase element interface isn't in scope, or the object itself 
 * isn't fully in the correct scope. 
 * 
 * 
 * @author Calibash
 */
public class DataPhrasePermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
