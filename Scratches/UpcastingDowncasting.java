/* 
    Demonstration of using Downcasting and Upcasting.
 */

class A {

    public void show1() {
        System.out.println("I'm at Show 1.");
    }
}

// CLASS B INHERITS CLASS A
class B extends A { 

    public void show2() {
        System.out.println("I'm at Show 2.");
    }
}

public class UpcastingDowncasting {

    public static void main(String[] args) {
        
        // demonstration of using typcasting
        double number = 99.99;

        System.out.println((int)number); // printing a double variable on int form using typecasting.
        
        // Performing upcasting in runtime polymorphism using typecasting.
        A a = (B) new A(); // the new A() will become B for it is typecasted. 
        a.show1();

        // tho you don't have to mention the '(B)' in this case for it is implicitly happens when implementing 
        // polymorphism. 

        // Performing downcasting in runtime polymorphism using typecasting.

        B b = (B) a; // THIS IS TO DOWNCAST THE 'a' as it referenced to superclass A. So it can call show 2.
        b.show2();
        
        // ON THIS, 'show1' can be called using 'b' also for class B is inheriting the super class A.
    }
}