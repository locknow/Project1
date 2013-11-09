/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcompanydataanalyser;

/**
 *
 * @author fangsidian
 */
public class HashTable {

    private LinkedList[] elementList = null;

    public HashTable() {
    }

    public HashTable(int size) {
        elementList = new LinkedList[size];
    }

    public void add(String text) {
        int key = FindKey(text);
        elementList[key].put(text);
    }

    public void remove(String text) {
        int key = FindKey(text);
        elementList[key].remove(text);
    }

    public LinkedList find(String key) {
        return elementList[FindKey(key)];
    }

    public int FindKey(String text) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String letter = text.substring(0, 1).toLowerCase();
        String l = "";

        for (int i = 0; i < letters.length; i++) {
            l = letters[i];
            if (letter.equals(l)) {
                return i;
            }
        }
        return 0;
    }
}
