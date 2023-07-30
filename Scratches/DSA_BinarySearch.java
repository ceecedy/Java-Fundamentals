/*
    * THIS PROGRAM WILL DEMONSTRATE THE BINARY SEARCH.
 */

public class DSA_BinarySearch {
    
    public static void main(String[] args) {

        // Declaring the array of nums to 100 indexes.
        int[] arrayNums = new int[100];

        // Adding values to the indexes of array. 
        for (int i = 0; i < arrayNums.length; i++)
            arrayNums[i] = i * 2;

        // Calling the binarySearch method to find the passed argument 
        int res = binarySearch(arrayNums, 100);

        // If parameter was not found. 
        if (res == -1) System.out.println("Element 100 is not found in the array");
        // If element was found.
        else  {
            System.out.println();
            System.out.println("Element 100 is found at index " + res );
        }
        
    }

    private static int binarySearch(int[] arrayNums, int target) {

        /*
            - It is essential to the binarySearching that the first and last index are known. 
                For to be able to identiy the middle index. Since middle index is the acting 
                result or match to the binarySearch.  
        */ 

        // Declaring low and high and middle. 
        int firstIndex = 0, middle;
        // It is essential to decrease the length of array to 1 in order for it to work.
        int lastIndex = arrayNums.length - 1; 
        int count = 0; // just for iteration count.

        // * Iterate until first and last index is equal. 
        // * If first and last index gets equal, then the iteration meets the very long possible searching.
        // * These two indexes will be the minuend and subtrahend for the middle. 
        while (firstIndex <= lastIndex) {
            // Formula to find the middle index. 
            middle = (firstIndex + lastIndex) / 2;
            // declaring another int to get every middle values for every middle index changes. 
            int value = arrayNums[middle];
            System.out.println("Count : [" + count + "] : " + value);
            count++;
            
            // Checking if the current middle value is less than the target. 
            if (value < target) {
                // If so, then add the current middle index to one and assign it to first index.
                firstIndex = middle + 1;
            }
            // Checking if the current middle value is equal to the target. 
            else if (value == target) {
                // if so, return the current middle index to the ones who called this method.
                return middle;
            }
            // else, probably, the current middle value is greater than the target.
            else {
                // If so, reduce the current middle to one and assign it to the lastIndex.
                lastIndex = middle - 1;
            }
        }

        // If not found, return negative 1 as sign of failed satisfaction.
        return -1;
    }
    
}
