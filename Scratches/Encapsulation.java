class Human {

    // setting a private setup of a variable is for encapsulation or for a protection of the data 
    // per class 
    private String name = "Cedric"; 
    private int age = 22;

    // This will enable the other class to access the private variable name.
    public String getname() {
        return name;
    }

    // This will enable the other class to access the private variable age.
    public int getage() {
        return age;
    }

    // This will enable the other class to set a value in te private variable name.
    public void setName(String name) {
        this.name = name;
    }

    // This will enable the other class to set a value in te private variable age.
    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    
    public static void main(String[] args) {
        //Instantiation of the class. 
        Human person = new Human(); 

        //putting some values in the variable instance of class Human. 
        // person.name = "Cedric";
        // person.age = 22; 
        /*
            When a data in a specific class is in a private mode, that can't be accessed right directly like what 
            we used to access the data (Refer to lines 24 - 25). By accessing the private variables in a specific class,
            this is what we should do:
        */
        String name = person.getname();
        int age = person.getage();

        //Trying to Print it on a regular method with variable. 
        System.out.println("Printing in a regular way:");
        System.out.print(name + " " + age + "\n\n");

        //Trying to Print it on a shortcut and more efficient in memory. 
        System.out.println("Printing in a efficient way.");
        System.out.print(person.getname() + " " + person.getage() + "\n\n");

        //Trying to set a new value in the private variable in other specific class. 
        person.setName("Ryan");
        person.setAge(22);

        System.out.println("Printing new values of Name and age:");
        System.out.print(person.getname() + " " + person.getage() + "\n\n");
    }
}


/*
 * Getters and setters in JAVA
        -  getters and setters are useful in OOP for several reasons:
            - It makes secure data.
            - and many more.
        - The use of "this" reserved/keyword in the oop will make you declare a value in a private variable. 
            -  Without using "this" keyword, you will only declare the setter value from the parameter on itself if it happens to
                parameter and the private variable had the same name.
            - Using this will help you not to pass the object again in its class itself.
            - this keyword will act as the current object to the class. 
 */