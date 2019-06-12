//Kenneth Shipley
//CSCI 2070-08
//February 6, 2018
//This program will alphabetically sort names given by the user
package kennethshipley2070assignment06;

import java.util.Scanner;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the first name: ");
        String name1 = scan.nextLine();
        
        System.out.print("Enter the second name: ");
        String name2 = scan.nextLine();
        
        System.out.print("Enter the third name: ");
        String name3 = scan.nextLine();
        
        String first;
        String second;
        String third;
        
        if(name1.equals(name2)){
            System.out.println("The first and second name are the same.");   
            return;
        }
        else if(name1.equals(name3)){
            System.out.println("The first and third name are the same.");   
            return;
        }
        else if(name2.equals(name3)){
            System.out.println("The second and third name are the same.");   
            return;
        }
        else if(name1.compareTo(name2) < name2.compareTo(name1) && name1.compareTo(name3) < name3.compareTo(name1)){
            first = name1;
        }
        else if(name2.compareTo(name1) < name1.compareTo(name2) && name2.compareTo(name3) < name3.compareTo(name2)){
            first = name2;
        }
        else{ 
            first = name3;
        }
        
        if(first.equals(name1) && name2.compareTo(name3) < name3.compareTo(name2)){
            second = name2;
            third = name3;
        }
        else if(first.equals(name1) && name3.compareTo(name2) < name2.compareTo(name3)){
            second = name3;
            third = name2;
        }
        else if(first.equals(name2) && name1.compareTo(name3) < name3.compareTo(name1)){
            second = name1;
            third = name3;
        }
        else if(first.equals(name2) && name3.compareTo(name1) < name1.compareTo(name3)){
            second = name3;
            third = name1;
        }
        else if(first.equals(name3) && name1.compareTo(name2) < name2.compareTo(name1)){
            second = name1;
            third = name2;
        }
        else{
            second = name2;
            third = name1;
        }
        
        System.out.println("Here are the sorted names:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
      
        }
        
        
        
    }
    
