/*
    * THIS PROGRAM WILL DEMONSTRATE THE USAGE OF JOIN METHOD OF THREAD. 
    * THIS PROGRAM WILL ALSO PERFORM RUNNABLE THREAD WITH LAMBDA EXPRESSION.
 */

class Total {
    
    int count = 0;

    // Synchronized keyword ensures that there's only one entitty that calles this particular method at the time.   
    public synchronized void operator() {

        count++;

    }
}

public class RaceThread {

    public static void main(String[] args) {

        /*
            - Instantiating the created class here. And this variable 'jatot' that is referenced to class 'Total',
                will be accessible to everyone on this method main.  
         */
        Total jatot = new Total();

        Runnable Total = () -> {
                
            for(int i = 0; i < 100; i++) 
                jatot.operator();
                
        };

        // Creating two threads that calls one Runnable object so it can simulate two process at one mutable data.
        Thread t1 = new Thread(Total);
        Thread t2 = new Thread(Total);

        // Start method is essential to be called for the thread to start running.
        t1.start();
        t2.start();

        try {
            // Join method from Class Thread will work until its process dies or finished. 
            t1.join();
            t2.join();
            // So it happens here that thread t1 counts up until to 100 first and followed by the t2.
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        // This is to output the current count after working with two threads processes.
        System.out.println(jatot.count);
    }
    
}
