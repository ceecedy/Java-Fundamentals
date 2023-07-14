/*
    * This program is to show the need of Interfaces. And interfaces are implemented on this program.* 
 */

class Developer {

    String name;
    String progLang;
    int age;

    public void identity() {
        
        System.out.println("Programmer:");
        System.out.println("Name : " + name);
        System.out.println("Programming Language : " + progLang);
        System.out.println("Age : " + age);
    }

    public void unit(Computer unit) {

        System.out.print("The Unit this person having is ");
        unit.unit();
    }
    
}

interface Computer {

    void unit();
    int age = 25; // if no value declared, it would show an error.
}

class Laptop implements Computer{

    public void unit() {
        
        System.out.println("Macbook Pro 14 inch M3 pro");
    }
}

class Desktop implements Computer{

     public void unit() {
        
        System.out.println("iMac Pro 32 inch M3 pro max");
    }
}

public class InterfaceSample {
    
    public static void main(String[] args) {
        
        // Developer 1
        Developer ryan = new Developer();
        Computer desktop = new Desktop();

        ryan.name = "Ryan Lester U. Zamudio";
        ryan.progLang = "JavaScript";
        ryan.age = 22;

        // Since he needs a bigger screen...
        System.out.println();
        ryan.identity();
        ryan.unit(desktop);
        System.out.println();

        // Developer 2
        Developer aj = new Developer();
        Computer laptop = new Laptop();

        aj.name = "Amado Jeremiah U. Galzote";
        aj.progLang = "HTML AND CSS AND PHP";
        aj.age = 24;

         // Since he wants a portable workplace...
         System.out.println();
         aj.identity();
         aj.unit(laptop);
         System.out.println();
    }
}

/*
    - Interface is also known as public abstract. So any declaration of interfaces, the methods within it will be a public 
        abstract method. 
    - Interface are just a clue or blueprint of what needs to be done in order to make one function. It can be a template 
        also. 
    - when using a interface template, instead of extending it to inherit, it should use the keyword "implements".
    - Variables in the interfaces are final and static. 
    - Multiple interfaces declaration can be implemented in one class declaration. 
        e.g. class B implements X, Y, Z {}
    - Interface to interface inheritance is possible by using the keyword extends.
        e.g. interface A extends interface B {}
 */