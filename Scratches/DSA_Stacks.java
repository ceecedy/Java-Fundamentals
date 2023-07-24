/*
    * DSA 4 
    * THIS PROGRAM WILL DEMONSTRATE THE USAGE OF STACKS IN DSA JAVA.
    * THIS PROGRAM WILL ALSO ACT AS ACTIVITY IN STACKS. 
 */

import java.util.Stack;

public class DSA_Stacks {

    public static void main(String[] args) {
        
        Stack<Integer> implementStack = new Stack<Integer>();

        // pushing integer objects. inside the Stack. 
        implementStack.push(13);
        implementStack.push(15);
        implementStack.push(17);
        implementStack.push(19);
        implementStack.push(21);

        // Printing the current stacks after pushing some integer objects.
        System.out.println();
        System.out.println("Stack Status as if 1st pushing :");
        System.out.println(implementStack);
        System.out.println();

        // Getting the index of stacks while printing the corresponding value of it. 
        System.out.println("Stack Values with their Indexes (1st pushing) : ");
        for (int i = 0; i < implementStack.size(); i++) 
            System.out.println("Index " + i + " : " + implementStack.get(i));
        System.out.println();

        // Getting the current capacity of the ArrayList that is used on the stack.
        System.out.println("Current capacity of Stack (1st pushing) : ");
        System.out.println(implementStack.capacity());
        System.out.println();

        // Getting a peak on the top-most object in the stack. 
        System.out.println("Peaking on the top-most object in the Stack (1st pushing) : ");
        System.out.println(implementStack.peek());
        System.out.println();

        // Removing element in the stack. 
        System.out.println("Removing element in a stack (1st pushing) : ");
        System.out.println(implementStack.pop()); // This will remove the top-most element in the stack.
        System.out.println();

        // Removing specific element in the stack. 
        System.out.println("Removing specific element in the stack (1st pushing) : ");
        System.out.println(implementStack.remove(1));
        System.out.println();

        // Re-printing the updated stack status. 
        System.out.println("Stack Status after removing : ");
        System.out.println(implementStack);
        System.out.println();

        /*
            * Essence of using Stacks.
                - Back and forward buttons in a web browser:
                    - The back and forward buttons on browser can be really handy for navigating between pages. 
                        We can implement these buttons by maintaining two separate stacks. Here, we use one stack 
                        (back stack) to track links to the previously visited pages, and another stack (forward stack) 
                        to track links to the pages we have navigated away from but may want to revisit.
                - UNDO/REDO functionality in text editors and image editing software:
                    - The UNDO/REDO functionality in text editors and image editing software can be implemented using two 
                    separate stacks: one for undo and one for redo. Every time we perform an action on the document or image, 
                    a new record containing information about the action is created and added to the top of the undo stack.
                - Memory management in computer programming:
                    - Stack can be used in systems where memory is allocated in a static way to manage memory allocation or 
                    track which memory blocks are in use. It can also be used to keep track of function calls in a program 
                    and ensure that the program returns to the correct location when a function is complete. 
                    For example, the Java Virtual Machine (JVM) uses this concept in keeping track of the state of a running 
                    Java program.
         */
        
        // -------------------------------------------------------------------------------------------- // 


    }
    
}
