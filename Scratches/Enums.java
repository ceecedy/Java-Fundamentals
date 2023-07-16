/*
    * This program is to demonstrate enums (enumeration) in java *
 */

// TO DECLARE ENUMS 
enum Day {

    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday, 
    Sunday

}

// ADVANCED DECLARATION OF ENUMS
enum Cars {

    // the open and close parenthesis is the declaration of default price.
    WRX_STI(2000),
    M2(4000),
    GTR(6000),
    AVENDATOR(8000),
    HURACAN(10000),
    ROADSTER(12000),
    VIOS();

    private int price; // This declaration of price needs to be done in order to have a default price on every objects of the enum.

    // multiple constructors made for objects in the enum.
    private Cars(int price) {

        this.price = price;
    }

    private Cars() {
        this.price = 500;
    }

    // getters and setters. 
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enums {

    public static void main(String[] args) {
        
        // Using enum to show how it works. 
        System.out.println("\n" + "Using enums how it is working:");
        Day day1 = Day.Monday;
        System.out.println(day1);

        // Using enum using conditioanl statements. 

        // If else and switch
        Day day2 = Day.Tuesday;
        Day day3 = Day.Wednesday;
        Day day4 = Day.Thursday;

        /*  
            The value to be compared needs to be called using class parsing method for this instance "Day.Tuesday" to 
            compare it to the certain variable that gets a value from enums using class parsing method. Refer to the 
            if condition below.  
        */
        System.out.println("\n" + "Using Enums on conditional statement if-else:");
        if (day2 == Day.Tuesday) 
            System.out.println("The Day is " + Day.Tuesday);

        if (day3 == Day.Thursday) 
            System.out.println("Unknown magic happens.");
        else
            System.out.println("The Day is Wednesday");

        if (day4 == Day.Thursday) 
            System.out.println("The day is " + Day.Thursday);

        /*
            In terms of switch conditional statements, switch is a bit smart. When passing the variable of type of a 
            specific enum, the cases will know the value inside the enum, so you don't have to put class parsing 
            method of enum to the cases but you can just directly put the values on the cases. Refer to the switch 
            condition below. 
         */
        System.out.println("\n" + "Using Enums on switch statement:");
        switch(day2) {
            case Monday:
                System.out.println("Today is Monday.");
                break;
            case Tuesday:
                System.out.println("Today is Tuesday.");
                break;
            case Wednesday:
                System.out.println("Today is Wednesday.");
                break;
            case Thursday:
                System.out.println("Today is Thursday.");
                break;
            case Friday:
                System.out.println("Today is Friday.");
                break;
            case Saturday:
                System.out.println("Today is Saturday.");
                break;
            case Sunday:
                System.out.println("Today is Sunday.");
                break;
        }

        // Getting all values in enum. 
        Day[] allDay = Day.values();
        /*
            The declaration above is a declaration of array of Day. When going to get all values inside of an enum, it 
            has to use method 'values()'. And that values method will give you an array of values so it should be stored
            in an array of the same enum type.
         */

        /*  
            for printing everything in the array, of course we need to use loops. Of course at this case we will use 
            enhanced for loops.
        */
        System.out.println("\n" + "Using enhanced for loop and getting all enum values using enum method:");
        for (Day day : allDay) {
            System.out.println("Days : " + day + "\n" +  "Index position : " + day.ordinal());
        }
        System.out.println();
        /*
            We have to declare the same type of enum in order to be able to parse the values of allDay array since allDay
            array is of type enum that is Day.

            * ANOTHER THING TO MENTION *
            - We can see that there's another method from enums that are used and that is the ordinal. Ordinal method 
                will give you the position of the certain value inside the enum.
            - Due to the usage of enhanced for loops, it generates anonymous inner class to make the loop possible to 
                allDay variable of type Day[];
        */

        // ******************************************************************************************************** //

        // INSTANTIATING THE ADVANCED ENUM 
        Cars subaru = Cars.WRX_STI;

        // Trying out the more advanced enhanced foreach 
        System.out.println("Printing the Enum cars with their prices and position:");
        for (Cars cars : Cars.values()) {
            System.out.println(cars + " : " +  cars.getPrice() + " : " + cars.ordinal());
        }

        System.out.println("Printing out subaru with its price.");
        if (subaru == Cars.AVENDATOR)
            System.out.println("This is not a Subaru Car.");
        else 
            System.out.println("Sanaol may WRX" + " : " + subaru.getPrice());
        System.out.println();

    }
}

/*
    * ENUMERATION (ENUMS) MORE EXPLANATIONS *
    - Enums is a type of class that holds a group of values. It is a special type of declaration that looks an array. 
    - Enums value are related to each other values. Just look at the example above, we can see that the values are the 
        dates of week. So they are called enum Day. 
    - The values of enums are constants. 
    - The index counting of enum starts with '0'.
    - Enum is a class but this can't be extended to any classes. 
    - Enum declarations by default extends Enum.class.

    * ADVANCED ENUMS *
    - When declaring enums, all the values of it is an object. Meaning for every values of enum, it can have specific 
        literal values that they can possess. This is possible by giving them directly the value. It is possible by 
        declaring a private variable inside also the same enum. 
    - But in order for the objects or values in enum to have a actual values it has to have a constructor of the same enum 
        using the declared variable inside the enum as parameter. 
    - In order to have interchangable values in the objects of enums, we can use encapsulation or getters and setters 
        implementation inside the enum and use the declared variable as parameter. 
    - We can use multiple constructors inside the enums to support the other objects or values in the enums to have 
        no values. 
    - Once you set a value to one object in the enum, all values should have declared values also. 
 */