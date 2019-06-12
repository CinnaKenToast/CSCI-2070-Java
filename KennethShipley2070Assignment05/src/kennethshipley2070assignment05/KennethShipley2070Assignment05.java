//Kenneth Shipley
//CSCI 270-08
//Januray 30, 2018
//This program will compute the average of 3 test scores and display them
//using dialog boxes
package kennethshipley2070assignment05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        
        JOptionPane.showMessageDialog(null, "This is Ken's Test Score Average Calculator");
    
        String test1 = JOptionPane.showInputDialog("Enter Test 1 Score: ");
        String test2 = JOptionPane.showInputDialog("Enter Test 2 Score: ");
        String test3 = JOptionPane.showInputDialog("Enter Test 3 Score: ");
    
        double test1Val = Double.parseDouble(test1);
        double test2Val = Double.parseDouble(test2);
        double test3Val = Double.parseDouble(test3);
        
        double testAvg = (test1Val + test2Val + test3Val)/3;
        
        JOptionPane.showMessageDialog(null, "Average Test Score: " + numberFormat.format(testAvg));
    }
    
    
}
