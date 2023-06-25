class Calc {

    // method to add decimals
    public double add (double a, double b) {
        return a + b;
    }

    //method to add int
    public int add(int a, int b) {
        return a + b;
    }

    //method to subtract decimals
    public double subt(double a, double b) {
        return a - b;
    }

    //method to subtract 
    public int subt(int a, int b) {
        return a - b;
    }


}

// This is how you implement the inheritance. 
class OtherTwoOperations extends Calc {

    //method to multiply int
    public int mult(int a, int b) {
        return a * b;
    }

    //method to multiple double
    public double mult(double a, double b) {
        return a * b;
    }

    //method to divide int
    public int div(int a, int b) {
        return a / b;
    }

    //method to divide double
    public double div(double a, double b) {
        return a / b;
    }

    //method to perform the power of base using its exponent
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

}


public class BasicCalc {
    
    public static void main(String[] args) {
        // Instantiating the class Calc.
        Calc perf = new Calc();
        OtherTwoOperations inherit = new OtherTwoOperations();

        // Demonstration of addition
        System.out.println("Performing addition of int:");
        int a = 5, b = 5;
        System.out.println("Result : " + perf.add(a, b) + "\n");

        // If the addition is decimal. 
        double c = 5.5, d = 6.5, resultDouble = perf.add(c, d);
        
        // This is a condition to check if the result is a whole number or a decimal.
        if (resultDouble == (int)resultDouble) {
            System.out.println("Performing addition of Double:");
            System.out.println("Result : " + (int)resultDouble + "\n");  
        }
        else {
            System.out.println("Performing addition of Double:");
            System.out.println("Result : " + resultDouble + "\n");  
        }
            
        // Demonstration of Subtraction
        int e = 10, f = 7;
        System.out.println("Performing the Subtraction of int:");

        // Checking the two values if who has the greater value. 
        if (e > f)
            System.out.println("Result : " + perf.subt(e, f) + "\n");
        else    
            System.out.println("Result : " + perf.subt(f, e) + "\n");

        // If the subtraction is decimal
        double g = 3.3, h = 7.5;
        System.out.println("Performing the Subtraction of double:");

        // Checking the two values if who has the greater value. 
        if (g > h) {
            double res = perf.subt(g, h);

            //checking if the result is still having a decimal.
            if (res == (int)res)
                System.out.println("Result : " + (int)res + "\n");
            else 
                 System.out.println("Result : " + res + "\n");
        }
        else {
            double res = perf.subt(h, g);

            //checking if the result is still having a decimal.
            if (res == (int)res)
                System.out.println("Result : " + (int)res + "\n");
            else 
                 System.out.println("Result : " + res + "\n");
        }

        // Demonstration of Multiplication
        int i = 10, j = 10;
        System.out.println("Performing the Multiplication of int:");
        System.out.println("Result : " + inherit.mult(i, j) + "\n");

        // If the multiplication is decimal 
        double k = 10.2, l = 10.5, multRes = inherit.mult(k, l);

        if (multRes == (int)multRes) {
            System.out.println("Performing the Multiplication of double:");
            System.out.println("Result : " + (int)multRes + "\n");
        }
        else {
            System.out.println("Performing the Multiplication of double:");
            System.out.println("Result : " + (int)multRes + "\n");
        }
       
        //Demonstration of Division 
        int m = 50, n = 10;

        if (m > n) {
            System.out.println("Performing the Division of int:");
            System.out.println("Result : " + inherit.div(m, n) + "\n");
        }
        else {
            System.out.println("Performing the Division of int:");
            System.out.println("Result : " + inherit.div(n, m) + "\n");
        }

        // If the division is decimal. 

        double o = 7.5, p = 2.5;

        if (o > p) {
            double divRes = inherit.div(o, p);

            //checking if the division result is equal to int. 
            if (divRes == (int)divRes) {
                System.out.println("Performing the Division of double:");
                System.out.println("Result : " + (int)divRes + "\n");
            }
            else {
                System.out.println("Performing the Division of double:");
                System.out.println("Result : " + divRes + "\n");
            }
        }
        else {
            double divRes = inherit.div(p, o);

            //checking if the division result is equal to int. 
            if (divRes == (int)divRes) {
                System.out.println("Performing the Division of double:");
                System.out.println("Result : " + (int)divRes + "\n");
            }
            else {
                System.out.println("Performing the Division of double:");
                System.out.println("Result : " + divRes + "\n");
            }
        }
    }
}

/*
 * This file will demonstrate the inheritance feature of OOP. 
    - To implement inheritance in a class, it must use a keyword "extends" right after the name of the class 
        and followed by the class to be extended from. 
        e.g. - "class AdvCalc extends Calc"
 */

 