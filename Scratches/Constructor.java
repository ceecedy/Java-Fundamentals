class Phone {

    // The instance variables of the class phone.
    String brand_name;
    String model_no;
    double price;
    
   // Here is the implementation of the constructor in a class. 
   public Phone(String brand_name, String model_no, double price) {
        this.brand_name = brand_name;
        this.model_no = model_no;
        this.price = price;
   }
   // Above is the implementation of constructor with full usage of the instance variable.
   // Now we will implement a constructor using some instance variable only with the use of method overriding.

   public Phone(String model_no) {
        this.brand_name = "Apple Iphone";
        this.model_no = model_no;
        this.price = 1099.99;
   }
   
}

public class Constructor {

    public static void main(String[] args) {
        //Instanstiating the class and also assigning values to its constructors right immediately.
        Phone samsung = new Phone("Samsung Galaxy", "S23 Ultra", 899.99);
        // Printing the instance object of the class with declared values. 
        System.out.println("Phone is:");
        System.out.print(samsung.brand_name + "\n" + samsung.model_no + "\n" + "$ " + samsung.price + "\n\n");
        
        // Instantiating another object of the same class to show the method overriding.
        Phone iPhone = new Phone("15 Pro Ultra");
        // Printing the instance object of the class with declared values. 
        System.out.println("Phone is:");
        System.out.print(iPhone.brand_name + "\n" + iPhone.model_no + "\n" + "$ " + iPhone.price + "\n\n");

        // Trying to make a literal variables and pass it onto the instantiated object of phone class. 
        String brandName = "Google";
        String modelNo = "Pixel 7 Ultra";
        double price = 999.99;

        Phone pixel = new Phone(brandName, modelNo, price);

        // Now printing the pixel class values. 
        System.out.println("Phone is:");
        System.out.print(pixel.brand_name + "\n" + pixel.model_no + "\n" + "$ " + pixel.price + "\n\n");

    }   
    
}
/*
 * On this file, this will demonstrate the method overloading and constructors in oop.
 * Camel casing - it is a declaration on variable name which the casing is up and down.
        - e.g. brandNameConvention, brand_name_convention
 */
