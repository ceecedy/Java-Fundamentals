/*
    * This program will demonstrate everything about exception handling. 
 */

// CUSTOM EXCEPTION CLASS
// When creating custom exception, you can only extend it to 2 super classes, 'RuntimeException' and 'Exception'
class RyanException extends Exception {

    // It needs to have a constructor in order to have an output.
    public RyanException(String msg) {

        // Now it needs to call super to call the main constructor from the parent class in order for the argument 
        // msg to be processed.
        super(msg);
    }
}

public class ExceptionHandling {

    // method named divide inside main to be used as sample of ducking exception.
    public int divide(int a, int b) throws ArithmeticException {

       if (a / b == 0) {
            throw new ArithmeticException("Cannot be divided if denominator is greater than numerator.");
       }
       else 
            return a / b;

    }

    // method named array inside main to be used as sample of ducking exception.
    public int array(int a) throws ArrayIndexOutOfBoundsException {
        
        int[] arr = new int[a];
        return arr[10];

    }

    
    public static void main(String[] args) {
        
        // ********************************************************************************************************* //

        // Using exception handling by basic try and catch. 

        System.out.println("\nUsing simple Exception Handling (try and catch):");
        int i = 0, j = 0;

        try {
            j = 18/i;
        }
        catch(Exception e) {
            System.out.println("Something went wrong" + " Result : " + j);
        }

        System.out.println("See if it goes even here...");
        System.out.println();

        // ********************************************************************************************************* //

        //Using exception handling by showing the error encountered at runtime.
        int[] nums = new int[5];

        System.out.println("Using simple Exception Handling with show specific error case:");
        try {
            System.out.println(nums[0]);
            System.out.println(nums[6]);
        }
        catch(Exception e) {
            System.out.println("Something went wrong : " + e);
            System.out.println();
        }

        // ********************************************************************************************************* //
        
        //Using exception handling by having multiple catch
        System.out.println("Using exception handling by having multiple catch cases:");
        
        try {
            j = 22/i;
            System.out.println(nums[10]);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot be divided by zero. Actually the answer is one if you refer to the math.");
            System.out.println("Showing the compiler issue : " + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array over limit.");
            System.out.println("Showing the compiler issue : " + e);
        }
        System.out.println();

        // ********************************************************************************************************* //

        // Using throw exception 
        System.out.println("Using throw exception under try method:");
        try {
            j = 20/25;
            if (j == 0) {
                // Throw method will be used 
                throw new ArithmeticException("If Denominator is bigger than numerator, it cannot be divided.");
            }
        }
        catch(Exception e) {
            System.out.println("Division is not possible " + e);
        }
        System.out.println();

        // ********************************************************************************************************* //

        // Using custom exception. (Yung ikaw mismo gagawa ng exception mo.)
        System.out.println("Using custom exception under throw method:");
        try {
            j = 20/30;
            if (j == 0) {
                // Custom exception will be used with the help of throw.
                throw new RyanException("Sabi ni Ryan Bawal.");
            }
        }
        catch(RyanException r) {
            System.out.println("If Denominator is bigger than numerator, it cannot be divided." + r);
        }
        System.out.println();

        // ********************************************************************************************************* //

        // Using ducking exception. Runtime Errors on division.
        System.out.println("Using ducking exception under try method (Runtime Errors on Division):");
        try {
            ExceptionHandling duck = new ExceptionHandling();
            System.out.println("Result : " + duck.divide(5, 10));
        }
        catch(ArithmeticException e) {
            System.out.println("Something went wrong. " + e);
        }
        System.out.println();

        // Using ducking exception. Runtime Errors on Array.
        System.out.println("Using ducking exception under try method (Runtime Errors on Arrays):");
        try {
            ExceptionHandling duck2 = new ExceptionHandling();
            duck2.array(5);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Encountered : " + e);
        }

        // ********************************************************************************************************* //

    }
}

/*
    * EXCEPTION HANDLING *
    - It occurs in runtime error. 
    - With the help of exception handling, the execution may still continue even if there's an error in runtime. 
    - The argument in catch which was "Exception e" where 'Exception' is a type of class and 'e' was the object of it
        gives you the specific error encountered.
    - You can have multiple catch in one try and catch scenarios. You can be very specific to your exception. Just like 
        the code above, when having a runtime error involving math, it should be on arithmetic exception. When having an
        error involving Arrays, it should be on Array exceptions. There are multiple array exceptions tho.
    - Take note that there's only one catch statement that can be thrown at a time in runtime execution.
    - Throw method is a kind of catch method but used in operations under try method. Basically it helps you to 
        specifically find out more runtime error that will be printed in the catch block.
    - You can even make your own exception using throw and by creating your own error class that extends the Exception
        class. Refer to the code that involves custom exception above. Refer also to the class 'RyanException' for you 
        to see how it was made.
    * DUCKING EXCEPTION *
    - This is possible with the use of keyword 'throws' rather than throw. 
    - The idea of ducking exception is that, when you have nested methods that calls one another and the methods that 
        are in the bottom or in the last call are having critical statement that needs exception handling, you can just
        implement the try and catch exception handling at the highest method where it starts calling methods one another.
        But take note that other methods that has critical statements and needs to be checked needs to have extension to 
        their method declaration named "throws (kindOfException)"
 */