/*
    * DEMONSTRATION OF RECURSION 
 */

 
public class DSA_Recursion {
    
    public static void main(String[] args) {

        // Recursion 
        /*
            * It is a method where it calls itself. 
            * Disadvantages
                * Slow performance
                * Eating too much memory 
            * Advantages 
                * Easier to Debug(?)
                * Easier to Read/Write
         */

        // Implementing Factorial numbers using Recursion. 
        System.out.println("5! is : ");
        System.out.println(factorialOfNum(5));
        System.out.println(); // spacing

        // Implementing Recursion into computing the power of the number. 
        System.out.println("3 raise to 3 is :");
        System.out.println(powerOfNumber(3, 3));
        System.out.println(); //spacing


    }

    private static int powerOfNumber(int base, int power) {
        
        // It is important to have a base case in every recursion method.
        // Base case tells when to stop the calls of recursion. 
        if (power < 1) 
            // It will return 1 when the calculation of the exponent is completed. 
            // So when it gets multiplied to the exponent result, it will not get zero. 
            return 1;
        else {
            // will coniniously call the base until power gets zero. 
            // On this case, the structure will be 3 * 3 * 3
            return base * powerOfNumber(base, power - 1);
        } 

    }

    // factorial Method using Recursion. 
    private static int factorialOfNum(int num) {

        // It is important to have a base case in every recursion method.
        // Base case tells when to stop the calls of recursion. 
        if (num < 1) 
            // it returns 1 if the recursion reaches zero since 0! is 1. 
            return 1;
        else 
            // it continiously returns to the method itself until the parameter reaches zero. 
            // the structure when it reaches zero will be like this :
            // 5 * 4 * 3 * 2 * 1  - where the multiplication starts with 1 and 2 because of the "call stack" in the program.
            return num * factorialOfNum(num - 1);

    }

}
