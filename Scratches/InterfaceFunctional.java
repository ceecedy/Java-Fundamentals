/*
    * This is to demonstrate functional interface in java * 
 */

 @FunctionalInterface
interface sample {
    void A();
}

class B implements sample {

    public void A() {
        
        System.out.println("Void");
    }
}

public class InterfaceFunctional {
    
    public static void main(String[] args) {
        
        B b = new B();
        b.A();
    }
}

/*
    * FUNCTIONAL INTERFACE *
    - This is used when you declare an Interface and when you want to make sure that you will only declare one method. 
 */