/*
    * This program will demonstrate the input and output of user using System.in.read() and scanner. 
        with try catch and finally.
 */

// Scanner Class is under java utilities.
import java.io.IOException;
import java.util.Scanner;


public class UserIO {
    
    public static void main(String[] args) {
        
        // **************************************************************************************************** // 

        // Using "System.in.read()" as input acceptor.
        int arrSize = 0;
        
        System.out.println("\nEnter array size (this used simple \"System.in.read()\") : ");
        try {
            arrSize = System.in.read();
        }
        catch(IOException e) {
            System.out.println("Something went Wrong...");
        }

        System.out.println("The ascii value of entered value is : " + arrSize);
        System.out.println();

        // **************************************************************************************************** //

        // Using scanner as input reader 
        System.out.println("\nEnter array size (this is using Scanner) : ");

        //Instantiating the Scanner since scanner is a class. 
        Scanner inputScanner = new Scanner(System.in);
        // The input should be passed to a variable.
        int num = inputScanner.nextInt();
        // Output 
        System.out.println("The number you have is " + num + ". This will build an array of " + num);

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value for index " + i + " : ");
            array[i] = inputScanner.nextInt();
        }

        for (int values : array) {
            System.out.print(values + " ");
        }
        System.out.println();

        inputScanner.close(); // It is important to always close the scanner to prevent data leakages. 

        // **************************************************************************************************** //
        
    }

}

/*
    * User IO Discussion
    
    * Using "System.in.read()" actually returns a ascii value of what the user enters.  
        - Using 'system.in.read()' input reader will require you to perform exception handling because there's a limit
            of ascii values that are listed currently. So this will cover up potential errors. And the exception will
            be used is IOException that is under java.io
        - "System.in.read()" is also reading input one character at the time. So if you have multiple character inputs
            it will only accept the first character in your input. 
    
    * Using Scanner class. The main input reader to be used 
        - Since scanner is a class, it should be instanstiated. 
        - upon using the actual input reader, it should call the proper method to be use to read a value and it is needed 
            to be passed on to a primitive variable.
 */
