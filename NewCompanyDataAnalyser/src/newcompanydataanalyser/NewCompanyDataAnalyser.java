/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newcompanydataanalyser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aphasia
 */
public class NewCompanyDataAnalyser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        HashTable table = new HashTable(26);

        importWords(table);
        
        

    }

    public static void importWords(HashTable theTable) throws FileNotFoundException {
        String generated;
        String letter = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of your file (including file extension): ");
        String filename = input.next();
        try {
            Scanner in = new Scanner(new File(filename));

            generated = in.next();
            letter = generated.substring(0, 1).toLowerCase();
            while (in.hasNext() && generated != null) {
                theTable.add(generated);
                generated = in.next();
            }
            theTable.add(generated);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
