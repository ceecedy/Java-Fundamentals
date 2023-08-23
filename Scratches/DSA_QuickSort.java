/*
    * DEMONSTRATION OF QUICK SORT       
 */

import java.util.Arrays; // imported to use toString() method. 

public class DSA_QuickSort {

    public static void main(String[] args) {
        
        // QUICK SORT
        /*
            * There's a "pivot" used in the quick sort algorithm. It tells where the loop will stop traversing. 
            * Pivot was typically setup in the very last element of the array. 
            * The goal of the quick sort is to make the pivot find its resting place. 
            * When pivot finds it resting place, the all left part of the pivot is taken and also is the right part. 
            * Left part and right part will have their own pivot - repeating the same process as the first process does. 
            
            * There should be two trackers traversing the array in the quick sort. If the leading tracker gets an element 
                and that element is "lessthan to the pivot element, then the following tracker will move to the next index".
                On the other hand, if the leading tracker gets an element which was "greater than or equal to the pivot 
                element, then the leading tracker will move to the next index." After one moving of either tracker happens, 
                they are bound to get swapped. After swapping, the leading tracker will automatically move to the next index,
                and see again if its less than or (greater or equal) to the pivot. 
            * After all above processes, if the "leading tracker" reaches the pivot index, the following tracker will move to
                the next index and the pivot which was the leading tracker now and the following tracker are about to get 
                swapped. And that's how you find the pivot's resting place. 
            * After finding the first pivot resting place, the all left part of the pivot will be treated as partition and 
                also the all right part. On the partitions, another choice of pivot and another traversal while swapping 
                going to happen. 
            
            * Quick sort is also a divide and conquer concept and it uses recursion.
         */

        // Making the array 
        int[] array = {23, 58, 14, 77, 32, 69, 83, 2, 47, 91, 10, 35, 66, 19, 72};

        // Printing the unsorted array. 
        System.out.println("Unsorted Array : ");
        System.out.println(Arrays.toString(array));
        System.out.println(); // spacing.

        // Calling out the quick sort function to sort the array. 
        quickSort(array, 0, array.length - 1);

        // Printing the sorted array using quicksort. 
        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(array));
        System.out.println(); // spacing.

    }

    public static void quickSort(int[] array, int start, int end) {

        // Making the partition stars on at this. 

        // Base case of the quicksort. 
        if (end <= start) 
            return;
        // As you get the partition after reaching and swapping the pivot, the end partition will reach zero or 1 
        // upon repeating the steps. If it happens, the partitions taken on every steps can go back to the original array
        // and sorted. 

        // this call of the method will make the array sorted and find the pivot so the elements on the left will be smaller
        // than the pivot and the elements of the right will be bigger than the pivot.
        int pivot = partition(array, start, end);

        // after finding out the location the pivot, we can pass the partition. 
        // this is for the left partition. 
        quickSort(array, start, pivot - 1);
        // the parameter passed to the argument end will be "pivot -1" so the array can actually make the partition less 
        // than the pivot index. 

        // this one is for the right partition
        quickSort(array, pivot + 1, end);
        // the parameter passed to the argument start will be "pivot + 1" so the array can actually make the partition 
        // greater than the pivot index. 


        
    }

    // this will return int for it gives the location of the pivot. 
    public static int partition(int[] array, int start, int end) {

        // this is where the sorting, partitioning, and new pivoting begins. 

        int pivot = array[end];
        // pivot is always at the end of the array. 
        // the value of end here is the length of the original array for every partition made. 

        int i = start - 1; 
        // the i is the following tracker of the ones who traverse the array and the partitions array. 

        // then we will create the leading tracker which is named j. It will have the to function loop as the 
        // leading tracker will decide how to swap and when to move. 
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                // if it finds out that the element currently holding by the leading tracker is less than the pivot value,
                // then the following tracker will move (increment) to the next index and will perform swapping.
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // when the loop above is done, it means the leading tracker meets the pivot index. It will then move (increment)
        // the following tracker and will perform swapping to the leading tracker to move the pivot value into its 
        // resting place. 
        i++; 
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        
        // the following tracker is the result of this partition method. 
        // The following tracker holds the pivot value and this following tracker index will decide the left and right 
        // partition.
        return i;

    }
    
}
