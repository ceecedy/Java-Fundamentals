/*
    * This program will demonstrate the Lambda Expression using interfaces and anonymous classes.  
 */

@FunctionalInterface
interface hi {
    void Hi();
}

@FunctionalInterface
interface operations {
    int add(int a, int b);
}

public class LambdaExp {
    
    public static void main(String[] args) {

        // ************************************************************************************************ // 

        // Demonstrating the printed Hi by implementing anonymous class. 
        System.out.println("\nPrinting the Hi using anonymous class:");
        hi Hi2 = new hi() {
            public void Hi() {
                System.out.println("Hi!");
            }
        };
        Hi2.Hi(); // to print the Hi from the anonymous class
        System.out.println();

        // ************************************************************************************************ // 

        // Demonstrating the printed Hi by implementing single line lambda expression. 
        System.out.println("\nPrinting the Hi using single line lambda expression:");
        hi Hi = () -> System.out.println("Hi!");
        Hi.Hi(); // to print the Hi from the anonymous class created in lamdda expression.
        System.out.println();

        // ************************************************************************************************ // 

        // Demonstrating regular or multiple line lambda expression. 
        operations add = (int a, int b) -> {
            System.out.println("Adding two numbers using lambda expression:");
            return a + b;
        };
        System.out.println(add.add(5, 5));
        System.out.println();

        // ************************************************************************************************ // 

        // Demonstrating lambda expression in very shortcut way. 
        operations add2 = (a, b) -> a + b; 
        // Lambda knows automatically the value of a and b.
        // when performing lambda expressions, return keyword will not work on single line lamdba expression.
        System.out.println("Adding two numbers using the very shortcut of lambda expression:");
        System.out.println(add2.add(5, 10));
        System.out.println();


    
    }
}

/*
    * Lambda Expression *
    - Lambda expression often used in anonymous classes to make a shortcut definition of the code. 
    - Lambda was used in this symbol (->). For example and its syntax, refer to the code above.   
    - When performing lambda expressions, return keyword will not work on single line lamdba expression.

 */