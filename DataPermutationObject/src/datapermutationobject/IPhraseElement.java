/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapermutationobject;

/**
 *Phrase element object/interface (PEO/PEI); i am tentatively considering this 
 * as a conversational or elemental component which fits the needs of a 
 * particular task or objective. the interface should define the purpose of the 
 * phrase, while the concrete implementations should form individually duck-type
 * compatible components which ought to be usable interchangeably - if they are 
 * not, then the phrase element interface isn't in scope, or the object itself 
 * isn't fully in the correct scope.
 * 
 * further considerations; the initial hub for commonality between different 
 * phrase elements most likely needs to hinge on some the PhraseElement itself, 
 * with sub-interfaces perhaps extending the interface into specific needs.
 * So, what commonality is shared by the Phrase elements in a system? That 
 * itself is much more likely to be highly context specific. Sets of string, 
 * integer, and decimal combinations in a discussion context are likely to be 
 * very dissimilar to sets designed for maximizing the realism of a set of 
 * video game character's dynamic dialogue (without making use of a full sized 
 * interpreter pattern)
 * 
 * @author Calibash
 */
public interface IPhraseElement<E> {
    E composePhrase();
}
