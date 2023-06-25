public class VeryAdvCalc extends OtherTwoOperations{

    public static void main(String[] args) {
        VeryAdvCalc newInherit = new VeryAdvCalc();
        VeryAdvCalc newInheritTwo = new VeryAdvCalc();

        // Printing out the power function from other two operations that is in the first level of inheritance.
        System.out.println("\nThe power of 5 raised to 2 is: \n" + "Result : " + newInherit.power(5.0, 2.0) + "\n\n");

        // Printing out the addition method from the Parent class. 
        System.out.println("5 plus 2 is: \n" + "Result : " + newInheritTwo.add(5, 2) + "\n\n");

        // Overall, this file is in the second level inheritance that has the methods of both Calc and OtherTwoOperations
        // classes.
    }
}


/*
 * This will perform multi-level inheritance. 
        - Note that the OtherTwoOperations class is inherited in the Calc class and this Class VeryAdvCalc will inherit
        OtherTwoOperations Class that has the Parent Calc class. Basically this VeryAdvCalc will have the methods of 
        OtherTwoOperation class and Calc Parent Class. 


    class ScieCal extends OtherTwoOperations {
    
    //method to perform the power of base using its exponent
    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}
 */