/*
    * THIS PROGRAM WILL DEMONSTRATE LINEAR SEARCHING. 
 */

public class DSA_LinearSearch {
    
    public static void main(String[] args) {
        
        // Declaring an Array
        int[] nums = new int[20];

        // putting values in the indexes of the array nums.
        for (int i = 0; i < nums.length; i++)
            nums[i] = i * 2;

        // calling the method for linear searching. 
        int result = linearSearch(nums, 10);    

        // * if result is equal to negative 1, then from the method linearsearch,
        // * the argument i passed was not found. 
        if (result == -1) System.out.println("Element " + 10 + "was not found in the array.");

        // else, the element was found.
        else {
            System.out.println();
            System.out.println("Element " + 10 + " found at index [" + result + "]");
        } 

    }        

    private static int linearSearch(int[] nums, int target) {

        // will iterate every values of the array to locate if the parameter value is in the array.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        
        // will return negative 1 since negative 1 is a sign of failed satisfaction. 
        return -1;
        
    }
}
