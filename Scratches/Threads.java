/*
    * This program will demonstrate Threads in java. 
 */

// TO BE ABLE TO USE THREADS, CLASSES MUST EXTENDS 'Thread'
class A extends Thread {

    public void run() {

        for (int i = 0; i < 5; i++) 
            System.out.println("Run");

        try {
            Thread.sleep(10);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}

class B extends Thread {

    public void run() {
        
        for (int i = 0; i < 5; i++) 
            System.out.println("Walk");
        
        try {
            Thread.sleep(10);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    
    }
}

public class Threads {
    
    public static void main(String[] args) {
        
        B b = new B();
        A a = new A();
    
        /*
            "setPriority" is a method from class Thread that will assign an object to have a specific priority.
            "Thread.MAX_PRIORITY" is a method from from class thread that gives the max priority of one object.
         */
        a.setPriority(Thread.MAX_PRIORITY);

        /*
            a.start();
            try {
                a.join(); // Wait for thread 'a' to finish before starting thread 'b'
                // join method is a member of Class Thread methods also. This is used to let other objects to finish their
                // task first before executing another objects.
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        */

        a.start();
        b.start();
        try {
            Thread.sleep(2);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
            Setting max priority and thread sleep in this code is actually demonstrating to print the code in sequence.
            But since this device is powerful enough to be so fast, printing simultaneously is not happening.
         */
    }
}

/*
    * THREADS *
        - Threads in java separates the flow of execution in the program. It allows to run tasks at the same time in a 
            different threads. making it possible to perform several operations simultaneously. 
        - This was used mostly in frameworks, programmers are not required to do it on their own because frameworks 
            provides it. 
        - Threads are mainly used to improve the responsiveness of the application. 
        - In every thread, you need a run method. That's how thread classes works.
        - Important key to note in threads is that, threads will run dependent on your machine. So if you create custom
            threads, it may depent to the threads which will run faster. For those who can execute faster, they may be 
            outputted first.
        - For whoever object was firstly instantiated, they will be the ones who will get prioritize in running since they
            will get the right to have the first thread. 
            - So if b object referenced in B class was firstly instantiated, sure enough that b will have the first thread
                and b will be the first to run.
 */