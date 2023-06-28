

// These import declaration is to include the packages needed for this java file. 
import packages.Animals;
import packages.Vehicles;

public class Package {
    
    public static void main(String[] args) {
        
        //Instantiating first the Animals in the package. 
        Animals.cat Cat = new Animals.cat();
        Animals.dog Dog = new Animals.dog();
        Animals.kangaroo Kangaroo = new Animals.kangaroo();

        // Calling the methods of what the animals can do on their own class.
        Cat.catMessage();
        Dog.dogMessage();
        Kangaroo.kangarooMessage();

        //Instantiating the Vehicles in the package. 
        Vehicles.motor motor = new Vehicles.motor();
        Vehicles.car car = new Vehicles.car();

        motor.capacity();
        car.capability();
        car.capacity();
    }
}

/*
    * This code will demonstrate the use of packages. 
        - In packages, it is essential to make the nested classes to make it static
            so that it is enabled to be instantiate in particular outside java files. 
        
 */
