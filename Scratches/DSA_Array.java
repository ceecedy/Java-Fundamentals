/*
    * DSA 1
    * THIS PROGRAM WILL DEMONSTRATE THE USAGE OF ARRAYS IN DATA STRUCTURES AND ALGO IN JAVA. 
    * REGULAR ARRAYS
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DSA_Array {

    public static void main(String[] args) {
        
        // ********************************************************************************************************* // 

        // Regular implementation of arrays 

        // Implementation of array 
        String[] names = new String[5];
        
        // Declaring counter variable for index count
        int j = 0;

        // Will use the class Scanner to take inputs from the user. 
        Scanner userInput = new Scanner(System.in); // System.in is essential as a parameter in order to the user input to work.

        System.out.println("Please enter the names : ");
        for (int i = 0; i < names.length; i++) 
            names[i] = userInput.nextLine();

        System.out.println(); // Just to have space 

        // Outputting the names inputted by the user.
        System.out.println("Outputting names using enhanced for-loop : ");
        for (String everyNames : names) {
            System.out.println("Name at Index " + j + " : " + everyNames);
            j++;
        }
        System.out.println(); // Just to have space. 

        userInput.close(); // It is important to close the scanner always to prevent leakages.

        // ********************************************************************************************************* //

        // Trying to change values in the existing array. 
        
        //Actual changing of values. 
        names[4] = "Frans";

        //Using one of the Array methods from Array package to print all new values.
        System.out.println("Outputting all values in the array names using a toString function from class Arrays : ");
        System.out.println(Arrays.toString(names));
        System.out.println(); // Just to have space

        /*
            * Arrays.toString(Object) 
                - It is one from the Arrays package or class that has methods involving arrays. This 'toString()' method 
                    will output every value of one array.
         */

        // ********************************************************************************************************* //

        // Arrays of numbers (int)
        int[] numbers = new int[5];
        numbers[0] = 32;
        numbers[1] = 46;
        numbers[2] = 25;

        // declaring a counter variable. 
        j = 0; // Declaring j == 0 here to be able to be used here in second iteration.
        
        System.out.println("Outputting all numbers using enhanced for-loop : ");
        for (int i : numbers) {
            System.out.println("Number at Index " + j + " : " + i);
            j++;
        }
        System.out.println();

        // ********************************************************************************************************* //

        // Reversing output using full logic idea and method. 

        System.out.println("Outputting current array names in Reverse : ");
        Collections.reverse(Arrays.asList(names));
        System.out.println(Arrays.asList(names));
        System.out.println(); // Just to have space.
        /*
            The collection reverse method needs to have a parameter of List. So we make the array name as list.  
            And since we didn't pass the created list on array name, on printing it we have to call the list as how
                we make the array names to become a list. 
         */

        System.out.println("Outputting the array of numbers in Reverse : ");
        // Need to less 1 at the numbers.length for it will result out of bounds to the current array of numbers that has 5.
        for (int i = numbers.length - 1; i >= 0; i--) 
            System.out.println("Number at Index " + i + " : " + numbers[i]);
        System.out.println(); // Just to have space.

        // ********************************************************************************************************* //

    }
    
}

/*
    * Take note that in a string array in Java, if there are indexes that has no value, it will result of none. Whereas at
        integer, it will result as '0' (zero).
    * Collections (java.util.Collections)
        - A Class that has multiple functions relating to data management. It can be linked list, and many more. 
    
 */