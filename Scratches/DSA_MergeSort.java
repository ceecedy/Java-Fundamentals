/*
    * DEMONSTRATION OF MERGE SORT    
 */

import java.util.Arrays; // used for array methods for easy printing. 

public class DSA_MergeSort {

    public static void main(String[] args) {
        
        // MERGE SORT
        /*
            * Always remember the divide and conquer concept. Divide and Conquer is the concept of Merge sorting. 
            * It divides the array first until all the indexes becomes one array unit size. 
            * And when the original array breaks into one pieces, there will be left and right which is first element and 
                second element respectively to be compared if who's larger and then that comparison will form up an array
                where both elements are sorted. 
            * The divide part will be continiously repeated until all elements breaks into one pieces. 
            * The conquer part or the sorting part will be repeated until it forms the original array that is now all
                sorted. There will be always original array, left array, and right array when doing this part. And the goal
                is to have one original array.    
            * "Recursion" is crucial to merge sorting. Recursion mainly used in this sorting method. 
         */

        // Implementation of array
        int[] array = {23, 58, 14, 77, 32, 69, 83, 2, 47, 91, 10, 35, 66, 19, 72};

        // Printing the unsorted array. 
        System.out.println("Unsorted Array : ");
        System.out.println(Arrays.toString(array));
        System.out.println(); // spacing

        // Sorting the array using merge sort. 
        mergeSort(array);

        // Printing the sorted array 
        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(array));
        System.out.println(); // spacing.

    }

    private static void mergeSort(int[] array) {

        // Divide Part  

        int arrayOriginalLength = array.length;
        // Base Case 
        if (arrayOriginalLength <= 1)
            return; // when the original array is equal or less than to 1, then the operation of division is comlete.

        // middle variable will serve as the division result of the original array. 
        int middle = arrayOriginalLength / 2;
        // left array variable will take the half value of the original array which is the middle. 
        int[] leftArray = new int[middle];
        // right array will take the other half of the original array by decreasing the value of original array to the 
        // middle value. This is the way of getting of the other half value for sometimes the size of array does not 
        // even or can be divided by 2.  
        int[] rightArray = new int[arrayOriginalLength - middle];

        // when dividing the original array this is how we get the value of both sizes. 

        // first we have to make indexes to track the index of left and right part of the array. 
        int l = 0; // left array
        int r = 0; // right array 

        // the for loop here has no initialization for it was initalize already. the l variable. 
        // it will loop the original array and distribute its value to the declared left and right array. 
        for (; l < arrayOriginalLength; l++) {
            // since the middle is the index value of the left side, the original array will traverse its indexes with the
            // use of l variable until l variable matches the equal value of the middle. 
            if (l < middle) {
                // while traversing, the original array will give its element to the left array. 
                leftArray[l] = array[l];    
            }
            // when the l meets the middle value, the original array will then share its other half element to the 
            // right array. 
            else {
                rightArray[r] = array[l];
                r++;
            }
        }

        // After dividing and giving the elements, call the method itself until the original array breaks into one piece.
        // it should start on left array and then right. 
        mergeSort(leftArray);
        mergeSort(rightArray);

        // After the dividing part, now is the time to call the conquer part or the actual sort and merge part. 
        actualMerge(leftArray, rightArray, array);

    }

    private static void actualMerge(int[] leftArray, int[] rightArray, int[] originalArray) {

        // Conquer Part 

        int leftSize = originalArray.length / 2;
        int rightSize = originalArray.length - leftSize;

        // making indexes to track the leftsize, rightsize, and the orignal array size. 
        int i = 0; // original array 
        int l = 0; // left array
        int r = 0; // right array 

        // checking the conditions for merging. 

        // comparing the left and right array on their values.
        // while the left array index tracker l does not meet its left size value and
        // while the right array index tracker r does not meet its right size value, continue parsing on both array. 
        while (l < leftSize && r < rightSize) {

            // while parsing, if the element in the specific index in the left array is lower on the specific index in the 
            // right array, then give that specific value back to the original array. 
            if (leftArray[l] < rightArray[r]) {
                originalArray[i] = leftArray[l];
                i++; 
                l++;
            }
            // otherwise, give the original array the specific index from the right that is respectively compared to the left.
            else {
                originalArray[i] = rightArray[r];
                i++; 
                r++;
            }
                
        }

        // there were situations that either left or right array will be left out for the array is not even. If that is the
        // case, we have to make their own conditions. 
        while (l < leftSize) {
            originalArray[i] = leftArray[l];
            i++; 
            l++;
        }
        while (r < rightSize) {
            originalArray[i] = rightArray[r];
            i++; 
            r++;
        }
        
    }
    
}
