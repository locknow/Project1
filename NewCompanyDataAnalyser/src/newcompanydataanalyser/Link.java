/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newcompanydataanalyser;

/**
 *
 * @author Aphasia
 */
public class Link {
    String content;
    Link pre;
    Link next;
    
    public Link(){
        
    }
    
    public Link(String content){
        this.content=content;
    }
    
    public String toString(){
        return content;
    }
}
