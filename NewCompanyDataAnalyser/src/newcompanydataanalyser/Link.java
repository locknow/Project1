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
    Link pre = null;
    Link next = null;

    public Link() {

    }

    public Link(String content) {
        this.content = content;
    }

    public boolean hasNext() {
        if (next == null) {
            return false;
        }

        return true;
    }

    public String toString() {
        return content;
    }
}
