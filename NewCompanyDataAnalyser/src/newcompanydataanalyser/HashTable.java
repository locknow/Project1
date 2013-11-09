/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcompanydataanalyser;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author fangsidian
 */
public class HashTable {

    private ArrayList<LinkedList<String>> array;

    public HashTable() {
        array = new ArrayList<LinkedList<String>>();
    }

    public void add(LinkedList linkedList) {
        array.add(linkedList);
    }

    public void remove(int index) {
        array.remove(index);
    }

    public LinkedList find(int index) {
        return array.get(index);
    }

}
