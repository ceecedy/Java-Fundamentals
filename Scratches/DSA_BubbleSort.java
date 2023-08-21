/*
    * THIS PROGRAM WILL DEMONSTRATE THE BUBBLE SORT    
 */

import java.util.Arrays;

public class DSA_BubbleSort {
    
    public static void main(String[] args) {

        // Declaration of array that needs to be sorted via bubble technique.
        int[] arrayOfNumbers = {37, 82, 15, 64, 93, 21, 58, 76, 12, 45, 89, 27, 63, 32, 70};

        // printing the unsorted Array 
        System.out.println("Unsorted Array : " + Arrays.toString(arrayOfNumbers));

        // Calling the 'bubbleSort' method to sort the 'arrayOfNumbers'
        bubbleSort(arrayOfNumbers);

        // After calling out the 'bubbleSort' method, print the sorted 'arrayOfNumbers'
        System.out.println("Sorted Array : " + Arrays.toString(arrayOfNumbers));

    }

    // the method 'bubbleSort'
    private static void bubbleSort(int[] arrayOfNumbers) {

        
        for (int i = 0; i < arrayOfNumbers.length - 1 ; i++) {
            for (int j = 0; j < arrayOfNumbers.length - i - 1; j++) {
                if (arrayOfNumbers[j] > arrayOfNumbers[j+1]) {
                    int temp = arrayOfNumbers[j+1];
                    arrayOfNumbers[j+1] = arrayOfNumbers[j];
                    arrayOfNumbers[j] = temp;
                }
            }
            
        }

    }
}

