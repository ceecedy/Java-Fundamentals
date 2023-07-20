/*
    * THIS PROGRAM WILL DEMONSTRATE RUNNABLE INTERFACE IN JAVA. AN INTERFACE THAT IMPLEMENTED IN THREAD. 
 */

class A implements Runnable {

    public void run() {

        for (int i = 0; i < 10; i++) 
            System.out.println("Hi");

        try {
            Thread.sleep(10);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}

class B implements Runnable {

    public void run() {

        for (int i = 0; i < 10; i++) 
            System.out.println("Hello");
        
        try {
            Thread.sleep(10);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

public class RunnableThread {
    
    public static void main(String[] args) {

        /* 
            When using runnable method, the way we instantiate our class will be different. The object we will declare 
                should be referenced to the interface Runnable and should be classified as the class we made. It needs 
                to be referenced to the interface Runnable for to be able to pass the object to the created thread. 
                Threads are only accepting object Runnable. 
        */ 
        
        // Here's the implementation.
        Runnable aA = new A();
        Runnable bB = new B();

        /*
            Since we are using runnable interface, we can't have a direct access to the methods of Thread especially the 
                'start()' method. We need to instantiate thread so we can use the 'start()' method. 
        */

        Thread a1 = new Thread(aA);
        Thread b2 = new Thread(bB);

        // After instantiating, we can now finally use 'start()' method that is essential for the thread implementation to run.
        a1.start();
        b2.start();

    }
}

/*
    - Interrupted exception is an exception that handles the thread errors. 
    * Since Runnable is a Functional Interface, it is possible to create lambda expression or anonymous class while 
        instantiating the Runanble interface.
 */
