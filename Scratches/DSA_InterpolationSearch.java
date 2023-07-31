/*
    * THIS PROGRAM WILL DEMONSTRATE IMPROVEMENT SOMEHOW IN BINARY SEARCH. 
    * THIS WAS CALLED "INTERPOLATION SEARCH" 
 */

public class DSA_InterpolationSearch {
    
    public static void main(String[] args) {
        
        // Declaring uniformly arranged data in the array of numbers.
        int[] arrayNumbers = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384};

        // * Calling the interpolation search method. Will pass the array and the value to be searched. 
        // * this will return either the index number of the target or -1 if the target was not found
        // *    in the array.
        int index = interpolationSearch(arrayNumbers, 8192);

        // If interpolation search method returns -1 and passed it to int index.
        if (index == -1) {
            // then print a statement where it says that the parameter element was not found in the array.
            System.out.println();
            System.out.println("The element was not found in the array.");
        }
        // If interpolation search method returns the index value of the parameter value
        else {
            // then print a statement where it says that the element is found at the specific index of the array. 
            System.out.println();
            System.out.println("The target was found at index : " + index);
        }
    }

    // Interpolation search method.
    private static int interpolationSearch(int[] arrayNumbers, int target) {

        // Methods of implementing the interpolation search.
        
        // Declare first the high and low indexes of the array. 
        int highIndex = arrayNumbers.length - 1;
        int lowIndex = 0;

        // Next, you should create your formula. 
        // You have to create a "while loop" for this formula. 
        /*
            * THE EXPLANATION OF WHILE LOOP IN THE INTERPOLATION SEARCH *
                - If the target is still greater or equal to the value of the interchanging array low bounds after a loop,
                - AND the target is still less than or equal to the value of interchanging array high bounds after a loop,
                - AND the low index is still less than or equal to the high index, then continue looping.
                - for every success iteration, the array will get shrink. 

            * TAKE NOTE THAT VALUES ARE BEING COMPARED IN THE FIRST TWO ARGUMENTS AND INDEXES IN THE LAST ARGUMENT *
         */
        while (target >= arrayNumbers[lowIndex] && target <= arrayNumbers[highIndex] && lowIndex <= highIndex) {
            
            // Formula to make the guess in this interpolation search. 
            /*
                * EXPLANATION TO THE FORMULA *
                 - the variable 'guess' will be used to passed the result of the formula formed by high and low index. 
                 - Now for the calculation of the guess, first we need to identify the range of values in the array 
                    for the given 'target'. 
                    * Range = arrayNumbers[highIndex] - arrayNumbers[lowIndex];
                 - Second, calculate the difference between the 'target' and the value at the 'lowIndex'.
                    * DifferenceLow = target - arrayNumbers[lowIndex]
                 - Third, Calculate the position of the 'target' relative to the range of values.
                    * RelativePosition = DifferenceLow / Range
                 - Fourth, Scale the 'RelativePosition' by the size of the search range.
                    * ScaledPosition = RelativePosition * (highIndex - lowIndex)
                 - Fifth, Estimate the position of the 'target' by adding the scaled position to the 'lowIndex'.
                    * guess = lowIndex + ScaledPosition
             */
            int probe = lowIndex + (highIndex - lowIndex) * (target - arrayNumbers[lowIndex]) 
                        / (arrayNumbers[highIndex] - arrayNumbers[lowIndex]);

            // This print statement will just show how many iteration will the loop do. 
            System.out.println("guess : " + probe);

            // making a conditional statements if the guess is equal to the target. 
            // If the guess was higher to the target then change the high index. 
            if (arrayNumbers[probe] > target) {
                // for changing the value of highIndex, the guess should be decreased by 1 and assigned it to the 
                //      high index variable
                highIndex = probe - 1; 
            }
            // If the guess was lower to the target then change the lower index. 
            else if (arrayNumbers[probe] < target) {
                // for changing the value of highIndex, the guess should be increased by 1 and assigned it to the 
                //      high index variable
                lowIndex = probe + 1;
            }
            // If the guess was a match to the target 
            else {
                // then return the index where the target was found in the array. 
                return probe; 
            }
        }

        // finally, return -1 if the task was success but the element was not found. 
        // -1 represents the failed succession.
        return -1;
    }
}

/*
    * INTERPOLATION SEARCH *
     - Improvement over binary search used for "uniformly" distributed data "guesses" where a value might be based on the 
        calculated probe results. If probe is incorrect, search area is narrowed, and a new probe will be calculated.
        - This only means that were about to make guesses where the value might be stored using the target, low and high 
            index.
     - This was called improvement in binary search because it has more efficiency than the regular binary searching.
        
    - Average performance case: O(log(log(n)))
    - Worst performance case: O(n) = this only means that values increases exponentialy.

    * TAKE NOTE THAT IT IS WORKING WITH THE UNIFORMLY DISTRIBUTED DATA ONLY.
 */
