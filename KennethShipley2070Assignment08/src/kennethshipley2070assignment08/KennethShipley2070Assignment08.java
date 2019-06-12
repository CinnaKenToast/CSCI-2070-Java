//Kenneth Shipley
//CSCI 2070-08
//February 20, 2018
//This program will read from a file and create a new file with each word
//from the file and the length of each word
 
package kennethshipley2070assignment08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This is Ken's Word Length Program");
        System.out.print("Enter a file to read: ");
        String readFilename = scan.nextLine();
        
        System.out.print("Enter a file to output: ");
        String writeFilename = scan.nextLine();
        
        File file = new File(readFilename);
        Scanner fileReader = new Scanner(file);
        
        FileWriter fw = new FileWriter(writeFilename,true);
        PrintWriter pw = new PrintWriter(fw);
        
        while(fileReader.hasNext()){
            String word = fileReader.next();
            pw.println(word + " " + word.length());
        }
        
        fileReader.close();
        fw.close();
        
         
    }
    
}
