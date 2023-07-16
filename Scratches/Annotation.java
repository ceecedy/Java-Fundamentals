/*
    * This is to demonstrate annotations.
 */

class A {

    public void showTheDataWhichBelongsToThisClass() {

       System.out.println("A show");
    }
}

class B extends A {

    /*  When overriding a method in a predecessor class, '@Override' term is helpful to help the compiler understand better
            that you are trying to override a method.
    */
    @Override
    public void showTheDataWhichBelongsToThisClass() {

        System.out.println("B show");
    }
}


public class Annotation {

    public static void main(String[] args) {
        
        B newB = new B();
        
        newB.showTheDataWhichBelongsToThisClass();

    }
    
}

/*
    * ANNOTATIONS *
    - Supplement on runtime. Sometimes called metadata.   
 */
