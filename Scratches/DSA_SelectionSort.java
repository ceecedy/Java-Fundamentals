/*
    * DEMONSTRATION OF SELECTION SORT IN JAVA.    
 */

import java.util.Arrays; // Importing this class to use array methods.

public class DSA_SelectionSort {
    
    public static void main(String[] args) {
        
        // Declaration of array of size 15. 
        int[] array = {8, 12, 23, 6, 41, 17, 9, 30, 14, 27, 5, 33, 20, 11, 38};

        // Printing the unsorted Array.
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(array));
        System.out.println(); // spacing

        // Sorting the Array using Selection Sort. 
        selectionSort(array);

        // Printing the Sorted Array via Selection Sort
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
        System.out.println(); // spacing

    }
    
    // custom method of selection sort. 
    private static void selectionSort(int[] array) {

        // This initial for loop will loop until the second to the last of the array.
        // There's no use of looping until the last index of the array when the array is 
        // all sorted when it reaches the last index. 
        // You will see the first loop that has minus -1 on its length because of the reason above. 
        for (int i = 0; i < array.length - 1; i++) {
            // we will hold the index per first iteration so that the start of swapping will start on the next iteration.
            int min = i;
            // this is the second iteration where there is comparison of the current min value "array[min]" 
            // and "array[j] - where this is the second iteration loop value."
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) 
                    // min will just get the index since the work of min is the holder of index. 
                    // if this second iteration finds that there is smaller value than the current min value, 
                    // it will get the index of that smaller value. 
                    min = j;
            }
            // Swapping Phase
            int temp = array[i]; // giving the min value (array[i]) to the temp.
            array[i] = array[min]; // giving the new current min value to current first iteration.
            array[min] = temp; // giving the min value to the last current min index value. 
        }
        
    }    

}
