
    // this is a superclass or parent class.
    class Vehicle {

        String brandName;
        int speed;

        // Declaring two constructors; one is default, one has parameters. 

        // This declaration of constructor will be called using this()
        public Vehicle(String brandName, int speed) {
            //Printing the value from this() in default constructor.
            System.out.println("\n" + "Vehicle: " + "\n" + brandName + "\n" + speed);
            System.out.println("I'm from Motor class");
        }

        // This declaration of constructor will be the default constructor.
        public Vehicle() {
            this("Toyota Supra", 400);
            // After the this being called. It will continue to execute the remaining lines of commands in this default
            // constructor.
            System.out.println("\n" + "Back to default vehicle." + "\n");
        }

    }

    // this is a subclass or a child class that extends the superclass. 
    class Motor extends Vehicle {
        String brandName;
        int speed;

        // Making two constructors; one is default, one is parameterized. 

        // This declaration of constructor will be the default constructor of this subclass.
        public Motor() {
            
            // This superclass is capable of calling the parameterized constructor of the superclass. 
            super("BMW M2", 300);
            // After the this being called. It will continue to execute the remaining lines of commands in this default
            // constructor.
            System.out.println("But this the default Motor class" + "\n");
        }

        // This declaration of constructor will be the parameterized constructor of this subclass.
        public Motor(String brandName, int speed) {

            // This superclass is capable of calling the parameterized constructor of the superclass. 
            super(brandName, speed);
            System.out.println("\n" + "Motor: " + "\n" + brandName + "\n" + speed);
            System.out.println("But I'm still at Motor constructor but parameterized." + "\n");
        }
    }

    class SuperAndThis {
        
        public static void main(String[] args) {
            //Instantiating the default constructor of the superclass vehicle. 
            Vehicle Car = new Vehicle();

            // Instantiating the default constructor of the subclass motor 
            Motor motor = new Motor();
            
            Motor motor2 = new Motor("Kawasaki", 360);

        }
    }

    /*
    * This program will demonstrate how the 'this()' and 'super()' works. 
        * this()
            - It refers to the current instance of a class.
            - Used to invoke another constructor within the same class. 
            * Keypoint of using this():
                - It must be the first statement in a constructor.
                - It cannot be used to call methods.
                - It cannot be used outside the constructor.
        * super()
            - It refers to the superclass or what we known the parent class. 
            - Used to invoke the constructors of superclass or the parent class depending on the parameters.
            - Mainly used in inheritance. 
            * Keypoints of using super():
                - It must be on the first statement in a subclass constructor. 
                - It cannot be used to call methods.
                - It cannot be used outside the constructor.

        * In java, when calling out super, it 
    */