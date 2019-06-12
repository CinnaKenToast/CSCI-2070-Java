//Kenneth Shipley
//CSCI 2070-08
//March 27, 2018
//This program is an amazing lottery program where a user can win as much money as they want because they decide the winning lottery numbers
package kennethshipley2070assignment11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] winning = new int[5];
        int[] user = new int[5];
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Ken's Winning Lottery Picker\n");
        System.out.println("Enter the five numbers from 1 to 50 of the winning draw.");
        
        for(int i = 0; i < 5; i++){
            System.out.print("Enter winning draw number " + (i+1) + ": ");
            winning[i] = scan.nextInt();
        }
        
        System.out.println();
        
        System.out.println("Enter the five numbers from 1 to 50 of you ticket.");
        for(int i = 0; i < 5; i++){
            System.out.print("Enter ticket number " + (i+1) + ": ");
            user[i] = scan.nextInt();
        }
        
        System.out.println();
        
        if(isPerfectMatch(winning, user)){
            System.out.println("Your ticket matches the winning ticket.. Cheater..");
        }
        else{
            System.out.println("Your ticket does not match the winning ticket. " + countMatchingNumbers(winning, user) + " number(s) match.");
        }
    }
    
    /**
     * Precondition: Both arrays passed in must have a length of 5
     * Postcondition: None
     * 
     * @param win Integer array with a length of 5.
     * @param chosen Integer array with a length of 5.
     * @return True if two arrays match, otherwise return false.
     */
    public static boolean isPerfectMatch(int[] win, int[] chosen){
        for(int i = 0; i < 5; i++){
            if(win[i] != chosen[i]){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Precondition: Both arrays passed in must have a length of 5
     * Postcondition: None
     * 
     * @param win Integer array with a length of 5.
     * @param chosen Integer array with a length of 5.
     * @return Count, an integer that equals the number of elements that match in each array without order in consideration
     */
    public static int countMatchingNumbers(int[] win, int[] chosen){
        int count = 0;
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(win[i] == chosen[j]){
                    count += 1;
                }
            }
        }
        
        return count;
    }
    
}
