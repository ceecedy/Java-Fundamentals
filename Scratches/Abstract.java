/*
    Abstract demonstration
 */

abstract class Laptop {

    public abstract void Code();

    public void playMusic() {

        System.out.println("I can play music at any volumes I want.");
    }
}

class Macbook extends Laptop {

    public void Code() {

        System.out.println("I can code and make wonderful apps.");
    }
}

public class Abstract {

    public static void main(String[] args) {

        Laptop mac = new Macbook();

        // Using polymorphism so that Code method can be used. 

        mac.Code();
        mac.playMusic();
    
    }
}

/*
    * ABSTRACT KEYWORD IN JAVA *
    - abstract is used in java when you don't know how to define one method in your superclass. Especially if there is a 
        case of having multuple subclassses that needs to refer to the super class. 
    - To have an abstract method in the super class, the super class itself should be declared as abstract and the methods
        that needs to be asbstracted. 
    - The subclasses that will refer to the abstract methods from the superclass should inherit first the super class.
    - Now when creating the method's logic or the code in the subclasses, the method should not be declared as abstract 
        anymore. 
    - POLYMORPHISM IS REQUIRED TO ACCESS THE SPECIFIC METHODS INHERITED TO THE SUPER CLASSES.
    - Abstract classes cannot be directly instantiated using the new keyword. Abstract classes are meant to be extended 
        by other classes, and you can only create instances of concrete subclasses.
    - When you declare an abstract method in an abstract class, it is required to declared it explicitly on every class who
        will inherit it. 
 */