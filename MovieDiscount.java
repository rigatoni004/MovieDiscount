/*
 * Programmer: Riley Wilson
 * Date: October 5, 2020
 * Purpose: To print the cost of someone's ticket depending on their age and coupon
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the side lengths
        System.err.print("How old are you? ");
        int age = input.nextInt();
     
        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        
        boolean coupon = input.nextBoolean();
        
        // Print the cost of a movie ticket
        if (age < 13 || age > 65) {
        	if (coupon == true) { 
        		System.out.println("Your ticket costs $9.5."); 	
        	}
        	else {
        		System.out.println("Your ticket costs $11.5.");
        	}
        }
        if ((age > 13 && age < 65) && coupon == true) {
        	System.out.println("Your ticket costs $12.5.");
        }
        if ((age > 13 && age < 65) && coupon == false) {
        	System.out.println("Your ticket costs $14.5.");
        }
    }
 
}


