/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newcompanydataanalyser;

/**
 *
 * @author Aphasia
 */
public class LinkedList {

    Link currentLink = null;
    Link firstLink = null;
    int count = 0;

    public void put(String text) {
        if (count == 0) {
            firstLink = new Link(text);
            currentLink = firstLink;
            count++;
            return;
        }

        //if not first link
        Link newLink = new Link(text);
        currentLink.next=newLink;
        newLink.pre=currentLink;
        currentLink=newLink;
        count++;
    }

    public void remove(String text) {

        currentLink = firstLink;

        while (true) {
            if (currentLink.content.equals(text)) {
                //do remove
                currentLink.pre.next = currentLink.next;

                currentLink.next.pre = currentLink.pre;

                currentLink = null;

                count--;
                break;
            }

            currentLink = currentLink.next;
        }
    }
}
