/*
    * DEMONSTRATION OF INSERTION SORT  
 */

import java.util.Arrays; // calling this class to use array functions.

public class DSA_InsertionSort {
    
    public static void main(String[] args) {
        
        // Declaration of array that has size of 15. 
        int[] array = {23, 58, 14, 77, 32, 69, 83, 2, 47, 91, 10, 35, 66, 19, 72};

        // Printing the Unsorted array.
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(array));
        System.out.println(); // spacing. 

        // Calling out the Insertion sort function. 
        insertionSort(array);
        
        // Printing the Sorted Array using Insertion sort
        System.out.println("Sorted Array using Insertion Sort:");
        System.out.println(Arrays.toString(array));
        System.out.println(); // spacing.

    }

    private static void insertionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

    }
}
