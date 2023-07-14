/*
    Demonstration of Wrapper Classes. 
 */


public class WrapperClasses {

    public static void main(String[] args) {
        
        int num = 10;

        Integer num1 = num; // this is how you implement a wrapper class of int. 

        /*
            - Integer example above is called 'boxing'. It wraps the primitive type int to become a Object integer. 
            - but since we give the primitive int data num to integer directly, we can call it 'autoboxing'.
         */

         int num2 = num1.intValue(); // Unboxing concept. 

         // the num2 implementation has a concept of 'unboxing'. we literally pass the object integer value to a 
         // primitive int so it unwrapped from being an object. 

        System.out.println(num1);
        System.out.println(num2);

        // Demonstration of using one of the methods of class Integer. 

        String string = "12";

        int num3 = Integer.parseInt(string); // the string becomes an int that is passed to a primitive int value.

        System.out.println(num3 + 3);
    }
    
}
